package com.agg.allAssignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindow_09 {

	public static void multipleWindowHandling() throws InterruptedException {
		// Use 9.Window.html
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		// Open the web site and get the main window handle
		driver.get("http://127.0.0.1:5500/9_Window.html");
		Thread.sleep(3000);
		String window = driver.getWindowHandle();
		System.out.println("Window of Selenium main Handle Id : " + window);

		// Click on the anchor tag of DashBoard
		driver.findElement(By.linkText("Go to DashBoard")).click();

		// Click on the anchor tag of DashBoard
		driver.findElement(By.linkText("Go To Profile")).click();

		// step 4: printing set of all window handle
		System.out.println("Printing set of window handle ID ");
		Set<String> handle = driver.getWindowHandles();
		for (String string : handle) {
			System.out.println(string);
		}

		ArrayList<String> windowlist = new ArrayList<String>(handle);
		for (String a : windowlist) {
			String title = driver.switchTo().window(a).getTitle();
			System.out.println(title);
		}
		Thread.sleep(2000);
		// Example 1: switch to window based on the position
		// 0th position: for main window
		// 1st position for profile window
		// 2nd position for the Dashboard window
		// driver.switchTo().window(windowlist.get(2));
		// driver.close();

		// Example2: handle on the basis of title
		ArrayList<String> windowHandle = new ArrayList<String>(handle);
		for (String s : windowHandle) {
			String listTitle = driver.switchTo().window(s).getTitle();

			// check if the current window title matches with the "Profile"
			// if it is match then close the window
			if (listTitle.equals("Profile")) {
				driver.close();
				break;
			}
		}
		// this will close all window open by the instance of Selenium
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		multipleWindowHandling();

	}

}
