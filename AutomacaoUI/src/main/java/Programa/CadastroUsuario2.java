package Programa;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CadastroUsuario2 {

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

	public void validarAutenticacao() {
		String senhaCliente = "teste";
		String senha;
		int i = 1;
		int j = 2;
		senha = JOptionPane.showInputDialog("Digite sua senha");

		if (senha == "teste") {
			System.out.println("Login sucesso");
		}
				
				while (i<4) {
					
					senha = JOptionPane.showInputDialog("Digite sua senha");
					
					
					
					if(senha != senhaCliente) {
						if (j>0) {
							JOptionPane.showMessageDialog(null, "Voce errou sua senha, Digite novamente. sobram " + j + " vezes");
						}else {
							JOptionPane.showInternalMessageDialog(null, "Voce bloqueou sua senha");
						}
						
					}
						
					j--;
					i++;
					
				//	if (i==4 && senha != senhaCliente) {
				//		
				//		JOptionPane.showInternalMessageDialog(null, "Voce bloqueou sua senha");
				//		System.out.println("Voce bloqueou sua senha");
				//		
				//	}
					
				}
				
			}
			

	
	
	public void selecionarPerfil() {
		
		char op = 0;
		
		op = (JOptionPane.showInputDialog("Selecione sua conta")).charAt(0);
		
		switch (op) {
		case '1': {
			
			System.out.println("Peronalite Selecionado");
		
		}
		
		case '2':{
			
			System.out.println("Peronalite Selecionado");
		}
			
			
		}
		
		
		
	}
	


}
