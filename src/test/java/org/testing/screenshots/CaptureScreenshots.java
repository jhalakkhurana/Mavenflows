package org.testing.screenshots;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
public class CaptureScreenshots {
ChromeDriver d ;

//public static void main(String[] args) {
// TODO Auto-generated method stub

public static void takeScreenshot(ChromeDriver d, String path) throws IOException {
File f = d.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(f, new File(path));
System.out.println("Screen captured sucessfully");	
}
}