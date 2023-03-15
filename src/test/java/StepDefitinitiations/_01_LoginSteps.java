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
    WebDriverWait wait=new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(30));
    @Given("Navigate to Campus")
    public void navigateToCampus() {
        BasicDriver.getDriver().get("https://test.mersys.io/");
        BasicDriver.getDriver().manage().window().maximize();
    }

    @When("Enter username and password")
    public void enterUsernameAndPassword() {
        wait.until(ExpectedConditions.visibilityOf(dialogContent.getLoginUsername()));
        dialogContent.getLoginUsername().sendKeys("turkeyts");
        dialogContent.getLoginPassword().sendKeys("TechnoStudy123");
    }

    @And("Click on Login Button")
    public void clickOnLoginButton() {
      dialogContent.getLoginButton().click();
    }

    @Then("User should login Successfully")
    public void userShouldLoginSuccessfully() {
        wait.until(ExpectedConditions.visibilityOf(dialogContent.getDashBoardHeader()));
        Assert.assertTrue(dialogContent.getDashBoardHeader().isDisplayed());

    }
}
