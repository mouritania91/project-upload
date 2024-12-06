package seleniumFirstClass;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	
	WebDriver drive;
	
	@BeforeSuite
	public void startBrowser() {
		
		Scanner srcn = new Scanner(System.in);
		System.out.println("Please enter a browser name: ");
		String browserName = srcn.nextLine();
		
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			drive = new ChromeDriver();
			drive.manage().window().maximize();
			
		}else if (browserName.equalsIgnoreCase("fireFox")) {
			WebDriverManager.firefoxdriver().setup();
			drive = new FirefoxDriver();
			drive.manage().window().maximize();
		}else {
			WebDriverManager.chromedriver().setup();
			drive = new ChromeDriver();
			drive.manage().window().maximize();
			
			//WebDriverManager.safaridriver().setup();
			//drive = new EdgeDriver();
			//drive.manage().window().maximize();
		}
		
	}
	
	@AfterSuite
	public void closeBrowser() {
		drive.close();
	}

}
