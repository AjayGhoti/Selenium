package com.agg.allAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderSbi_19 {
	
	public static void sbiSliderAssignment() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Step1: Open the web site and get the main window handle
		driver.get("https://homeloans.sbi/calculators");

		// locate the HomeLoan Slider
		WebElement homeLoan = driver.findElement(By.xpath(
				"//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/span[1]"));

		// Current location homeLoan slider
		System.out.println("Initial Location of the homeloan slider: " + homeLoan.getLocation());// (383, 591)

		// drag the homeLoan slider to the right side
		Actions act = new Actions(driver);
		act.dragAndDropBy(homeLoan, 85, 0).perform();
		System.out.println("after drag Location of the homeloan slider: " + homeLoan.getLocation());// (465,591)

		// locate the  loanTenure Slider
		WebElement loanTenure = driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[3]/div[1]/span[1]"));

		// Current location homeLoan slider
		System.out.println("Initial Location of the loanTenure slider: " + loanTenure.getLocation());// (367, 705)

		// drag the LoanTenure slider to the right side
		act.dragAndDropBy(loanTenure, 205, 0).perform();
		System.out.println("after drag Location of the loanTenure slider: " + loanTenure.getLocation());// (579, 705)

		// locate the  interestRate Slider
		WebElement interestRate = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[3]/div[1]/span[1]"));

		// Current location interestRate slider
		System.out.println("Initial Location of the interestRate slider: " + interestRate.getLocation());

		// drag the LoanTenure slider to the right side
		act.dragAndDropBy(interestRate, -27, 0).perform();
		System.out.println("after drag Location of the interestRate slider: " + interestRate.getLocation());

		
		Thread.sleep(2000);
		 driver.quit();
	}


	public static void main(String[] args) throws InterruptedException {
		sbiSliderAssignment();

	}

}
