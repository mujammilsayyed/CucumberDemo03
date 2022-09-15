package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Softwaretester {
	
	  @Given("^I am a \"([a-zA-Z]{1,})\" software tester$")
	    public void i_am_a_good_software_tester(String testerType) {
		  System.out.println(">>---I am a"+testerType+" software tester");
	    }
	   @When("^I go to work$")
	    public void i_go_to_work() {
		  System.out.println(">>---I go to work"); 
	    }
	   @And("^I \"([^\"]*)\" with it$")
	    public void i_involve_with_it(String workType) {
		  System.out.println(">>---I"+workType+" with it"); 
	    }
	   @Then("^My boss \"(.*)\" me$")
	    public void my_boss_loves_me(String bossreaction) {
		   System.out.println(">>---My boss"+bossreaction+" me");
	    }
	
	
	
	
	
	
	
	
	
	
	
	

}
