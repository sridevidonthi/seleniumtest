package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Smoketest {
	
	WebDriver driver;
	@Given("^Open firefox and start application$")
	public void Open_firefox_and_start_application() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
		driver=new FirefoxDriver();
		 
		// Open facebook
		driver.get("http://www.facebook.com");
		 
		// Maximize browser
		 
		driver.manage().window().maximize();
	    //throw new PendingException();
		 
	}

	@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_enter_valid_and(String uname, String pass) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pass);
		
	    //throw new PendingException();
	}

	@Then("^User should be able to login$")
	public void User_should_be_able_to_login() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.findElement(By.id("loginbutton")).click();
	   // throw new PendingException();
	}


}
