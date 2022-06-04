package BuscadeElementos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos2;
import Metodos.Metodos2;

public class RadioCheckBox {
	
	Metodos2 maria = new Metodos2();
	Elementos2 tchula = new Elementos2();

	@Before
	public void setUp() throws Exception {
		
		maria.iniciarTeste("https://automacaocombatista.herokuapp.com/buscaelementos/radioecheckbox");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(2000);
		maria.clique(tchula.getPurple());

	}

}
