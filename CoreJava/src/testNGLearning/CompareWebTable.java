package testNGLearning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CompareWebTable {
	
	WebDriver driver;
	FileReader fr;
	BufferedReader br;
	ArrayList<String> exp_data = new ArrayList<String>();
	ArrayList<String> act_data = new ArrayList<String>();
	String src = "C:\\Selenium1\\data.txt";
	
	@Test(priority = 1)
	public void readFromWebTable()
	{
		driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement myTable = driver.findElement(By.id("customers"));
		List<WebElement> allRows = myTable.findElements(By.tagName("tr"));
		System.out.println("Total number of Rows ="+allRows.size());
		for(int i=1;i<allRows.size();i++) //focus Row 1 - data starts from row 1
		{
			List<WebElement> allCols = allRows.get(i).findElements(By.tagName("td"));
			System.out.println("Total number of Columns ="+allCols.size());
			//3 column records
			for(int j=0;j<allCols.size();j++)
			{
//				System.out.println(allCols.get(j).getText());
				act_data.add(allCols.get(j).getText());
			}
		}
		System.out.println("Total number of actual Items="+act_data.size());
		
	
		driver.quit();
	}
	@Test(priority = 2)
	public void readFromTextFile() throws IOException
	{
		fr =new FileReader(src);
		br = new BufferedReader(fr);
		String content=null;
		while((content=br.readLine())!=null)
		{
			exp_data.add(content);
		}
		System.out.println("Total number of expected Items="+exp_data.size());
		
	}
	@Test(priority = 3 )
	public void compareData()
	{
		for(int i=0;i<exp_data.size();i++)
		{
			if(exp_data.get(i).equals(act_data.get(i)))
			{
				System.out.println("Items Matched..");
			}
			else
			{
				System.out.println("Items not Matched..");
			}
		}
	}

}
