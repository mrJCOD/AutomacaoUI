package Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPicker3 {

	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://automacaocombatista.herokuapp.com/widgets/datapicker");
		driver.manage().window().maximize();
		
		String texto = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/h5")).getText().trim();
		
		System.out.println(texto);

	}

}
