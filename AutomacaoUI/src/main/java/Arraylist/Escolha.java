package Arraylist;

import javax.swing.JOptionPane;

public class Escolha {

	public static void main(String[] args) {

		String[] opcoes = new String[] {
				
				"Vingadores - The avengers",
				"Vingadores - Era de ultron",
				"Vingadores - Guerra Infinita",
				"Vingadores - Ultimato",
				"Sair"
				
		};
		
		int opcaoEscolhida = 0;
		
		while(opcaoEscolhida != 4) {
			
			opcaoEscolhida = JOptionPane.showOptionDialog(
					null,
					"Qual filme deseja assistir?",
					"DevFlix",
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,
					opcoes,
					0
					);
			
			if(opcaoEscolhida != 4) {
				
				System.out.println("Você Assistiu: " + opcoes[opcaoEscolhida]);
			
				
				
			}
		}

	}

}
