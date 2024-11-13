 package testNGLearning;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleAttr {

	@Test
	public void multipleAttribute() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		WebElement ele = driver.findElement(By.id("cars"));
		Select opts = new Select(ele);
		opts.selectByIndex(0);
		opts.selectByValue("saab");
		opts.selectByVisibleText("Audi");
		driver.findElement(By.xpath("/html/body/form/input")).click();
		Thread.sleep(4000);
		String selCars = driver.findElement(By.xpath("/html/body/div[1]")).getText();
		String[] parts = selCars.split("&"); // Split the text at each '&' to get each car separately
		System.out.println("Selected Cars=");
		for (int i = 0; i < parts.length; i++)
		{
            System.out.println(parts[i]);
		}
		for (String car : parts) {
		    System.out.println(car);
		}
		driver.close();
	}

}
