package testNGLearning;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ReadDataFrmWebTable {
	FileWriter fw;
	BufferedWriter bw;
	WebDriver driver;
	String src = "C:\\Selenium1\\data.txt";
	@Test
	public void webtable() throws IOException
	{
		fw = new FileWriter(src);
		bw = new BufferedWriter(fw);
		
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
				System.out.println(allCols.get(j).getText());
				bw.write(allCols.get(j).getText());
				bw.newLine();
						}
		}
		bw.close();	
		driver.quit();
		
	}
}
