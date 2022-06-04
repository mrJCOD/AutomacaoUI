package MudancadeFoco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Alertas2 {
	

	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automacaocombatista.herokuapp.com/mudancadefoco/alert");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[@class='btn  waves-light green'])[1]")).click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@class='btn  waves-light green'])[2]")).click();
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@class='btn  waves-light green'])[3]")).click();
		driver.switchTo().alert().sendKeys("Mauro Rodrigues Junior");
		driver.switchTo().alert().accept();
		
		

	}

}
