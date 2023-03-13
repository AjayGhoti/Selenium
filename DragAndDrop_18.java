package com.agg.allAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop_18 {
	
	public static void dragAnddrop() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Step1: Open the web site and get the main window handle
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(1000);
		/* >>>>>>>>>Example 1: Washington and US<<<<<<<<<<<<<<<<<<<<<< */
		// Element to be drag(source1)
		WebElement source1 = driver.findElement(By.xpath("//div[@id='box3']"));
		Thread.sleep(1000);
		// Element to be dropped on (target2)
		WebElement target1 = driver.findElement(By.xpath("//div[@id='box103']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source1, target1).perform();

		/* >>>>>>>>>Example 2: drag:seoul and South Korea <<<<<<<<<<<<<<<<<<<<<< */
		WebElement source2 = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement target2 = driver.findElement(By.xpath("//div[@id='box105']"));

		Actions action2 = new Actions(driver);
		action2.dragAndDrop(source2, target2).perform();

		/* >>>>>>>>>Example 3: drag:Roma and Italy <<<<<<<<<<<<<<<<<<<<<< */
		WebElement source3 = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement target3 = driver.findElement(By.xpath("//div[@id='box106']"));

		Actions action3 = new Actions(driver);
		action3.dragAndDrop(source3, target3).perform();

		Thread.sleep(2000);
		driver.quit();
	}


	public static void main(String[] args) throws InterruptedException {
		dragAnddrop();
	}

}
