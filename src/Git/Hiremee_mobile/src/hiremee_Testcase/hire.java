package hiremee_Testcase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hiremee_mobile_form_pages.Exam_page;
import hiremee_mobile_form_pages.login_form;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class hire 
{
	login_form obj_login_form;
	Exam_page obj_Exam_page;
	public  AppiumDriver<MobileElement> driver;
	public  WebDriverWait wait;
	
	@BeforeTest
	public  void test () throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Rexmin 4");
		caps.setCapability("udid", "58748757d140");
		//caps.setCapability("udid", "192.168.211.101:5555"); //DeviceId from "adb devices" command
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.1.2");
		caps.setCapability("skipUnlock","true");

		//hiremee apk
		//package name and activity name
		//package:/data/app/com.mobility.hiremeeapp-1/base.apk=com.mobility.hiremeeapp
		//name='md50209134aa321789390129287bc88d224.Splash'
		
		caps.setCapability("appPackage", "com.mobility.hiremeeapp");
		caps.setCapability("appActivity","md50209134aa321789390129287bc88d224.Splash");

		//talkbook apk
		// caps.setCapability("appPackage", "com.mobility.TalkBook");
		// caps.setCapability("appActivity","TalkBook.MainActivity");

		caps.setCapability("noReset","true");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		wait = new WebDriverWait(driver, 1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/*@Test(priority=0)
	public void candidate_login_Testcase() throws Exception
	{
		obj_login_form=new login_form(driver);
		try
		{
			obj_login_form.candidate_login();
			
		}
		catch(Exception e)
		{
			throw(e);
		}
		
	}*/
	
	@Test(priority=1)
	public void candidate_exam_testcase() throws Exception
	{
		obj_Exam_page=new Exam_page(driver);
		try
		{
			obj_Exam_page.candidate_exam();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.quit();

}