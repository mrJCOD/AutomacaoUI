package Metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos2 {
	
	public static WebDriver mauro;
	
	public static WebDriver navegador() {
		return mauro;

	}
	
	public void iniciarTeste(String parametro) { 
		
		System.setProperty("webdriver.chrome.driver", "C://driver-navegadores/chromedriver.exe");
		mauro = new ChromeDriver();
		mauro.get(parametro);
		mauro.manage().window().maximize();
		System.out.println("Abrindo Navegador Chrome");
		
	}
	
	public void escrever(String texto, By elemento) {
		mauro.findElement(elemento).sendKeys(texto);
		
	}
	
	public void clique(By elemento) {
		
		mauro.findElement(elemento).click();
		
	}
	
	public void apagar(By elemento) {
		
		mauro.findElement(elemento).clear();
		
		
	}
	
	public void aceitarAlerta() {
		
		mauro.switchTo().alert().accept();
	}
	
	public void recusarAlerta() {
		
		mauro.switchTo().alert().dismiss();
	}
	
	public void escreverNoAlerta(String texto) {
		
		mauro.switchTo().alert().sendKeys(texto);
		
	}
	
	public void printScr(String nome) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot)navegador());
		File nomeArq = scrShot.getScreenshotAs(OutputType.FILE);
		File destArq = new File("./src/evidencias/"+nome+".png");
		FileUtils.copyFile(nomeArq, destArq);


	}
	
	
	
	
	
	
	
	
	
	
	

}
