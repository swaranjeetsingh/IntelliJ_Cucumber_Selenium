package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.WaitHelper;

public class Withdrawal {
    WebDriver driver;
    WaitHelper waitHelper;

    public Withdrawal(WebDriver driver) {
        this.driver = driver;
        waitHelper = new WaitHelper(driver);
    }
    private @FindBy(how = How.LINK_TEXT, using = "Withdrawal")@CacheLookup
    WebElement withdrawalLink;
    private @FindBy(how = How.NAME, using = "accountno")@CacheLookup WebElement accountNumberInputBox;
    private @FindBy(how = How.NAME, using = "ammount")@CacheLookup WebElement amountInputBox;
    private @FindBy(how = How.NAME, using = "desc")@CacheLookup WebElement descriptionInputBox;
    private @FindBy(how = How.NAME, using = "AccSubmit")@CacheLookup WebElement submitButton;

    public void setWithdrawalLink() {
        waitHelper.explicitWaitTime(withdrawalLink, 10);
        withdrawalLink.click();
    }

    public void setAccountNumberInputBox(String accountNumber) {
        waitHelper.explicitWaitTime(accountNumberInputBox, 10);
        accountNumberInputBox.sendKeys(accountNumber);
    }

    public void setAmountInputBox(String amount) {
        waitHelper.explicitWaitTime(amountInputBox, 10);
        amountInputBox.sendKeys(amount);
    }

    public void setDescriptionInputBox(String description) {
        waitHelper.explicitWaitTime(descriptionInputBox, 10);
        descriptionInputBox.sendKeys(description);
    }

    public void setSubmitButton() {
        waitHelper.explicitWaitTime(submitButton, 10);
        submitButton.click();
    }
}
