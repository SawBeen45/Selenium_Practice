package Testing;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class FunctionalTesting {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//Arrays of items to add to the cart
		String[] items = {"Cauliflower", "Tomato", "Potato", "Grapes", "Walnuts"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		addItems(driver, items);
}
		
		public static void addItems(WebDriver driver, String[] items) {
			int j = 0;
			
			List <WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
			
			for(int i=0; i<products.size(); i++) {
				
				String[] names = products.get(i).getText().split("-");
				String finalNames = names[0].trim();
				
				//convert the array into arrayList and checking if the products are in the list or not
				
				List<String> itemsNeeded = Arrays.asList(items);
				
				if(itemsNeeded.contains(finalNames)) {
					j++;
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					
					if( j == items.length) {
						break;
					}
				}
				
				
				
			}
		
}
}

