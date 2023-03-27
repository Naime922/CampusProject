package StepDefinitions;

import Pages.DialogContent;
import Pages.Navigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _02_CountrySteps {

    DialogContent dc=new DialogContent();
    Navigation nv=new Navigation();
    @And("Navigate to County page")
    public void navigateToCountyPage() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParameterBtn());
        nv.clickMethod(nv.getCountriesBtn());
    }

    @When("Create a new country")
    public void createANewCountry() {
        dc.clickMethod(dc.getAddButton());
        dc.sendKeysMethod(dc.getFormNameInput(),"USA93");
        dc.sendKeysMethod(dc.getFormCodeInput(),"U45");
        dc.clickMethod(dc.getSaveButton());
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainText(dc.getSuccessMessage(),"successfully");
    }

    @When("Delete country")
    public void deleteCountry() throws InterruptedException {
        dc.sendKeysMethod(dc.getNameSearch(),"USA93");
        dc.sendKeysMethod(dc.getCodeSearch(),"U45");
        dc.clickMethod(dc.getSearchButton());
        dc.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("ms-delete-button[class='ng-star-inserted']"),10));
        dc.clickMethod(dc.getDeleteButton());
        dc.clickMethod(dc.getConfirmDeleteButton());


    }

    @And("click on add button")
    public void clickOnAddButton() {
        dc.clickMethod(dc.getAddButton());
    }

    @When("Enter country name as {string} and code as {string}")
    public void enterCountryNameAsAndCodeAs(String arg0, String arg1) {
        dc.sendKeysMethod(dc.getFormNameInput(),arg0);
        dc.sendKeysMethod(dc.getFormCodeInput(),arg1);
    }

    @And("click on save button")
    public void clickOnSaveButton() {
      dc.clickMethod(dc.getSaveButton());
    }
}
