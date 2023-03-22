package StepDefitinitiations;

import Pages.DialogContent;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps {

    DialogContent dialogContent=new DialogContent();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        BasicDriver.getDriver().get("https://test.mersys.io/");
        BasicDriver.getDriver().manage().window().maximize();
    }

    @When("Enter username and password")
    public void enterUsernameAndPassword() {
        dialogContent.sendKeysMethod(dialogContent.getLoginUsername(),"turkeyts");
        dialogContent.sendKeysMethod(dialogContent.getLoginPassword(),"TechnoStudy123");
    }

    @And("Click on Login Button")
    public void clickOnLoginButton() {
      dialogContent.clickMethod(dialogContent.getLoginButton());
    }

    @Then("User should login Successfully")
    public void userShouldLoginSuccessfully() {
       dialogContent.waitUntilVisible(dialogContent.getDashBoardHeader());
        Assert.assertTrue(dialogContent.getDashBoardHeader().isDisplayed());

    }
}
