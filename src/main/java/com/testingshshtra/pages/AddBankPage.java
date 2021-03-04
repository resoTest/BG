package com.testingshshtra.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.testingshashtra.commonmethods.CommonOperations_Button;

import com.testingshashtra.utility.Constance;
import com.testingshashtra.utility.WaitFor;
import com.testingshatra.keywords.UIKeywords;
import com.testingsshatra.exceptions.ElementNotFound;

public class AddBankPage extends CommonOperations_Button {
	private static final Logger LOG = Logger.getLogger(AddBankPage.class);
    UIKeywords keywords = new UIKeywords(); 
	private By banks = By.xpath("//a[text()='Banks ']");
	private By bankBtn = By.cssSelector("#add_btn");
	private By bankName = By.cssSelector("#bank_name");
	private By accountName = By.cssSelector("#account_name");
	private By accountNo = By.cssSelector("#account_no");
	private By accountType = By.cssSelector("#bank_account_type");// select dropdown
	private By ifscCode = By.cssSelector("#ifsc_code");
	private By micrCode = By.cssSelector("#micr_code");
	private By submitBtn = By.cssSelector("input[value='Submit']");
	private By sucessMessage = By.cssSelector("div[class='swal2-content']");

	private By okMessageBtn = By.cssSelector("button[class='swal2-confirm styled']");

	private By bankName_error = By.cssSelector("#bank_name-error");
	private By accountName_error = By.cssSelector("#account_name-error");
	private By accountNo_error = By.cssSelector("label#account_no-error");
	private By accountType_error = By.cssSelector("#bank_account_type-error");
	private By ifscCode_error = By.cssSelector("#ifsc_code-error");
	private By micrCode_error = By.cssSelector("#micr_code-error");

	public String getText_BankName_Error() {
		return keywords.doGetText(bankName_error);

	}

	public String getText_AccountName_Error() {
			return keywords.doGetText(accountName_error);
		
	}

	public String getText_AccountNo_Error() {
		return keywords.doGetText(accountNo_error);
		
	}

	public String getText_AccountTyep_Error() {
		return keywords.doGetText(accountType_error);
		
	}

	public String getText_IFCSCode_Error() {
		return keywords.doGetText(ifscCode_error);
		
	}

	public String getText_MICRCode_Error() {
		return keywords.doGetText(micrCode_error);
		
	}

	public void clickOnBankMenu() {
		WaitFor.visibilityOfElement(banks);
		keywords.click(banks);
		
	}
	public void enterBankName(String BankName) {
		keywords.doSendkeys(bankName, BankName);
		LOG.info("Entering Bank Name " + BankName);
	}

	public void enterAccountName(String Accountname) {
		keywords.doSendkeys(accountName, Accountname);
			LOG.info("Entering Account Name " + Accountname);

	}

	public void enterAccountNumber(String AccountNumber) {
		keywords.doSendkeys(accountNo, AccountNumber);
		LOG.info("Entering  Account number   " + AccountNumber);
	}

	public void selectAccountType(String AccountType) {
		keywords.selectFromDropDownByVisibleText(keywords.getWebElement(accountType), AccountType);
		LOG.info("Selecting  Account Type  " + AccountType);
	}

	public void enterIFSCCode(String IFSCCode) {
		keywords.doSendkeys(ifscCode, IFSCCode);
		LOG.info("Entering IFSC Code  " + IFSCCode);

	}

	public void enterMICRCode(String MICRCode) {
		keywords.doSendkeys(micrCode, MICRCode);
		LOG.info("Entering MICR Code  " + MICRCode);
	}

	public String getSucessMessageText() {
		LOG.info("Get Success Message");
		return Constance.driver.findElement(getSucessMessage()).getText();

	}

	@Override
	public void clickOnAddButton() {
		LOG.info("Click On  Add Bank Button");
		keywords.click(bankBtn);
	}

	@Override
	public void clickOnDeleteButton() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickOnEditButton() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickOnSubmitButton() {
		Constance.driver.findElement(submitBtn).click();
		LOG.info("Click on Submit button");
	}

	@Override
	public void clickOnCancelButton() {

	}

	@Override
	public void clickOnOKButton() {
		Constance.driver.findElement(okMessageBtn).click();
		LOG.info("Click on OK button");
	}

	public By getBankBtn() {
		return bankBtn;
	}

	public void setBankBtn(By bankBtn) {
		this.bankBtn = bankBtn;
	}

	public By getSucessMessage() {
		return sucessMessage;
	}

	public void setSucessMessage(By sucessMessage) {
		this.sucessMessage = sucessMessage;
	}

	public By getBankName() {
		return bankName;
	}

	public void setBankName(By bankName) {
		this.bankName = bankName;
	}

	public By getAccountName() {
		return accountName;
	}

	public void setAccountName(By accountName) {
		this.accountName = accountName;
	}

	public By getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(By accountNo) {
		this.accountNo = accountNo;
	}

	public By getAccountType() {
		return accountType;
	}

	public void setAccountType(By accountType) {
		this.accountType = accountType;
	}

	public By getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(By ifscCode) {
		this.ifscCode = ifscCode;
	}

	public By getMicrCode() {
		return micrCode;
	}

	public void setMicrCode(By micrCode) {
		this.micrCode = micrCode;
	}

}
