package Iteracoes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://driver-navegadores/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automacaocombatista.herokuapp.com/iteracoes/mousehover");
		
		Actions acao = new Actions(driver);
		WebElement elemento = driver.findElement(By.xpath("//p[@class='activator']"));
		acao.moveToElement(elemento).build().perform();

	}

}
