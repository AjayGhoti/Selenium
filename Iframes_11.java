package com.agg.allAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes_11 {
	
	
	public static void framesByNameorId()  throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		//Step:1=>> Open the web site and get the main window handle
		driver.get("https://docs.oracle.com/javase/8/docs/api/index.html?help-doc.html");
		Thread.sleep(2000);
		
		//Step2: Switch to the frame and Click on Java.Applet
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[contains(text(),'java.applet')]")).click();
		Thread.sleep(2000);
		
		//Step3: Go to default frame
		driver.switchTo().defaultContent();
		
		//Step4: Go the second frame and click on Applet
		driver.switchTo().frame("packageFrame");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Applet')]")).click();
		Thread.sleep(2000);
		
		//Step5: Go to default frame
		driver.switchTo().defaultContent();
		
		//Step6: Switch to class frame and click on Tree which is located navigation bar at top of first row
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("/html/body/div[1]/ul/li[5]")).click();
		
	}
	
	public static void framesByWebElement()  throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Open the web site and get the main window handle
		driver.get("https://docs.oracle.com/javase/8/docs/api/index.html?help-doc.html");
		Thread.sleep(2000);
		
		//Step1: Locate the frame Element First and Switch to frame using WebElement
		WebElement frame1 = driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
		driver.switchTo().frame(frame1);
		
		//Step2: Click on Java Applet 
		driver.findElement(By.xpath("//a[contains(text(),'java.applet')]")).click();
		Thread.sleep(2000);
		
		// Step3: Go to the default frame
		driver.switchTo().defaultContent();
		
		//Step4: Go the second frame (Package Frame) using WebElement and click on Applet
        WebElement frame2 = driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		driver.switchTo().frame(frame2);
		Thread.sleep(2000);
		
		//Step5: Click on Applet 
		driver.findElement(By.xpath("//a[contains(text(),'Applet')]")).click();
		Thread.sleep(2000);
		
		//Step6: Go the default frame
		driver.switchTo().defaultContent();
		
		//Step7: Go the Third frame (Class Frame) using WebElement and click on Applet
		WebElement frame3 = driver.findElement(By.xpath("/html/frameset/frame"));
        driver.switchTo().frame(frame3);
        Thread.sleep(2000);
        
        //Step8:click on Tree which is located in navigation bar at top of first row
		driver.findElement(By.xpath("/html/body/div[1]/ul/li[5]")).click();
		Thread.sleep(2000);
	}
	public static void framesByIndex()  throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Open the web site and get the main window handle
		driver.get("https://docs.oracle.com/javase/8/docs/api/index.html?help-doc.html");
		Thread.sleep(2000);
		
		//Step1: Switch to frame using WebElement
		driver.switchTo().frame(0);
		
		//Step2: Click on Java Applet 
		driver.findElement(By.xpath("//a[contains(text(),'java.applet')]")).click();
		Thread.sleep(2000);
		
		// Step3: Go to the default frame
		driver.switchTo().defaultContent();
		
		//Step4: Go the second frame (Package Frame) using frame Index and click on Applet
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		
		//Step5: Click on Applet 
		driver.findElement(By.xpath("//a[contains(text(),'Applet')]")).click();
		Thread.sleep(2000);
		
		//Step6: Go the default frame
		driver.switchTo().defaultContent();
		
		//Step7: Go the Third frame (Class Frame) using frame Index and click on Applet
        driver.switchTo().frame(2);
        Thread.sleep(2000);
        
        //Step8:click on Tree which is located in navigation bar at top of first row
		driver.findElement(By.xpath("/html/body/div[1]/ul/li[5]")).click();
		Thread.sleep(2000);	
	}



	public static void main(String[] args) throws InterruptedException {
		try {
			// framesByNameorId();
			// framesByWebElement();
			framesByIndex();
			}catch (NoSuchElementException e) {

			}

	}

}
