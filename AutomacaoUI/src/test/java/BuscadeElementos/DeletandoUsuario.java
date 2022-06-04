package BuscadeElementos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos2;
import Metodos.Metodos2;

public class DeletandoUsuario {
	
	Metodos2 maria = new Metodos2();
	Elementos2 tchula = new Elementos2();

	@Before
	public void setUp() throws Exception {
		
		maria.iniciarTeste("https://automacaocombatista.herokuapp.com/users");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		maria.clique(tchula.getBotaoDeletarUsuario());
				
		maria.escreverNoAlerta("Mauro Rodrigues");
		
		maria.aceitarAlerta();
		
		
		

		
	}

}
