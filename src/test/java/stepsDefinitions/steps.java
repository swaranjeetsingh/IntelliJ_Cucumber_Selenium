package stepsDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Account;
import pageObjects.Deposit;
import pageObjects.LoginPage;
import utils.Base;

public class steps extends Base {
    LoginPage loginPage;
    Account account;
    Deposit deposit;

    private Base base;
    public steps(Base base) {
        this.base = base;
    }

    @Given("Open chrome browser")
    public void open_chrome_browser() {
        base.driver.manage().window().maximize();
        base.driver.manage().deleteAllCookies();
    }

    @Then("Enter valid url {string} to open application")
    public void enter_valid_url_to_open_application(String string) {
        base.logger.info("open application using url: " + string);
        base.driver.get(string);
    }

    @When("After launching application enter username {string} and password {string}")
    public void after_launching_application_enter_username_and_password(String string, String string2) {
        base.logger.info("enter login credentials");
        loginPage = PageFactory.initElements(base.driver, LoginPage.class);
        loginPage.login(string, string2);
    }

    @When("After that enter click on login button")
    public void after_that_enter_click_on_login_button() {
        base.logger.info("click on login button");
        loginPage.loginButtonElement();
    }

    @Then("Get title of the current page {string}")
    public void get_title_of_the_current_page(String string) {
        base.logger.info("validation of page title");
        Assert.assertEquals(base.driver.getTitle(), string);
    }

    @Then("Close the application and browser")
    public void close_the_application_and_browser() {
        base.logger.info("close browser");
        base.driver.close();
    }

    // add new account
    @Then("Click on new account link")
    public void click_on_new_account_link() {
        base.logger.info("click on new account link");
        account = PageFactory.initElements(base.driver, Account.class);
        account.setNewAccountLink();
    }

    @Then("fill new account form")
    public void fill_new_account_form() {
        base.logger.info("fill new account details");
        account.setCustomerIDTextBox("77329");
        account.setAccountTypeDropDown("Savings");
        account.setInitialAmountTextBox("1000");
    }

    @Then("Click on submit button")
    public void click_on_submit_button() {
        base.logger.info("click on add account button");
        account.setSubmitButton();
    }

    @Then("Verify success message with {string}")
    public void verify_success_message_with(String string) {
        base.logger.info("validation test of successfull added account");
        Assert.assertTrue(base.driver.getPageSource().contains(string));
    }

    /*@When("After test is complete capture screenshot")
    public void after_test_is_complete_capture_screenshot() {
        base.logger.info("capture screenshot");
        captureScreenShot = PageFactory.initElements(base.driver, CaptureScreenShot.class);
        captureScreenShot.takeScreenShot();
    }*/

    @When("Click on deposit link")
    public void click_on_deposit_link() {
        base.logger.info("click on deposit link");
        deposit = PageFactory.initElements(base.driver, Deposit.class);
        deposit.setDepositLink();
    }

    @Then("Add details of amount to be submitted")
    public void add_details_of_amount_to_be_submitted() {
        base.logger.info("enter account number");
        deposit.setAccountNumber("78183");
        base.logger.info("add amount to be deposited");
        deposit.setAmount("1000");
        base.logger.info("added description");
        deposit.addDescription("by cash");
    }

    @Then("Click on deposit submit button")
    public void click_on_deposit_submit_button() {
        base.logger.info("click on add deposit button");
        deposit.setDepositSubmitButton();
    }

}
