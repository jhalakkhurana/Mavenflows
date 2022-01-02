package org.testing.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseClass {
	public ChromeDriver d ;
	public Properties pr;
@BeforeMethod
public void before() throws IOException

{
	System.setProperty ("webdriver.chrome.driver", "../Mavenflows/chromedriver.exe");
	
	 d = new ChromeDriver();

	d.get("https://www.facebook.com/");
	d.manage().window().maximize();
	
	File f = new File("../Mavenflows/src/test/java/Object.properties");
	FileReader fr = new FileReader(f);
	 pr = new Properties() ;
	pr.load(fr);


}

@AfterMethod
public void after()

{
	//d.findElement(By.xpath("//span[contains(text(), 'Log Out')]")).click();
	//System.out.println("Sucessfully logged Out");
//	d.close();
}


	}

