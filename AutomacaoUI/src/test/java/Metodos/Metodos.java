package Metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import Elementos.Elementos;
import Elementos.Elementos3;

public class Metodos extends Elementos3{

	Elementos el = new Elementos();
	public static WebDriver driver;

	public static WebDriver navegador() {
		return driver;

	}

	public void iniciarTeste(String browser, String url) {

		if (browser.equalsIgnoreCase("Chrome")) {

			System.out.println("Iniciando Google Chrome...");
			System.setProperty("webdriver.chrome.driver", "C://driver-navegadores/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} else if (browser.equalsIgnoreCase("Firefox")) {

			System.out.println("Iniciando Firefox...");
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);

		} else if (browser.equalsIgnoreCase("edge")) {

			System.out.println("Iniciando Microsoft Edge...");
			System.setProperty("webdriver.edge.driver", "./driver/edgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url);

		} else {

			System.out.println("Nenhum navegador Web configurado com este nome.");
		}

	}

	public void click(By elemento) {

		driver.findElement(elemento).click();
	}

	public void enter(By elemento) {

		driver.findElement(elemento).submit();
	}

	public void digitar(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void apagar(By elemento) {

		driver.findElement(elemento).clear();
	}

	public void cadastrarUsuario(String nome, String sobreNome, String email, String endereco, String universidade,
			String profissao, String genero, String idade) {

		driver.findElement(el.getNome()).sendKeys(nome);
		driver.findElement(el.getUltimoNome()).sendKeys(sobreNome);
		driver.findElement(el.getEmail()).sendKeys(email);
		driver.findElement(el.getEndereco()).sendKeys(endereco);
		driver.findElement(el.getUniversidade()).sendKeys(universidade);
		driver.findElement(el.getProfissao()).sendKeys(profissao);
		driver.findElement(el.getGenero()).sendKeys(genero);
		driver.findElement(el.getIdade()).sendKeys(idade);
	}

	public void aceitarAlerta() {

		driver.switchTo().alert().accept();
	}

	public void escreverPrompt(String texto) {

		driver.switchTo().alert().sendKeys(texto);
	}

	public String pegarTexto(By elemento) {

		return driver.findElement(elemento).getText();

	}

	public void fechar() {

		driver.quit();
	}

	public void iframe(String id) {

		driver.switchTo().frame(id);
		

	}

	public void alternarAba0() {

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
	}

	public void alternarAba1() {

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

	}
	
	public void buscarElemento(By elemento) {
		
		driver.findElement(elemento);
		
	}
	
	public void select(By elemento, String texto, String value, int index) {
		
		WebElement wElement = driver.findElement(elemento);
		Select select = new Select(wElement);
		select.selectByIndex(index);
		select.selectByValue(value);
		select.selectByVisibleText(texto);
		
	}
	
	public void scroll() {
		
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,300)");
	}
	
	public void printScr(String nome) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot)navegador());
		File nomeArq = scrShot.getScreenshotAs(OutputType.FILE);
		File destArq = new File("./src/evidencias/"+nome+".png");
		FileUtils.copyFile(nomeArq, destArq);

	}
	
public void validarElementoVisivel(By elemento) {
		
		boolean validacao = driver.findElement(elemento).isDisplayed();
		assertTrue(validacao);
	}
	
	public void validarTexto(By elemento, String texto) {
		
		String textoGet = pegarTexto(elemento);
		String textoEsperado = texto;
		assertEquals(textoEsperado, textoGet);
	}
	
	


	
}
