package BuscadeElementos;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastrarUsuario3 {

	private static WebDriver driver;

	public static WebDriver navegador() {
		return driver;
	}

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C://driver-navegadores/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://automacaocombatista.herokuapp.com/users/new");
		driver.manage().window().maximize();
		System.out.println("Abrindo Navegador Chrome"); 

	}

	@After
	public void tearDown() throws Exception {

	//	TakesScreenshot scrShot = ((TakesScreenshot) navegador()); //metodo para chamar o screen shot
		//File nomeArq = scrShot.getScreenshotAs(OutputType.FILE); // metodo para dar o nome do arquivo
		//File destArq = new File("./src/evidencias/" + "print1" + ".png"); //metodo para criar o screenshot na pasta evidencia
		//FileUtils.copyFile(nomeArq, destArq);//metodo para copiar o arquivo para a pasta destinada
	//	driver.quit();
	//	System.out.println("Teste finalizado com sucesso!");

	}

	@Test
	public void test() throws InterruptedException {

		driver.findElement(By.name("user[name]")).sendKeys("Josivaldo");
		String nomeCapturado = driver.findElement(By.name("user[name]")).getAttribute("value");
		String nomeEsperado = "Josivaldo";
		assertEquals(nomeEsperado, nomeCapturado);
		
		

	}

}
