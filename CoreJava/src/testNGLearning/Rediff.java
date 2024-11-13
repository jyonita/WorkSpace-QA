package testNGLearning;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Rediff {
	WebDriver driver;
	
	@Test(priority=1,description="Launch Rediff")
		public void openRediff() throws InterruptedException
		{
		System.out.println("Launch Rediff");
		driver = new EdgeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);	
		}
	
	
	@Test(description="Login Rediff-Hard Assert",priority=2 , enabled=false)
	public void loginRediff1()
	{
		System.out.println("Login Rediff");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Rediffmail");
		System.out.println("Assert executed...");
	}
	
	@Test(description="Login Rediff - soft Assert",priority=2)
	public void loginRediff()
	{
	SoftAssert assertion = new SoftAssert();
		System.out.println("Login Rediff");
		String title = driver.getTitle();
		assertion.assertEquals(title, "Rediffmail");
		System.out.println("Assert executed...");
		assertion.assertAll();
	}

	
	@Test(description="Close Rediff",priority=3)
		public void closeRediff()
		{
			System.out.println("Close Rediff");
			driver.quit();
		}
}
