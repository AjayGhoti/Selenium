package com.agg.allAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllXpathAxes_02 {
	
	public static void axesFunction() throws InterruptedException {

		// file used for this 5_Xpath Axes

		final String URL = "http://127.0.0.1:5500/5_Xpath%20Axes.html";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(URL);

		// Example:1= Xpath Axes Function =>> Context:paragraph of div of service Based
		// company
		WebElement function = driver.findElement(By.xpath("//div[@id=\"r3\"]"));
		String heading0 = function.getTagName();
		System.out.println("This is required tagname of div: " + heading0);

		// Example:2 = Xpath axes function =>> context: heading of service based company
		WebElement axes1 = driver.findElement(By.xpath("//h3[@id=\"h3\"]/self::*"));
		String heading1 = axes1.getTagName();
		System.out.println("Required TagName : " + heading1);
		String heading2 = axes1.getText();
		System.out.println("Required Heading name : " + heading2);

		// Example:3 = Xpath axes function=>> parent of( "//h3[@id=\"h3\"]/self::*" )
		WebElement axes2 = driver.findElement(By.xpath("//h3[@id=\"h3\"]/parent::*"));
		String heading3 = axes2.getTagName();
		System.out.println("Parent of h3 : " + heading3);

//	 // Example:4 = Xpath axes function =>> child of ("ul[@id="a1"]" )
//	    WebElement axes3 = driver.findElement(By.xpath("//ul[@id=\"a1\"]/child::*"));
//	    String heading4 = axes3.getText();
//	    System.out.println("This is list : " +heading4);

		//Example:5 = using above code we only get first name : to get all list item write array
		// list
		List<WebElement> listitem = (List<WebElement>) driver.findElements(By.xpath("//ul[@id=\"a1\"]/child::*"));
		for (WebElement webElement : listitem) {
			System.out.println("Service Based Company : "+ webElement.getText());
		}
		//Example: 6 = Xpath Axes function =>> Ancestor 
		List<WebElement> axes4 = driver.findElements(By.xpath("//ul[@id=\"a1\"]/ancestor::*"));
		for (WebElement webElement : axes4) {
			System.out.println("Ancestor getTag : " +webElement.getTagName());
		}
		
		//Example:7 =>> Xpath Axes function =>> Descendant
		WebElement axes5 = driver.findElement(By.xpath("//ul[@id=\"a1\"]/descendant::*[3]"));
		String heading5 = axes5.getText();
		System.out.println("Name of the Descendant: "+ heading5);
			
	    //Example 8: Xpath Axes function =>> preceding sibling
		
		List<WebElement> listitem2 = driver.findElements(By.xpath("//ul[@id=\"a1\"]/preceding-sibling::*"));
		for (WebElement webElement : listitem2) {
			System.out.println("Preceding-Sibling : " +webElement.getText());
			
		//Example 9: Xpath Axes function =>> following Sibling
			WebElement uname = driver.findElement(By.xpath("//h3[@id=\"h4\"]/following-sibling::*[2]"));
			 String heading6 = uname.getTagName();
			System.out.println("Following Sibling : " +heading6);
			
		}
		
		System.out.println("Thank you using Xpath Axes");
		
		driver.quit();

	}

	public static void main(String[] args) throws InterruptedException {
		axesFunction();
	}

}
