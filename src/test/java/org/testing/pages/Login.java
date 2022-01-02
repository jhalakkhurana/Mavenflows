package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
ChromeDriver d ;
Properties pr;
 
public  Login(ChromeDriver d, Properties pr) throws InterruptedException
	
{
	this.d = d;
	this.pr = pr;
	}

public void signup(String username, String Password)
{
	
	d.findElement(By.name(pr.getProperty("name"))).sendKeys(username);
	d.findElement(By.name(pr.getProperty("pass"))).sendKeys(Password);

}

}

