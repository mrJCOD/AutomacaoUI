package Elementos;

import org.openqa.selenium.By;

public class Elementos2 {
	//criar usuario
	private By campoNome = By.id("user_name");
	private By ultimoNome = By.id("user_lastname");
	private By campoEmail = By.id("user_email");
	private By endereco = By.id("user_address");
	private By universidade = By.id("user_university");
	private By profissao = By.id("user_profile");
	private By genero = By.id("user_gender");
	private By idade = By.id("user_age");
	private By botaoCriar = By.xpath("//*[@id='new_user']/div[5]/div/div");
	//editar usuario
	private By botaoEditar = By.xpath("//a[@href='/users/3098/edit']");
	private By edicaoRua = By.id("user_address");
	private By botaoCriarEdicao = By.xpath("//div[@class='actions btn waves-effect green']");
	private By botaoDeletarUsuario = By.xpath("(//a[@href='/users/2970'])[2]");
	
	//checkbox
	private By purple = By.xpath("//label[@for='purple']");
	private By red = By.xpath("//label[@for='red']");
	private By blue = By.xpath("//label[@for='blue']");
	private By yellow = By.xpath("//label[@for='yellow']");
	private By green = By.xpath("//label[@for='green']");
	private By grey = By.xpath("//label[@for='grey']");
	private By black = By.xpath("//label[@for='black']");
	private By white = By.xpath("//label[@for='white']");
	
	
	
	//Alertas
	

	private By alerta1 = By.xpath("(//button[@class='btn  waves-light green'])[1]");
	private By alerta2 = By.xpath("(//button[@class='btn  waves-light green'])[2]");
	private By alerta3 = By.xpath("(//button[@class='btn  waves-light green'])[3]");
	
	
	private By campoescrever = By.xpath("//input[@ng-model='newTodo']");
	private By validacaoCampo = By.xpath("//label[@class='ng-binding']");
	
	
	
	
	
	public By getCampoNome() {
		return campoNome;
	}
	public By getUltimoNome() {
		return ultimoNome;
	}
	public By getCampoEmail() {
		return campoEmail;
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
	public By getBotaoCriar() {
		return botaoCriar;
	}
	public By getBotaoEditar() {
		return botaoEditar;
	}
	public By getEdicaoRua() {
		return edicaoRua;
	}
	public By getBotaoCriarEdicao() {
		return botaoCriarEdicao;
	}
	public By getBotaoDeletarUsuario() {
		return botaoDeletarUsuario;
	}
	public By getPurple() {
		return purple;
	}
	public By getAlerta1() {
		return alerta1;
	}
	public By getAlerta2() {
		return alerta2;
	}
	public By getAlerta3() {
		return alerta3;
	}
	public By getCampoescrever() {
		return campoescrever;
	}
	public By getValidacaoCampo() {
		return validacaoCampo;
	}
	public By getRed() {
		return red;
	}
	public By getBlue() {
		return blue;
	}
	public By getYellow() {
		return yellow;
	}
	public By getGreen() {
		return green;
	}
	public By getGrey() {
		return grey;
	}
	public By getBlack() {
		return black;
	}
	public By getWhite() {
		return white;
	}
	
	

}
