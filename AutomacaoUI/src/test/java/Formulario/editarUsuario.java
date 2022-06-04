package Formulario;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class editarUsuario {
	
	Metodos met = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void setUp() throws Exception {
		
		met.iniciarTeste("chrome", "https://automacaocombatista.herokuapp.com/users");
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("Teste Finalizado");
	}

	@Test
	public void test() {
		
		met.click(el.getEditar());
		met.digitar("Testao", el.getNome());
		met.click(el.getEditarUsuario());
		
	}
	

}