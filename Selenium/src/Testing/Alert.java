package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Kree_tika/OneDrive/Desktop/selenium/chromedriver-win64/chromedriver.exe");
		
		
	    String text = "Sabin";
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //to maximize the window
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		
		//get text message from alert
		System.out.println(driver.switchTo().alert().getText());
		
		//Accepting alert
		driver.switchTo().alert().accept();
		
		//canceling the pop of message
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
		

	}

}
