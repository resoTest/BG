package com.testingshshtra.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.testingshashtra.commonmethods.CommonOperations_Button;

import com.testingshashtra.utility.Constance;
import com.testingshashtra.utility.WaitFor;

public class AddBankPage extends CommonOperations_Button {
	private static final Logger LOG = Logger.getLogger(AddBankPage.class);

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
	private By accountName_error  =By.cssSelector("#account_name-error");
	private By accountNo_error  =By.cssSelector("#account_no-errorr");
	private By accountType_error  =By.cssSelector("#bank_account_type-error");
	private By ifscCode_error  =By.cssSelector("#ifsc_code-error");
	private By micrCode_error  =By.cssSelector("#micr_code-error");

	public String getText_BankName_Error() {
		return Constance.driver.findElement(bankName_error).getText();
		
	}
	public String getText_AccountName_Error() {
		return Constance.driver.findElement(accountName_error).getText();
		
	}
	public String getText_AccountNo_Error() {
		return Constance.driver.findElement(accountNo_error).getText();
	}
	public String getText_AccountTyep_Error() {
		return Constance.driver.findElement(accountType_error).getText();
		
	}
	public String getText_IFCSCode_Error() {
		return Constance.driver.findElement(ifscCode_error).getText();
		
	}
	public String getText_MICRCode_Error() {
		return Constance.driver.findElement(micrCode_error).getText();
		
	}
	
	
	public void clickOnBankMenu() {
		WaitFor.visibilityOfElement(banks);
		Constance.driver.findElement(banks).click();
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


	public void enterBankName(String BankName) {
		Constance.driver.findElement(getBankName()).sendKeys(BankName);
		LOG.info("Entering Bank Name " + BankName);
	}

	public void enterAccountName(String Accountname) {
		Constance.driver.findElement(getAccountName()).sendKeys(Accountname);
		LOG.info("Entering Account Name " + Accountname);

	}

	public void enterAccountNumber(String AccountNumber) {
		Constance.driver.findElement(getAccountNo()).sendKeys(AccountNumber);
		LOG.info("Entering  Account number   " + AccountNumber);
	}

	public void selectAccountType(String AccountType) {
		Select select = new Select(Constance.driver.findElement(getAccountType()));
		select.selectByVisibleText(AccountType);
		LOG.info("Selecting  Account Type  " + AccountType);
	}

	public void enterIFSCCode(String IFSCCode) {
		Constance.driver.findElement(getIfscCode()).sendKeys(IFSCCode);
		LOG.info("Entering IFSC Code  " + IFSCCode);

	}

	public void enterMICRCode(String MICRCode) {
		Constance.driver.findElement(getMicrCode()).sendKeys(MICRCode);
		LOG.info("Entering MICR Code  " + MICRCode);
	}

	
	public String getSucessMessageText() {
		LOG.info("Get Success Message");
		return Constance.driver.findElement(getSucessMessage()).getText();

	}

	@Override
	public void clickOnAddButton() {
		LOG.info("Click On  Add Bank Button");
		Constance.driver.findElement(getBankBtn()).click();
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


}
