package Widgets;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DataPicker2 {

	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://automacaocombatista.herokuapp.com/widgets/datapicker");
		driver.manage().window().maximize();
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		
		
	}

	@Test
	public void test() throws InterruptedException {
		
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("(//input[@class='select-dropdown dropdown-trigger'])[1]")).click();
		driver.findElement(By.xpath("']")).click();

		
		
		


	}
	

}

