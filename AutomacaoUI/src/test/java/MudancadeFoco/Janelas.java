package MudancadeFoco;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class Janelas {
	
	Metodos met = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void setUp() throws Exception {
		
		met.iniciarTeste("chrome", "https://automacaocombatista.herokuapp.com/mudancadefoco/janela");
		
	}
	
	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() throws InterruptedException {
		
		met.click(el.getCliqueAqui());
		Thread.sleep(2000);
		met.alternarAba0();
		Thread.sleep(2000);
		met.alternarAba1();

		
	}

}
