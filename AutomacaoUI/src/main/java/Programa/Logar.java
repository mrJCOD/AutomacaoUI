package Programa;

public class Logar {

	public static void main(String[] args) {

		CadastroUsuario cad = new CadastroUsuario();
		
		cad.CadastroUsuario1("Mauro", 21, "teste@gmail.com");
		
		cad.selecionarPerfil2();
		cad.validarEmail();
		cad.validarSenha();
		

	}
	
	

}
