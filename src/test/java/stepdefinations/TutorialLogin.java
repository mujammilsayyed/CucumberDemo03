package stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TutorialLogin {
	WebDriver driver;
	@Before
	public void setup() {
	System.out.println("--------------------start--------------------");	
	}
	@After
	public void tearDown() {
		System.out.println(">>>>>>>>>>>>>>>>>>End>>>>>>>>>>>>>>>>>>>>>>>");
	}
	@Before("@Tut")
	public void setupb() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	@Given("^I navigate to the tutorial website$")
	public void I_navigate_to_the_tutorial_website() {

		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
	}
	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\" into the fields$")
	public void I_enter_Username_as_someusername_and_Password_as_somepassword_into_the_fields(String username,String password){
	driver.findElement(By.id("input-email")).sendKeys(username);
	driver.findElement(By.id("input-password")).sendKeys(password);	
	}
	@And("^I click on Login button$")
	public void I_click_on_Login_button() {
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}
	@Then("^User should login based on expected \"([^\"]*)\" status$")
	public void User_should_login_based_on_expected_loginstatus_status(String expectedLoginStatus) {
		
		String actual = null;
	
		
		try {
			WebElement ch = driver.findElement(By.xpath("//div[@id='content']//h2[text()='My Account']"));
			if(ch.isDisplayed()) {
				actual="success";
				System.out.println("----------pass------------");
			}
			
		}
		catch(Exception e){
			actual="failure";
			System.out.println("-----------fail-----------");
			
		}
		Assert.assertEquals(expectedLoginStatus, actual);
		driver.quit();
	}
	@After("@Tut")
	public void closer() {
		driver.quit();
	}
	

}
