package Stepdefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {
	@Given("^Validating the Browser$")
	public void Validating_the_Browser() {
		System.out.println("Validating the Browser");
	}
	
	@When("^Browser is trigger$")
	public void Browser_is_trigger() {
		System.out.println("Browser is trigger");
	}
	
	@Then("^Check if browser is opened$")
	public void Check_if_browser_is_opened() {
		System.out.println("Check if browser is opened");
	}
	
	@Given("^User is on NetBanking Landing page$")
	public void User_is_on_NetBanking_Landing_page(){
		System.out.println("Given");
	}
	
	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_login_into_application_with_something_and_something(String arg1,String arg2){
		System.out.println(arg1);
		System.out.println(arg2);
	}
	
	@When("^User sign up with following details$")
	public void User_sign_up_with_following_details(DataTable data){
		List<List<String>> Obj=data.asLists();
		System.out.println(Obj.get(0).get(0));
		System.out.println(Obj.get(0).get(1));
		System.out.println(Obj.get(0).get(2));
		System.out.println(Obj.get(0).get(3));
	}
	
	@When("^User login in to application with (.+) and (.+)$")
	public void User_login_in_to_application_with_and(String Username,String Password){
		System.out.println(Username);
		System.out.println(Password);
	}
	
	@Then("^Home page is populated$")
	public void Home_page_is_populated() {
		System.out.println("Then");
	}
	
	@And("^Cards displayed are \"([^\"]*)\"$")
	public void Cards_are_displayed(String arg) {
		System.out.println(arg);
	}
	
	
}
