package stepDefinations;


import com.qa.google.pages.FbLoginPage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinations extends FbLoginPage{
	
	@Given("I am on login page")
	public void i_am_on_login_page() {
		loginPrompt();
		
	}

	@When("I enter userName & Password")
	public void i_enter_userName_Password() {
		addEmailId("srajan.falke@gmail.com");
		addPassword("srajan@1991");
	  
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		clickOnBtn();
	  
	}

	@Then("I should see project dashboard")
	public void i_should_see_project_dashboard() {
	
	  
	}
//	@When("I enter {String} & {String}")
//	public void i_enter_srajan_falke_gmail_com_srajan(String str, String str2) {
//		addEmailId(str);
//		addPassword(str2);
//	}



}
