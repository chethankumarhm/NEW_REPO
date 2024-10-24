package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Utility_Methods {
	public WebDriver driver;
	
	public Utility_Methods(WebDriver rdriver) {
		this.driver=rdriver;
	}
	
	public String TestConfigeration(String key) throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\User\\eclipse-workspace_1\\BDD_Framework\\TestConfigeration.file");
		Properties prop=new Properties();
		prop.load(fis);
		String value =prop.getProperty(key);
		return value;
	}

}
