package selWithJava;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Vindeep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ArrayList<String> exp_data = new ArrayList<String>();
		exp_data.add("Days");
		exp_data.add("Months");
		exp_data.add("Years");
		WebDriver driver = new EdgeDriver();
		driver.get("https://vindeep.com/Calculators/FDCalc.aspx");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title = "+ title);
		if(title.equals("Fixed Deposit Calculator | Calculate FD Interest, Maturity value"))
		{
			System.out.println("Title Matched..");
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FDAmount")).clear();
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FDAmount")).sendKeys("200000");
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).clear();
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).sendKeys("70");
			
			//dropdown
			Select opts = new Select(driver.findElement(By.id("ContentPlaceHolder1_cphCentre_PeriodDropDown")));
			opts.selectByVisibleText("Months");
			List<WebElement> allItems = opts.getOptions();
			System.out.println(allItems.size());
			for(int i=0;i<allItems.size();i++)
			{
				System.out.println(allItems.get(i).getText());
				if(exp_data.get(i).equals(allItems.get(i).getText()))
				{
					System.out.println("Items  Matched..");
				}
				else
				{
					System.out.println("Items did not Matched..");
				}
			}
			
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_InterestRate")).clear();
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_InterestRate")).sendKeys("5.40");
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$cphCentre$btnFDMAmount")).click();
			Thread.sleep(5000);
			String fdAmount = driver.findElement(By.id("ContentPlaceHolder1_cphCentre_MaturityAmountTextBox")).getAttribute("value");
			System.out.println(fdAmount);
			}
		else
		{
			System.out.println("Title did not Matched..");
		}
		driver.quit();
		
	
	}

}
