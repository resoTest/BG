package com.testingshashtra.stepdefination;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.testingshatra.keywords.UIKeywords;
import com.testingshshtra.pages.AddBankPage;
import com.testingshshtra.pages.EditBankPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditBankDetailsTest {
	private static final Logger LOG = Logger.getLogger(EditBankDetailsTest.class);
	EditBankPage editpage = new EditBankPage();
	AddBankPage abp =new AddBankPage();
	UIKeywords keyword = new UIKeywords();
	
	
	

@Given("I click on master and  Bank SubMenu")
public void clickOnMasterMenu() {
	AddBankTest abt = new AddBankTest();
	abt.click_on_bnak_menu();
}
@Given("Search bank name for edit bank details")
public void SearchBankForEdit() {
    editpage.enterTextInSearchBx("union");
}
@When("click on Edit button")
public void clickOnEditButton() {
    editpage.clickOnEditBtn();
}
@Then("Change Data and Click on Edit submit button")
public void change_data_and_click_on_edit_submit_button() throws InterruptedException {
	Thread.sleep(1000);
	keyword.clearTextBox(abp.getBankName());
	abp.enterBankName("BOIndia");
	keyword.clearTextBox(abp.getAccountName());
	abp.enterAccountName("AWS");
	keyword.clearTextBox(abp.getAccountNo());
	abp.enterAccountNumber("612354687123");
	abp.selectAccountType("Savings");
	keyword.clearTextBox(abp.getIfscCode());
	abp.enterIFSCCode("UN01235468");
	keyword.clearTextBox(abp.getMicrCode());
	abp.enterMICRCode("545687911");
    abp.clickOnSubmitButton();
	abp.clickOnOKButton();
}

@Then("Assert updated result")
public void assertResult() {
	editpage.enterTextInSearchBx("union");
	LOG.info("Bank get Update");
	Assert.assertFalse(editpage.getBankName().equalsIgnoreCase("union"));
	
	/*if(editpage.getBankName().equalsIgnoreCase("sbi")) {
		LOG.info("bank not update");
	}
	else {
	LOG.info("Bank get Update");

	}*/
  	
	
	
}

}
