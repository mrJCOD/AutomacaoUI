package Programa;

import javax.swing.JOptionPane;

public class CadastroUsuario {

	private String nome;
	private int idade;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void CadastroUsuario1(String nome, int idade, String email) {

		setNome(nome);
		setIdade(idade);
		setEmail(email);

		if (idade >= 18) {

			System.out.println("Parabens, usuario cadastrado com sucesso");

		} else {
			System.out.println("O usuario deve ter 18 anos ou mais.");
		}

	}

	public void validarEmail() {

		String email;

		email = JOptionPane.showInputDialog("Digite seu email");
		System.out.println(email);

		if (email.contains("teste@gmail.com")) {

			JOptionPane.showInternalMessageDialog(null, "Bem vindo " + email);

		} else {

			email = JOptionPane.showInputDialog("email nao cadastrado");

		}

	}

	public void validarSenha() {

		String senha;
		int i = 1;
		int j = 2;

		senha = JOptionPane.showInputDialog("Digite sua senha");
		System.out.println(senha);

		if (senha.contains("teste")) {

			JOptionPane.showInternalMessageDialog(null, "Login bem sucedido");

		} else {

			while (i < 3) {

				senha = JOptionPane.showInputDialog("Voce errou sua senha, Digite novamente. sobram " + j + " vezes");

				j--;
				i++;

				if (senha.contains("teste")) {

					JOptionPane.showInternalMessageDialog(null, "Login bem sucedido");

					break;
				}

				if (i == 3) {

					JOptionPane.showInternalMessageDialog(null, "Voce bloqueou sua senha");

				}

			}

		}

	}

	public void selecionarPerfil() {

		char op = 0;

		op = (JOptionPane.showInputDialog("Selecione sua conta")).charAt(0);

		switch (op) {
		case '1': {

			System.out.println("Peronalite Selecionado");

		}

		case '2': {

			System.out.println("Business Selecionado");
		}

		case '3': {

			System.out.println("Business Selecionado");
		}

		}

	}

	public void selecionarPerfil2() {

		String[] opcoes = new String[] {

				"Conta - Personalite", "Conta - Business", "Conta - Basico", "Sair"

		};

		int opcaoEscolhida = 0;

		opcaoEscolhida = JOptionPane.showOptionDialog(null, "Qual conta deseja acessar?", "Lotus Bank",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, 0);

		if (opcaoEscolhida != 3) {

			System.out.println("Voce escolheu: " + opcoes[opcaoEscolhida]);

		}
		if (opcaoEscolhida == 3) {

			System.exit(0);

		}

	}

}
