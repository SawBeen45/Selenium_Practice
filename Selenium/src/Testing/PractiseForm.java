package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PractiseForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Kree_tika/OneDrive/Desktop/selenium/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //to maximize the window
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("John Doe");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc.gmail.com");
		
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("12345");
		
		driver.findElement(By.cssSelector("#exampleInputPassword1")).click();
		
		WebElement menu = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(menu);
		
		dropdown.selectByVisibleText("Male");
		
		
		driver.findElement(By.cssSelector("label[for='inlineRadio1']")).click();
		
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("05/07/2025");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();

	}

}
