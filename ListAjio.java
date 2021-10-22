package week3.day2.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListAjio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		//driver.findElement(By.xpath("//div[@class='ic-close-quickview']")).click();
		driver.findElement(By.xpath("//input[@placeholder ='Search AJIO']")).sendKeys("bags", Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		String searchResult = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Result count is "+ searchResult );
		List <WebElement> brandList = driver.findElements(By.xpath("//div[@class='brand']"));
		int brandCount = brandList.size();
		System.out.println("Total brands are "+brandCount);
		System.out.println("Brands are listed below");
		for (WebElement webElement : brandList) {
			String brandName = webElement.getText();
			System.out.println(brandName);
		}
		List <WebElement> prodList = driver.findElements(By.xpath("//div[@class='name']"));
		int prodCount = prodList.size();
		System.out.println("Total brands are "+prodCount);
		System.out.println("Product names are listed below");
		for (WebElement webElement : prodList) {
			String prodName = webElement.getText();
			System.out.println(prodName);
		}
	

	}
}
