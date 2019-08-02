package hiremee_mobile_form_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class login_form 
{
	WebDriver driver;
	public login_form(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@Test
	public void candidate_login() throws Exception
	{
		try
		{
	//hiremee started
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='LOGIN']")).click();
	Thread.sleep(2000);
	driver.findElement(By.className("android.widget.EditText")).sendKeys("8110977027");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("123456");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//android.widget.Button[@text='Login']")).click();
	}
		catch(Exception e)
		{
			throw(e);
		}
}
}