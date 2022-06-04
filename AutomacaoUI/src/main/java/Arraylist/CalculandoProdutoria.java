package Arraylist;

import javax.swing.JOptionPane;

//Declarar variaveis: vetor de inteiros
//Recebe numeros inteiros num vetor de 5 posicoes
//calcula a somatoria e a produtoria desses numeros com um procedimento e uma funcao, ambos sem parametros
//Mostrar as informacoes para o usuario

public class CalculandoProdutoria {
	
	public static void soma() {
		
		int s=0, vetor[] = {1,2,3,4,5};
		
		for (int i = 0; i<vetor.length; i++) {
			
			s = s + vetor[i];
		}
		
		JOptionPane.showMessageDialog(null, "A somatoria eh :" + s);
	}

	public static int produto() {
		
		int p=1, vetor[] = {1,2,3,4,5};
		
		for(int i = 0; i<vetor.length; i++) {
			
			p = p * vetor[i];
		}
		
		return p;
	}
	public static void main(String[] args) {
		
		int r;
		
		soma();
		r = produto();
		JOptionPane.showMessageDialog(null, "A produtoria eh " + r);
		System.exit(0);
		


	}

}
