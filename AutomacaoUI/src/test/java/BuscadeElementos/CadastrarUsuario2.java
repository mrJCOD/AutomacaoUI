package BuscadeElementos;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos2;
import Metodos.Metodos;

public class CadastrarUsuario2 {
	
	Metodos met = new Metodos();
	Elementos2 el = new Elementos2();



	@Before
	public void setUp() throws Exception {
		
		met.iniciarTeste("chrome", "https://todomvc.com/examples/angularjs/#/");


	}

	@After
	public void tearDown() throws Exception {

		met.printScr("print2");

	}

	@Test
	public void test() throws InterruptedException, IOException {
		
		met.digitar("Estudar assert", el.getCampoescrever());
		met.enter(el.getCampoescrever());
		String texto = met.pegarTexto(el.getValidacaoCampo());
		String textoEsperado = "Estudar assert";
		assertEquals(textoEsperado, texto);
		met.printScr("Nome do print");

		

	}

}
