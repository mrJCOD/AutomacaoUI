package MudancadeFoco;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janelas2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automacaocombatista.herokuapp.com/mudancadefoco/janela");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@href='/mudancadefoco/newwindow'])[2]")).click();
		ArrayList<String> aba = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(aba.get(1));
		driver.findElement(By.xpath("(//a[@class='collapsible-header waves-teal'])[4]")).click();
		driver.findElement(By.xpath("//a[@href='/iteracoes/draganddrop']")).click();

	}

}
