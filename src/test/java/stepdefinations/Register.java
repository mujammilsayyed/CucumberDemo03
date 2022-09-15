package stepdefinations;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {
	WebDriver driver;
	@Before("@Register")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Given("^User nanigates to Registration page$")
	   public void User_nanigates_to_Registration_page(){
	    driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
	    
	    }
    @When("^User provies the following details into the input fields$")
    public void User_provies_the_following_details_into_the_input_fields (DataTable data)  {
    	 Map<String, String> dataMap = data.asMap(String.class,String.class);
    	 driver.findElement(By.name("firstname")).sendKeys(dataMap.get("firstName"));
    	 driver.findElement(By.name("lastname")).sendKeys(dataMap.get("lastName"));
    	 driver.findElement(By.name("email")).sendKeys(dataMap.get("email"));
    	 driver.findElement(By.name("telephone")).sendKeys(dataMap.get("Phone"));
    	 driver.findElement(By.name("password")).sendKeys(dataMap.get("password"));
    	 driver.findElement(By.name("confirm")).sendKeys(dataMap.get("password"));
      
    }
    @And("^Selects the privacy policy option$")
    public void Selects_the_privacy_policy_option() {
      
    	driver.findElement(By.name("agree")).click();
    }
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
