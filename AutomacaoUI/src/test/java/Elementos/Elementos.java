package Elementos;

import org.openqa.selenium.By;

public class Elementos {
	//Criar Usuario
	private By nome = By.id("user_name");
	private By ultimoNome = By.id("user_lastname");
	private By email = By.id("user_email");
	private By endereco = By.id("user_address");
	private By universidade = By.id("user_university");
	private By profissao = By.id("user_profile");
	private By genero = By.id("user_gender");
	private By idade = By.id("user_age");
	private By cadastrar = By.xpath("//*[@id=\"new_user\"]/div[5]/div/div");
	
	//Listar usuario 2967
	private By editar = By.xpath("//a[@href='/users/2967/edit']");
	private By editarUsuario = By.xpath("//*[@id=\"edit_user_2967\"]/div[5]/div/div");
	
	//Deletar usuario 2967
	private By deletar2967 = By.xpath("/html/body/div[3]/div/table/tbody/tr[1]/td[11]/a");
	
	//Testar links
	private By sucesso = By.xpath("//a[@href='/buscaelementos/success']");
	private By badRequest = By.xpath("//a[@href='/buscaelementos/badrequest']");
	private By pageNotFound = By.xpath("//a[@href='/buscaelementos/notfound']");
	private By internalServerErros = By.xpath("//a[@href='/buscaelementos/internalservererror']");
	
	//Input e TextArea
	private By nomeInput = By.id("first_name");
	private By sobrenomeInput = By.id("last_name");
	private By senhaInput = By.id("password");
	private By emailInput = By.id("email");
	private By textAreaInput = By.id("textarea1");
	
	//datepicker
	
	private By datepicker = By.id("datepicker");
	private By mes = By.xpath("(//input[@class='select-dropdown dropdown-trigger'])[1]");
	private By mesdeEscolha = By.xpath("//*[@id=\"select-options-0ba9addd-1f7d-76a9-b854-77cabe09f43d6\"]");
	private By dia6 = By.xpath("(//button[@class='datepicker-day-button'])[14]");
	private By dataEscolha = By.xpath("(//button[@class='datepicker-day-button'])[1]");
	private By ok = By.xpath("//button[@class='btn-flat datepicker-done waves-effect']");
	private By proximo = By.xpath("//button[@class='month-next']"); 
	private By lista = By.id("select-options-392d73ad-ad16-631a-d132-665727a4a786");
	
	//teste
	
	private By pesquisar = By.name("q");
	private By texto = By.xpath("//*[@id='articleContent']/p[2]");
	
	//Alertas
	private By jsAlerta = By.xpath("(//button[@class='btn  waves-light green'])[1]");
	private By jsConfirma = By.xpath("(//button[@class='btn  waves-light green'])[2]");
	private By jsPrompt = By.xpath("(//button[@class='btn  waves-light green'])[3]");
	
	//NovaAba
	private By cliqueAqui = By.xpath("(//a[@href='/mudancadefoco/newwindow'])[2]");
	
	//Botoes
	private By botao1 = By.id("teste");
	private By botao2 = By.xpath("//a[@class='btn-floating btn-large waves-light red']");
	private By botao3 = By.xpath("//a[@class='waves-teal btn-flat']");
	private By botao4 = By.xpath("//button[@class='btn waves-light']");
	
	//text
	private By eTexto = By.xpath("//div[@class='card-content']/p[1]");
	
	public By getNomeInput() {
		return nomeInput;
	}
	public By getSobrenomeInput() {
		return sobrenomeInput;
		
	}
	public By getSenhaInput() {
		return senhaInput;
	}
	public By getEmailInput() {
		return emailInput;
	}
	public By getTextAreaInput() {
		return textAreaInput;
	}
	public By getNome() {
		return nome;
	}
	public By getSucesso() {
		return sucesso;
	}
	public By getBadRequest() {
		return badRequest;
	}
	public By getPageNotFound() {
		return pageNotFound;
	}
	public By getInternalServerErros() {
		return internalServerErros;
	}
	public By getUltimoNome() {
		return ultimoNome;
	}
	public By getEmail() {
		return email;
	}
	public By getEndereco() {
		return endereco;
	}
	public By getUniversidade() {
		return universidade;
	}
	public By getProfissao() {
		return profissao;
	}
	public By getGenero() {
		return genero;
	}
	public By getIdade() {
		return idade;
	}
	public By getCadastrar() {
		return cadastrar;
	}
	public By getEditar() {
		return editar;
	}
	public By getEditarUsuario() {
		return editarUsuario;
	}
	public By getDeletar2967() {
		return deletar2967;
	}
	public By getDatepicker() {
		return datepicker;
	}
	public By getMes() {
		return mes;
	}
	public By getMesdeEscolha() {
		return mesdeEscolha;
	}
	public By getDataEscolha() {
		return dataEscolha;
	}
	public By getOk() {
		return ok;
	}
	public By getProximo() {
		return proximo;
	}
	public By getPesquisar() {
		return pesquisar;
	}
	public By getTexto() {
		return texto;
	}
	public By getJsAlerta() {
		return jsAlerta;
	}
	public By getJsConfirma() {
		return jsConfirma;
	}
	public By getJsPrompt() {
		return jsPrompt;
	}
	public By getCliqueAqui() {
		return cliqueAqui;
	}
	public By getBotao1() {
		return botao1;
	}
	public By getBotao2() {
		return botao2;
	}
	public By getBotao3() {
		return botao3;
	}
	public By getBotao4() {
		return botao4;
	}
	public By getDia6() {
		return dia6;
	}
	public By getLista() {
		return lista;
	}
	public By geteTexto() {
		return eTexto;
	}

	

}
