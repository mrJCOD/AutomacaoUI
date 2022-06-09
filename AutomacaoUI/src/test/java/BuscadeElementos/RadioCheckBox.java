package BuscadeElementos;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Elementos.Elementos2;
import Metodos.Metodos2;

public class RadioCheckBox extends Metodos2 {

	Elementos2 tchula = new Elementos2();

	@Before
	public void setUp() throws Exception {

		//iniciarTeste("https://courses.letskodeit.com/practice");
		iniciarTeste("https://automacaocombatista.herokuapp.com/buscaelementos/radioecheckbox");
	}

	@After
	public void tearDown() throws Exception {

	}


	@Test
	public void test() {
		
		clique(tchula.getRed());
		clique(tchula.getYellow());
		
		
		WebElement elemento1 = mauro.findElement(By.id("red"));
		WebElement elemento2 = mauro.findElement(By.id("yellow"));
		
		Assert.assertEquals(elemento1.isSelected(), true);
		
		
		if (elemento1.isSelected() == true) {

			System.out.println("O checkbox foi marcado");

		} else {
			System.out.println("O checkbox nao esta funcionando");
		}

		if (elemento2.isSelected() == true) {

			System.out.println("O checkbox foi marcado");

		} else {
			System.out.println("O checkbox nao esta funcionando");
		}
		
		
	}

}
