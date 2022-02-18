package com.takescreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static void screeShot(WebDriver driver,String screeshotName) throws IOException {
		TakesScreenshot ss=(TakesScreenshot) driver;
		File file=ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".//Screenshot//"+screeshotName+".png"));
	}
	
	
	

}
