package MudancadeFoco;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class Iframe {
	
	Metodos met = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void setUp() throws Exception {
		
		met.iniciarTeste("chrome", "https://automacaocombatista.herokuapp.com/mudancadefoco/iframe");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		met.iframe("id_do_iframe");
		met.digitar("Mauro", el.getNomeInput());
	}

}

