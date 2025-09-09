package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EndtoEndFlightBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Kree_tika/OneDrive/Desktop/selenium/chromedriver-win64/chromedriver.exe");
		
		
		 ChromeOptions options = new ChromeOptions();
	     options.addArguments("--incognito");  // Add incognito flag
	     
	     WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize(); //to maximize the window
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='CCU']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@value='ATQ'][normalize-space()='Amritsar (ATQ)'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-active')]")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		int n = 1;
		while(n>=3) {
		
			driver.findElement(By.id("hrefIncAdt")).click();
			n++;
		}
		
		int j = 1;
		while (j >=2) {
			driver.findElement(By.id("hrefIncChd")).click();
			j++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		WebElement menu = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropDown = new Select(menu);
		dropDown.selectByValue("AED");
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		

	}

}
