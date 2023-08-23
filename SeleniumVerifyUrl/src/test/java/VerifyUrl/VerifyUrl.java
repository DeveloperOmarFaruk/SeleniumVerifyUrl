package VerifyUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyUrl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		
		
//		Window maximized command
		driver.manage().window().maximize();
		
//		Get URL command
		driver.get("https://www.saucedemo.com/");
		
		
		
//		=========================
//		Title Verify Process
//		=========================
		
		
//		Actual Title
		String actualTitle = driver.getTitle();
		
//		Expected Title
		String expectedTitle = ("Swag Labs");
		
//		Condition Use process
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title didn't Matched");
		}
		
//		When you don't like the condition then you can apply Assertion way
		
//		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		
		
//		Actual Title print
		System.out.println("Actual Title is: "+actualTitle);
//		Expected Title print
		System.out.println("Expected Title is: "+expectedTitle);
		
		
		
//		=========================
//		URL Verify Process
//		=========================
		
		
//		Actual URL
		String ActualURL = driver.getCurrentUrl();
		
//		Expected URL
		String ExpectedURL = "https://www.saucedemo.com/";
		
		
//		Condition Use process
		if(ActualURL.equals(ExpectedURL)) {
			System.out.println("URL Valid");
		} else {
			System.out.println("URL Invalid");
		}
		
//		When you don't like the condition then you can apply Assertion way
//		Assert.assertEquals( ActualURL, ExpectedURL, "Condition true");
		
		
//		Actual URL print
		System.out.println("Actual URL is: "+ActualURL);
//		Expected URL print
		System.out.println("Expected URL is: "+ExpectedURL);
		
		
//		Browser window time command
		Thread.sleep(6000);
		
//		Browser window close command
		driver.close();

	}

}
