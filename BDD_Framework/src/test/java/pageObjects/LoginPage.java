package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	
public LoginPage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}


//---Elements-----------

@FindBy(xpath="//input[@id='email']")
WebElement username;

@FindBy(xpath="//input[@id='pass']")
WebElement password;



//-------Methods-----------

public void usernameTextfield(String usernameText) {
	username.click();
	username.sendKeys(usernameText);
}

public void passwordTextfield(String passwordText) {
	password.click();
	password.sendKeys(passwordText);
}
}
