package BuscadeElementos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Elementos.Elementos2;
import Metodos.Metodos2;

public class CadastrarUsuario2 {
	
	WebDriver driver;

	Metodos2 maria = new Metodos2();
	Elementos2 tchula = new Elementos2();

	@Before
	public void setUp() throws Exception {
		
		maria.iniciarTeste("https://automacaocombatista.herokuapp.com/users/new");

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void test() {
		
		maria.escrever("65646", tchula.getCampoNome());
		maria.escrever("de Tal", tchula.getUltimoNome());
		maria.escrever("fulano@gmail.com", tchula.getCampoEmail());
		maria.escrever("Rua codigo", tchula.getEndereco());
		maria.escrever("E2E Treinamentos", tchula.getUniversidade());
		maria.escrever("Analista de Testes", tchula.getProfissao());
		maria.escrever("Masculino", tchula.getGenero());
		maria.escrever("21", tchula.getIdade());
		maria.clique(tchula.getBotaoCriar());
		

	}

}
