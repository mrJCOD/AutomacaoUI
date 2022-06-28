//Desenvolva um programa em java que:
//Declare variaveis: inteira, caracter e String;
//Recebe um numero para calcular a tabuada desse numero e uma opcao por qual tipo de repeticao calcular a tabuada;
//Calcula a tabuada pelas repeticoes for, while e do/while;
//mostra a tabuada calculada pela opcao escolhida

package Arraylist;

import javax.swing.JOptionPane;

public class CalculandoTabuada {

	public static void main(String entrada[]) {
		// variaveis
		String msg = "",
				msgEntry = "Digite 1 para repeticao for\nDigite 2 para repeticao While\nDigite 3 para repeticao do/While";
		int tabuada;
		char op = 0;

		// Entrada de dados
		tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro."));
		op = (JOptionPane.showInputDialog(msgEntry)).charAt(0);



		switch (op) {
		case '1': {
			msg = msg + "Tabuada do " + tabuada + " pelo for: \n\n";
			for (int i = 1; i <= 10; i = i + 1) {

				msg = msg + tabuada + " x " + i + " = " + tabuada * i + "\n";
				
			}
			System.out.println(msg);
			break;
			

		}

		case '2': {
			msg = msg + "Tabuada do " + tabuada + " pelo while \n\n";
			int i = 1;
			while (i <= 10) {
				msg = msg + tabuada + " x " + i + " = " + tabuada * i + "\n";
				i = i + 1;
				
			}
			System.out.println(msg);
			break;
		}
		case '3': {
			msg = msg + "Tabuada do " + tabuada + " pelo do/While: \n\n";
			int i = 1;
			do {
				msg = msg + tabuada + " x " + i + " = " + tabuada * i + "\n";
				i = i + 1;
			} while (i <= 10);
			System.out.println(msg);
			break;

		}

		default:
			JOptionPane.showMessageDialog(null, "Opcao Invalida, calculos nao realizados.");
		}

	}
	

}
