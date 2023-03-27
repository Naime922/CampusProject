package StepDefinitions;

import Utilities.BasicDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {
    @Before
    public void beforeScenario(){
        System.out.println("Scenario has started");
    }

    @After
    public void afterScenario(Scenario scenario){
        if (scenario.isFailed()){

           final byte[] byteImage=((TakesScreenshot) BasicDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage,"image/png",scenario.getName());

//            TakesScreenshot takesScreenshot= (TakesScreenshot) BasicDriver.getDriver();
//            File file=takesScreenshot.getScreenshotAs(OutputType.FILE);
//            LocalDateTime timeOfError=LocalDateTime.now();
//            DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMddyyyyHHmmss");
//           try {
//                FileUtils.copyFile(file,new File("src/test/java/ScreenShots/screenshot"+timeOfError.format(formatter)+".png"));
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
        }
        BasicDriver.quitDriver();
        System.out.println("Scenario has ended");
    }
//    @BeforeStep
//    public void beforeStep(){
//        System.out.println("Step has started");
//    }
//
//    @AfterStep
//    public void afterStep(){
//        System.out.println("Step has ended");
//    }
}
