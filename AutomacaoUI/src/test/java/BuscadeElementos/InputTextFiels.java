package BuscadeElementos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class InputTextFiels {

	Metodos met = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void setUp() throws Exception {

		met.iniciarTeste("chrome", "https://automacaocombatista.herokuapp.com/buscaelementos/inputsetextfield");

	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("Teste concluindo...");
	}

	@Test
	public void test() {
		
		
		

		
	}

}
