package Iteracoes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover2 {
	WebDriver driver;	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://www.amazon.com.br/";
		driver.get(URL);
		driver.manage().window().maximize();
		Actions action = new Actions(driver); //Método Actions
		WebElement we = driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']")); //Usando web element pra identificar o elemento no qual vc quer passar o mouse
		action.moveToElement(we).build().perform(); // Fazendo a acao de passar o mouse por cima do elemento destacado
		driver.findElement(By.xpath("(//a[@class='nav-link nav-item'])[2]")).click();


	}
}