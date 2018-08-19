package appium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
 
public class AppiumTestRun {
	static WebDriver driver;
	static WebDriverWait wait;
	
	public static void main(String[] args) throws Exception {
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("appWaitActivity", "SplashActivity, SplashActivity,OtherActivity, *, *.SplashActivity");
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "PL2GAMG831609737"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "8.1.0");
		caps.setCapability("appPackage", "com.test.mobile");
		caps.setCapability("appActivity", "com.test.mobile.MainActivity");
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try {
	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	wait = new WebDriverWait(driver, 120);
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
		
//		Thread.sleep(15000);
//		System.out.println("im waiting now");
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@text='Username']")));
//		WebElement Username=driver.findElement(By.xpath("//android.widget.EditText[@text='Username']"));
//		Username.sendKeys("bharathgates33+33@gmail.com");
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@text='Password']")));
//		WebElement Password=driver.findElement(By.xpath("//android.widget.EditText[@text='Password']"));
//		Password.sendKeys("Welcome3#");
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Login']")));
//		WebElement login=driver.findElement(By.xpath("//android.widget.TextView[@text='Login']"));
//		login.click();
//		
//	
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='1']")));
//		WebElement createPin=driver.findElement(By.xpath("//android.widget.TextView[@text='1']"));
//		createPin.click();
//		createPin.click();
//		createPin.click();
//		createPin.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='1']")));
		WebElement confirmpin=driver.findElement(By.xpath("//android.widget.TextView[@text='1']"));
		confirmpin.click();
		confirmpin.click();
		confirmpin.click();
		confirmpin.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text='RULE 1']")));
		WebElement Diaries=driver.findElement(By.xpath("//android.widget.Button[@text='RULE 1']"));
		Diaries.click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@text='Fever']")));
		WebElement selector1=driver.findElement(By.xpath("//android.view.View[@text='Fever']"));
		selector1.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@text='Cold']")));
		WebElement selector2=driver.findElement(By.xpath("//android.view.View[@text='Cold']"));
		selector2.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text='button']")));
		WebElement button=driver.findElement(By.xpath("//android.widget.Button[@text='button']"));
		button.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text='The End']")));
		WebElement end=driver.findElement(By.xpath("//android.widget.Button[@text='The End']"));
		end.click();
		
	}
 
}
