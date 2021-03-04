package com.testingshashtra.stepdefination;

import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.testingshashtra.utility.WaitFor;
import com.testingshatra.keywords.UIKeywords;
import com.testingshshtra.pages.AddBankPage;
import com.testingshshtra.pages.MasterPage;
import com.testingsshatra.exceptions.ElementNotFound;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddBankTest {
	MasterPage masterpage = new MasterPage();
	AddBankPage addbank = new AddBankPage();
	UIKeywords keyword = new UIKeywords();
	private static final Logger LOG = Logger.getLogger(AddBankTest.class);
	private static String Actual;

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
	public void enter(String bankName, String accountName, String accountNo, String accountType, String ifscCode,
			String micrCode) {
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
		WaitFor.visibilityOfElement(addbank.getSucessMessage());
		;
		Actual = addbank.getSucessMessageText();
		Assert.assertTrue(Actual.equals("Bank Added."));

	}

	@Then("Assert  Result  of bank name in Label")
	public void Assert_Result_BankName_in_Label() {
		LOG.info("Asserting Error in Label ");
		Actual = addbank.getText_BankName_Error();
		if (!Actual.isEmpty()) {
			LOG.info("Message Get " + Actual);
			Assert.assertTrue(Actual.contains("Please Enter Bank Name"));
		}

	}

	@Then("Assert  Result  of account name in Label")
	public void Assert_Result_accountName_in_Label() {
		LOG.info("Asserting Error in Label ");
		Actual = addbank.getText_AccountName_Error();
		if (!Actual.isEmpty()) {
			LOG.info("Message Get " + Actual);
			Assert.assertTrue(Actual.contains("Please Enter Account Name"));
		}
	}

	@Then("Assert  Result  of account Number in Label")
	public void assert_result_of_account_number_in_label() {
		LOG.info("Asserting Error in Label ");
		try {
			Actual = addbank.getText_AccountNo_Error();
		} catch (NoSuchElementException e) {
			e.getMessage();
			e.printStackTrace();
		}

		if (!Actual.isEmpty()) {
			int len = keyword.doGetAttribute(addbank.getAccountNo()).length();
			if (len < 5 && !(len == 0)) {
				Actual = addbank.getText_AccountNo_Error();
				LOG.info("length of text is less than 5   And : " + Actual);
				Assert.assertTrue(Actual.contains("Account Number Must Be Of 5 Digits"));

			}
			if (len > 20) {
				Actual = addbank.getText_AccountNo_Error();
				LOG.info("length of text is more than 20    And :" + Actual);
				Assert.assertTrue(Actual.contains("Account Number Must Be Of 20 Digits"));

			}

		} else {
			Actual = addbank.getText_AccountNo_Error();
			LOG.info("Account eihter blank or  contains Characters :  " + Actual);
			String Expected = "Please Enter Your Account Number";
			Assert.assertEquals(Actual, Expected);

		}

	}

	@Then("Assert  Result  of account type in Label")
	public void Assert_Result_of_account_type_in_Label() {
		LOG.info("Asserting Error in Label ");
		Actual = addbank.getText_AccountTyep_Error();
		if (!Actual.isEmpty()) {
			LOG.info("Message Get " + Actual);
			Assert.assertTrue(Actual.contains("Please Enter Bank Account Type"));
		}
	}

	@Then("Assert  Result  of IFSC code in Label")
	public void Assert_Result_of_IFSC_code_in_Label() {
		LOG.info("Asserting Error in Label ");
		try {
            WaitFor.visibilityOfElement(addbank.getIfscCode());
			Actual = addbank.getText_IFCSCode_Error();
		} catch (NoSuchElementException e) {
			e.getMessage();
			e.printStackTrace();
		}
		if (!Actual.isEmpty()) {
			int len = keyword.doGetAttribute(addbank.getIfscCode()).length();

			if (len < 8 && !(len == 0)) {
				Actual = addbank.getText_IFCSCode_Error();
				LOG.info("length of text is less than 8   And : " + Actual);
				Assert.assertTrue(Actual.contains("IFSC Code Must Be Of 8 Digits"));

			}
			if (len > 11) {
				Actual = addbank.getText_IFCSCode_Error();
				LOG.info("length of text is more than 20    And :" + Actual);
				Assert.assertTrue(Actual.contains("IFSC Code Must Be Of 12 Digits"));

			}

		} else {
			Actual = addbank.getText_IFCSCode_Error();
			LOG.info("Account eihter blank or  contains Characters :  " + Actual);
			String Expected = "Please Enter Your IFSC Code";
			Assert.assertEquals(Actual, Expected);

		}

	}

	@Then("Assert  Result  of MICR code in Label")
	public void Assert_Result_of_MICR_code_in_Label() {
		LOG.info("Asserting Error in Label ");
		try {
			Actual = addbank.getText_MICRCode_Error();
		} catch (NoSuchElementException e) {
			e.getMessage();
			e.printStackTrace();
		}
		int len = keyword.doGetAttribute(addbank.getMicrCode()).length();
        
		if (!Actual.isEmpty()) {
			LOG.info("Length of text  "+len);
			if ((len < 9   && !(len == 0 )) || (len > 9  && !(len == 0 ))) {
				LOG.info("Message Get " + Actual);
				Assert.assertTrue(Actual.contains("MICR Code Must Be Of 9 Digits"));
			}
		}else if(len == 0 ) {
			Actual = addbank.getText_MICRCode_Error();
			LOG.info("Account eihter blank or  contains Characters :  " + Actual);
			String Expected = "Please Enter Your MICR Code";
			Assert.assertEquals(Actual, Expected);

	} 

	}

}
