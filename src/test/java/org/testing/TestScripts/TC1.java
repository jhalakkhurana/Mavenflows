package org.testing.TestScripts;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.BaseClass;
import org.testing.Logs.CaptureLogs;
import org.testing.pages.Login;
import org.testing.screenshots.CaptureScreenshots;
import org.testng.annotations.Test;

import testing.org.asserations.Asseration;
public class TC1 extends BaseClass{
	
@Test
public void tc1() throws InterruptedException, IOException
	{
	//ChromeDriver d 	= new ChromeDriver();
	Thread.sleep(5000);
Login l = new Login(d, pr);

l.signup("jhalakkhurana06@gmail.com", "Attra@555");
CaptureLogs.takeLogs("TC1", "Logs captured for first case");

	//d.findElement(By.name("email")).sendKeys("jhalakkhurana06@gmail.com");
	//d.findElement(By.name("pass")).sendKeys("Attra@555");
	d.findElement(By.name(pr.getProperty("Login"))).click();

	//d.findElement(By.name("login")).click();
	d.findElement(By.xpath("//div[@aria-label ='Account']")).click();
	Asseration.assert1("https://www.facebook.cm/", d.getCurrentUrl());
	CaptureLogs.takeLogs("TC1", "Logs captured for first test case");
	Asseration.assert1("https://www.facebook.cm/", d.getCurrentUrl());

	CaptureScreenshots.takeScreenshot(d, "C:\\Users\\Ishan\\Desktop\\Java_Selenium_setup\\Screenshots\\ScreenShot1.png");	
	}
}
