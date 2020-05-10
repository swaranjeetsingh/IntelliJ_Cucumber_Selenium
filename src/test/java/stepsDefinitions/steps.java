package stepsDefinitions;

import com.aventstack.extentreports.GherkinKeyword;
import cucumber.api.java.en.*;
//import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Account;
import pageObjects.Deposit;
import pageObjects.LoginPage;
import pageObjects.Withdrawal;
import utils.Base;

public class steps extends Base {
    LoginPage loginPage;
    Account account;
    Deposit deposit;
    Withdrawal withdrawal;

    private Base base;
    public steps(Base base) {
        this.base = base;
    }

    @Given("Open chrome browser")
    public void open_chrome_browser() {
        base.driver.manage().window().maximize();
        base.driver.manage().deleteAllCookies();
    }

    @Then("Enter valid url \"([^\"]*)\" to open application")
    public void enter_valid_url_to_open_application(String string) throws ClassNotFoundException {
        scenarioLog.createNode(new GherkinKeyword("Then"), "Enter valid url to open application");
        base.driver.get(string);
    }

    @When("After launching application enter username \"([^\"]*)\" and password \"([^\"]*)\"")
    public void after_launching_application_enter_username_and_password(String string, String string2) throws ClassNotFoundException {
        scenarioLog.createNode(new GherkinKeyword("When"), "launching application enter username and password");
        loginPage = PageFactory.initElements(base.driver, LoginPage.class);
        loginPage.login(string, string2);
    }

    @When("After that enter click on login button")
    public void after_that_enter_click_on_login_button() throws ClassNotFoundException {
        scenarioLog.createNode(new GherkinKeyword("When"), "After that enter click on login button");
        loginPage.loginButtonElement();
    }

    @Then("Get title of the current page \"([^\"]*)\"")
    public void get_title_of_the_current_page(String string) throws ClassNotFoundException {
        scenarioLog.createNode(new GherkinKeyword("Then"), "Get title of the current page");
        Assert.assertEquals(base.driver.getTitle(), string);
    }

    @Then("Close the application and browser")
    public void close_the_application_and_browser() throws ClassNotFoundException {
        scenarioLog.createNode(new GherkinKeyword("Then"), "Close the application and browser");
        base.driver.close();
    }

    // add new account
    @Then("Click on new account link")
    public void click_on_new_account_link() throws ClassNotFoundException {
        scenarioLog.createNode(new GherkinKeyword("Then"), "Click on new account link");
        account = PageFactory.initElements(base.driver, Account.class);
        account.setNewAccountLink();
    }

    @Then("fill new account form")
    public void fill_new_account_form() throws ClassNotFoundException {
        scenarioLog.createNode(new GherkinKeyword("Then"), "Fill new account form");
        account.setCustomerIDTextBox("77329");
        account.setAccountTypeDropDown("Savings");
        account.setInitialAmountTextBox("1000");
    }

    @Then("Click on submit button")
    public void click_on_submit_button() throws ClassNotFoundException {
        scenarioLog.createNode(new GherkinKeyword("Then"), "Click on submit button");
        account.setSubmitButton();
    }

    @Then("Verify success message with \"([^\"]*)\"")
    public void verify_success_message_with(String string) throws ClassNotFoundException {
        scenarioLog.createNode(new GherkinKeyword("Then"), "Verify success message");
        Assert.assertTrue(base.driver.getPageSource().contains(string));
    }

    @When("Click on deposit link")
    public void click_on_deposit_link() throws ClassNotFoundException {
        scenarioLog.createNode(new GherkinKeyword("When"), "Click on deposit link");
        deposit = PageFactory.initElements(base.driver, Deposit.class);
        deposit.setDepositLink();
    }

    @Then("Add details of amount to be submitted")
    public void add_details_of_amount_to_be_submitted() throws ClassNotFoundException {
        scenarioLog.createNode(new GherkinKeyword("Then"), "Set account number from which withdrawal is to done");
        deposit.setAccountNumber("78183");
        scenarioLog.createNode(new GherkinKeyword("Then"), "Set amount to be withdrawn");
        deposit.setAmount("1000");
        scenarioLog.createNode(new GherkinKeyword("Then"), "Added description");
        deposit.addDescription("by cash");
    }

    @Then("Click on deposit submit button")
    public void click_on_deposit_submit_button() throws ClassNotFoundException {
        scenarioLog.createNode(new GherkinKeyword("Then"), "Click on deposit submit button");
        deposit.setDepositSubmitButton();
    }

    @When("Click on withdrawal link")
    public void clickOnWithdrawalLink() throws ClassNotFoundException {
        scenarioLog.createNode(new GherkinKeyword("When"), "Click on withdrawal link");
        withdrawal = PageFactory.initElements(base.driver, Withdrawal.class);
        withdrawal.setWithdrawalLink();
    }

    @Then("Add details of amount to be withdraw")
    public void addDetailsOfAmountToBeWithdraw() throws ClassNotFoundException {
        scenarioLog.createNode(new GherkinKeyword("Then"), "Add details of amount to be withdraw");
        withdrawal.setAccountNumberInputBox("78183");
        withdrawal.setAmountInputBox("2000");
        withdrawal.setDescriptionInputBox("To Cash");
    }

    @And("Click on withdrawal submit button")
    public void clickOnWithdrawalSubmitButton() throws ClassNotFoundException {
        scenarioLog.createNode(new GherkinKeyword("And"), "Click on withdrawal submit button");
        withdrawal.setSubmitButton();
    }

}
