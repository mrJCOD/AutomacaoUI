package BuscadeElementos;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import Metodos.Metodos;

public class CadastrarUsuario4 extends Metodos {
	
	//tt1

	@Before
	public void setUp() throws Exception {
		
		iniciarTeste("chrome", "https://automacaocombatista.herokuapp.com/users/new");
		
		
	} 

	@After
	public void tearDown() throws Exception {
		
		
		printScr("ValidandoCadastroDeUsuario");
		fechar();
	}

	@Test
	public void Validando_Cadastro_De_Usuario() {
		//digitando nos campos
		digitar("Josivaldo" , getNome());
		digitar("Silva", getUltimoNome());
		digitar("teste@gmail.com", getEmail());
		digitar("Rua 1", getEndereco());
		digitar("DESCOMPLICA", getUniversidade());
		digitar("Analista", getProfissao());
		digitar("Masculino", getGenero());
		digitar("26", getIdade());
		
		//validacao da minha digitacao INPUT TEXT AREA
		String nome = driver.findElement(getNome()).getAttribute("value");
		Assert.assertEquals("Josivaldo", nome);
		
		String h5 = driver.findElement(By.xpath("//h5")).getText();
		Assert.assertEquals("Novo Usuário!!", h5);
		
		String campoNome = driver.findElement(By.xpath("//label[@for='user_Nome *']")).getText();
		Assert.assertEquals("Nome *", campoNome);
		
		click(getCriar());
		
		String ActualURL = driver.getCurrentUrl();
		Assert.assertEquals(ActualURL, "https://automacaocombatista.herokuapp.com/users/3332" );
		
		
		
		
	}

}
