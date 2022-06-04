package Formulario;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class criarUsuario {
	
	Metodos met = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void setUp() throws Exception {
		
		met.iniciarTeste("Chrome", "https://automacaocombatista.herokuapp.com/users/new");
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("Teste Finalizado.");
	}

	@Test
	public void test() {

		met.cadastrarUsuario("Testinho", "Silva" , "teste@gmail.com", "Rua label", "E2E Treinamentos", "Analista", "Masculino", "13");
		met.click(el.getCadastrar());
		
	}

}
