package BuscadeElementos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class Links {
	
	Elementos el = new Elementos();
	Metodos met = new Metodos();

	@Before
	public void setUp() throws Exception {
		
		met.iniciarTeste("chrome", "https://automacaocombatista.herokuapp.com/buscaelementos/links");
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("Teste Finalizado");
	}

	@Test
	public void test() {
		
		met.click(el.getSucesso());

		
	}

}
