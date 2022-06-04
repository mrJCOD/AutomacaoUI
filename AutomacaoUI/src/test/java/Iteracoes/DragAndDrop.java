package Iteracoes;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://automacaocombatista.herokuapp.com/iteracoes/draganddrop";
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

//Método da classe Actions para arrastar e soltar 

		Actions builder = new Actions(driver);
		WebElement from = driver.findElement(By.id("winston")); // elemento no qual vc quer arrastar
		WebElement to = driver.findElement(By.id("dropzone")); // elemento no qual vai receber o elemento acima puxado
		builder.dragAndDrop(from, to).perform(); // Execute arrastar e soltar

	}
}
