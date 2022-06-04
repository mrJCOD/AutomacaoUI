package Iteracoes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://automacaocombatista.herokuapp.com/iteracoes/draganddrop";
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);


		Actions act = new Actions(driver);
		WebElement deElemento = driver.findElement(By.id("winston"));
		WebElement paraElemento = driver.findElement(By.id("dropzone"));
		act.dragAndDrop(deElemento, paraElemento).perform();
		
		

		
		

	}
}
