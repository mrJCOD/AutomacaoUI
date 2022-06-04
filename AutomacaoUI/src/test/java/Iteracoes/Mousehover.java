package Iteracoes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
	WebDriver driver;	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://automacaocombatista.herokuapp.com/iteracoes/mousehover";
		driver.get(URL);
		driver.manage().window().maximize();
		Actions action = new Actions(driver); //Método da classe Actions
		WebElement we = driver.findElement(By.xpath("//p[@class='activator']")); //Usando web element pra identificar o elemento no qual vc quer passar o mouse
		action.moveToElement(we).build().perform(); // Fazendo a acao de passar o mouse por cima do elemento destacado


	}
	
}