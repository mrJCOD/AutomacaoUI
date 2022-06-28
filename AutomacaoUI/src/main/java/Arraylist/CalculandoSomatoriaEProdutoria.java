package Arraylist;

import javax.swing.JOptionPane;

public class CalculandoSomatoriaEProdutoria {

	public static void soma(int vetor[]) {
		
		int soma=0;
		
		for (int i = 0; i<vetor.length; i++) {
			
			soma = soma + vetor[i];
		}
		
		JOptionPane.showMessageDialog(null, "A somatoria eh :" + soma);
	}

	public static int produto(int vetor[]) {
		
		int produto=1;
		
		for(int i = 0; i<vetor.length; i++) {
			
			produto = produto * vetor[i];
		}
		
		return produto;
	}
	public static void main(String[] args) {
		
		int vetor[] = {4,3,6,5,6};
		int r;
		
		
		soma(vetor);
		r = produto(vetor);
		JOptionPane.showMessageDialog(null, "A produtoria eh " + r);
		System.exit(0);



	}

}