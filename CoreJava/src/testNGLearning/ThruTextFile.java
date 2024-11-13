package testNGLearning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class ThruTextFile {
	
	File fc;
	FileWriter fw;
	BufferedWriter bw;
	FileReader fr;
	BufferedReader br;
	String src = "C:\\Selenium1\\data.txt";
	@Test
	public void readandwrite() throws IOException
	{
		fc = new File(src);
		fc.createNewFile();  //this statement creates a file
		
		//Write content
		fw = new FileWriter(src);
		bw = new BufferedWriter(fw);
		bw.write("This is My First Line");
		bw.newLine();
		bw.write("This is My Second Line");
		bw.close(); //saves and closes the file
		
		//Read content
		fr= new FileReader(src);
		br= new BufferedReader(fr);
		String content = null;
		while((content = br.readLine())!=null)
		{
			System.out.println(content);
		}
		br.close();
	}
}
