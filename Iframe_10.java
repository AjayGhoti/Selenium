package com.agg.allAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe_10 {
	
	public static void iframeDemo()  throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Open the web site and get the main window handle
		driver.get("https://docs.oracle.com/javase/8/docs/api/index.html?help-doc.html");
		Thread.sleep(2000);
		
		driver.switchTo().frame("packageListFrame");
		
		driver.findElement(By.xpath("//a[contains(text(),'java.applet')]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		//a[text()='java.applet']
		//a[contains(text(),'java.applet')]
		driver.switchTo().frame("packageFrame");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Applet')]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("classFrame");
//		driver.switchTo().frame("navbar.top.firstrow");
		driver.findElement(By.xpath("/html/body/div[1]/ul/li[5]")).click();
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		iframeDemo();
	}

}
