package BuscadeElementos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos2;
import Metodos.Metodos2;

public class EditandoUsuario {
	
	Metodos2 maria = new Metodos2();
	Elementos2 tchula = new Elementos2();


	@Before
	public void setUp() throws Exception {
		
		maria.iniciarTeste("https://automacaocombatista.herokuapp.com/users/3098");
		
		
	}

	@After
	public void tearDown() throws Exception {
		
		
		
	}

	@Test
	public void test() throws InterruptedException {
		
		maria.clique(tchula.getBotaoEditar()); // clicando no elemento
		Thread.sleep(2000);
		maria.apagar(tchula.getEdicaoRua()); // apagando o texto contido no elemento
		maria.escrever("Rua Alphaville", tchula.getEdicaoRua());
		maria.clique(tchula.getBotaoCriarEdicao());
		
		
		
		
	}

}
