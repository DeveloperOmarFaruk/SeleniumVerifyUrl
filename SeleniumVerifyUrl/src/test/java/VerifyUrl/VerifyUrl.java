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
		
//		Actual Title
		String actualTitle = driver.getTitle();
		
//		Expected Title
		String expectedTitle = ("Swag Labs");
		
//		Condition Use process
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title Matched URL Valid");
		} else {
			System.out.println("Title didn't Matched URL Invalid");
		}
		
//		When you don't like condition then you can apply Assertion way
		
//		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		
		
//		Actual Title print
		System.out.println(actualTitle);
		
		
//		Browser window time command
		Thread.sleep(6000);
		
//		Browser window close command
		driver.close();

	}

}
