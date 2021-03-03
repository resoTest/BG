package com.testingshashtra.stepdefination;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.testingshashtra.utility.WaitFor;
import com.testingshshtra.pages.AddBankPage;
import com.testingshshtra.pages.MasterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddBankTest {
	MasterPage masterpage = new MasterPage();
	AddBankPage addbank = new AddBankPage();
	private static final Logger LOG = Logger.getLogger(AddBankTest.class);
	private static String Actual ; 
	@Given("click on bnak Menu")
	public void click_on_bnak_menu() {
		WaitFor.pageLoad();
		masterpage.masterMenuMouseHover();
		LOG.info("Master Menu Clicked");
		addbank.clickOnBankMenu();
		LOG.info("Bank Sub Menu Clicked");
		

	}

	@Given("click on add bank button")
	public void click_on_add_bank_button() {
		LOG.info("Waiting For Visibility Add Bank button");
		
		WaitFor.visibilityOfElement(addbank.getBankBtn());
		addbank.clickOnAddButton();
		LOG.info("Click on  Add Bank button");
		
	}


@Then("Enter {string} , {string},{string},{string} ,{string},{string}")
public void enter(String bankName, String accountName, String accountNo, String accountType, String ifscCode, String micrCode) {
   addbank.enterBankName(bankName);
   addbank.enterAccountName(accountName);
   addbank.enterAccountNumber(accountNo);
   addbank.selectAccountType(accountType);
   addbank.enterIFSCCode(ifscCode);
   addbank.enterMICRCode(micrCode);
}


	@Then("Click on submit button")
	public void click_on_submit_button() {
		LOG.info("Click on Submit button");
		addbank.clickOnSubmitButton();
	}

	@Then("Assert Result in POPUP window")
	public void assert_result() {
		LOG.info("Asserting Result");
		WaitFor.visibilityOfElement(addbank.getSucessMessage());;
		Actual = addbank.getSucessMessageText();
		Assert.assertTrue(Actual.equals("Bank Added."));
		
	}
	@Then("Assert Result in Label")
	public void Assert_Result_in_Label() {
		LOG.info("Asserting Error in Label ");
		Actual = addbank.getText_BankName_Error();
		if(addbank.getText_BankName_Error().isEmpty()) {
			 addbank.clickOnSubmitButton();	
		     addbank.clickOnOKButton();
		}else {
		    
		     LOG.info("Message Get "+addbank.getText_BankName_Error());
			 Assert.assertTrue(Actual.contains("Please Enter Bank Name"));
		}
		
	}
	


}
