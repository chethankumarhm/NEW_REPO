package Android;

import java.net.URL;
import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;


public class Launch_app {
public static <MobileElement> void main(String[] args) throws Exception {
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability("platformName", "Android");
	cap.setCapability("deviceName", "Redmi Note 11 Pro+ 5G");
	cap.setCapability("appPackage", "io.appium.android.apis");
	cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	cap.setCapability("noReset", "false");
	AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
	
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
	//WebElement scrollElement=driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"WebView3\"]"));
	//WebElement scrollElement2=driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Date Widgets\"]"));
	Actions action=new Actions(driver);
	//action to scroll to element
	
	
	
	MobileElement listItem=(MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().description(\"WebView3\"));")); 
	Thread.sleep(5000);
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"WebView3\"]")).click();
	driver.navigate().back();
	MobileElement listItem1=(MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().description(\"Date Widgets\"));"));
	
	
	
	
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Date Widgets\"]")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='2. Inline']")).click();
	
	WebElement startPoint =driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"3\"]"));
	WebElement endPoint =driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"9\"]"));
	
	//action to Click and Hold and Move to Element
	action.clickAndHold(startPoint).moveToElement(endPoint).perform();
}
}
