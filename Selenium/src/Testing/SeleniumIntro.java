package Testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class SeleniumIntro {

	public static void main(String[] args) {
		
		//Invoking Browser
		
		//ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Kree_tika/OneDrive/Desktop/selenium/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.atlassian.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
