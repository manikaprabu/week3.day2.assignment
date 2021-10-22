package week3.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSorting {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("chkSelectDateOnly")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("txtStationFrom")).sendKeys("chennai egm", Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("txtStationTo")).sendKeys("Madurai Jn", Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> trainNameAtt = driver.findElements(By.xpath("//div[@id='divTrainsList']/table/tbody/tr/td/following-sibling::td[@style=';']"));	
		int trainCount = trainNameAtt.size();
		System.out.println("Total trains from chennai to madurai are " +trainCount);
		List<String> trainName = new ArrayList<String>();
		for (WebElement eachTrain : trainNameAtt) {
			System.out.println(eachTrain.getText());
			String trainNameEach = eachTrain.getText();
			trainName.add(trainNameEach);
		}
		Collections.sort(trainName);
		System.out.println("Train Name in ascending order");
		for (String eachTrain : trainName) {
			System.out.println(eachTrain);
			
		}
	}

}
