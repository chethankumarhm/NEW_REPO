package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Hooks.myhooks;
import Utilities.Utility_Methods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class steps{
	public WebDriver driver;
	public LoginPage element;
	public Utility_Methods method;
	
	@Before("@Smoke")
	public void setup() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    System.out.println("I am inside smoke");
	}
	
	@Before("@Regression")
	public void setup1() {
		WebDriverManager.firefoxdriver().setup();
	    driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    System.out.println("I am inside regression");
	}
	
	@After("@Smoke")
	public void taredown() {
		driver.quit();
		 System.out.println("I am outside smoke");
	}
	
	
	@After("@Regression")
	public void taredown1() {
		driver.quit();
		 System.out.println("I am outside regression");
	}
	
	
	
	
	@Given("open browser")
	public void open_browser() {
	    
	    element = new LoginPage(driver); //object should be created in given section
	    method =new Utility_Methods(driver);
	}

	@When("navigate to {string} url")
	public void navigate_to_url(String URL) throws Exception {
//		String url=method.TestConfigeration("url");
//		System.out.println(url);
		 driver.get(URL);
	}

	@Then("enter {string} username and {string} in password field")
	public void enter_username_and_in_password_field(String username, String password) {
		element.usernameTextfield(username);
		element.passwordTextfield(password);
	}
	

}
