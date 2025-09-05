package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Kree_tika/OneDrive/Desktop/selenium/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //to maximize the window
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();   //From
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();   //TO
		
		//But the test lead can say don't use index system. so you can use parent-child relationship locators
		
		// driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		
		

	}

}
