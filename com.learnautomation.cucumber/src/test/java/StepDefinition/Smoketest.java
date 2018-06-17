package StepDefinition;
/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Smoketest {
	
	WebDriver driver;
	@Given("^Open firefox and start application$")
	public void Open_firefox_and_start_application() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.setProperty("webdriver.chrome.driver","F:\\java_new_1.8_eclipse\\selenium_jars\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("http://www.facebook.com");
		 
		// Maximize browser
		 
		driver.manage().window().maximize();
	    //throw new PendingException();
		 
	}

	@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_enter_valid_and(String uname, String pass) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
		//driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uname);
		Thread.sleep(5000);
		//driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
		Thread.sleep(1000);
		
	    //throw new PendingException();
	}

	@Then("^User should be able to login$")
	public void User_should_be_able_to_login() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	   // throw new PendingException();
	}


}
*/
