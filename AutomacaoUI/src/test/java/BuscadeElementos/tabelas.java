package BuscadeElementos;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Metodos.Metodos;

public class tabelas extends Metodos {

	@Before
	public void setUp() throws Exception {

		iniciarTeste("chrome", "https://automacaocombatista.herokuapp.com/buscaelementos/table");

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void validandoLinhas() {
		
		List<WebElement> linhas = driver.findElements(By.xpath("//table[@class='centered highlight']/tbody/tr"));

		//List<WebElement> linhas = driver.findElements(By.xpath("//table[@class='centered highlight']/tbody/tr"));
		int tamanhoLinhas = linhas.size();
		System.out.println(tamanhoLinhas);
		
								//8        adicionar 1 ao i a primeira vez que rodar vai estar 1, quando ele rodar denovo ele vai adicionar 1 ao i entao vai ser 2
		for (int i = 1;	i <= tamanhoLinhas;	i++) { // para cada i eu vou rodar esse loop 
			

			System.out.println(driver.findElement(
						By.xpath("//table[@class='centered highlight']/tbody/tr["+i+"]")) 
						.getText());


		}

	}
	
	@Test
	public void validandoColuna() {
		
		List<WebElement> coluna = driver.findElements(By.xpath("//table[@class='centered highlight']/thead/tr/th"));
		int tamanhoColuna = coluna.size();
		System.out.println(tamanhoColuna);
		
		for(int i=1; i<=tamanhoColuna; i++) {
			
			String nomeColuna = driver.findElement(By.xpath("//table[@class='centered highlight']/thead/tr/th["+i+"]")).getText();
			System.out.println(nomeColuna);
		}
		
		
		
		
	}

}
