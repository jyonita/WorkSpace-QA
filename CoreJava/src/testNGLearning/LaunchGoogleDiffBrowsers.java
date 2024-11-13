package testNGLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchGoogleDiffBrowsers {

	@Test
	public  void diffBrowsers() throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		if(title.equals("Google"))
		{
			System.out.println("Title Matched..");
		}
		else
		{
			System.out.println("Title did not Matched..");
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
