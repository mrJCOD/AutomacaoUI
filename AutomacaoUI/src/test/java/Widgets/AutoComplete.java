package Widgets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://driver-navegadores/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com.br");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
		List <WebElement> listItems = driver.findElements(By.id("matches"));
		listItems.get(2).click();
		driver.findElement(By.id("icon")).click();
		

		// Thread.sleep(2000);
		// driver.findElement(By.id("autocomplete-input")).sendKeys("São P");
		// List<WebElement> options = driver.findElements(By.id("autocomplete-input"));
		// options.get(1).click();

	}

}
