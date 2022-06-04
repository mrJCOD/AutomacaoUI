package Outros;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automacaocombatista.herokuapp.com/outros/uploaddearquivos");
		driver.findElement(By.id("upload")).sendKeys("C:\\Users\\mauro\\Desktop\\Slides aulinha.pptx");
		
		

	}

}
