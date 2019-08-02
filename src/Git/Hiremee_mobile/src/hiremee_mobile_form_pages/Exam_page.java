package hiremee_mobile_form_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Exam_page 
{
	WebDriver driver;
	public Exam_page(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
@Test
public void candidate_exam() throws Exception
{
	try
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='HireMee Assessment']")).click();
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='-- Select --']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='English']")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("android.widget.Button")).click();
		
	}
	catch(Exception e)
	
	{
		throw(e);
	}
}
}
