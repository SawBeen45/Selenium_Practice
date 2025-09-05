package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsProperties {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Kree_tika/OneDrive/Desktop/selenium/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //to maximize the window
		
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.youtube.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();

	}

}
