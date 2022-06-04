package Iteracoes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop3 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automacaocombatista.herokuapp.com/iteracoes/draganddrop");
		driver.manage().window().maximize();
		
		Actions acao = new Actions(driver);
		WebElement elementoA = driver.findElement(By.id("winston"));
		WebElement elementoB = driver.findElement(By.id("dropzone"));
		acao.dragAndDrop(elementoA, elementoB).perform();
		

	}

}
