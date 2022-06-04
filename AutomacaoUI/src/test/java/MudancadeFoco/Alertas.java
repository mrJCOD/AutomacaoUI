package MudancadeFoco;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class Alertas {
	
	Metodos met = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void setUp() throws Exception {
		
		met.iniciarTeste("chrome", "https://automacaocombatista.herokuapp.com/mudancadefoco/alert");
		
	}

	@After
	public void tearDown() throws Exception {
		

	}

	@Test
	public void test() throws InterruptedException {
		
		met.click(el.getJsAlerta());
		met.aceitarAlerta();
		met.click(el.getJsConfirma());
		met.aceitarAlerta();
		met.click(el.getJsPrompt());
		Thread.sleep(3000);
		met.escreverPrompt("Hello Wolrd");
		met.aceitarAlerta();
		
	}
	

}
