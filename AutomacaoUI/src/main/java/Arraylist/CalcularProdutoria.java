package Arraylist;

import javax.swing.JOptionPane;

public class CalcularProdutoria {

	public static void main(String[] args) {

		String msg="", msgEntry="Digite um numero inteiro";
		int num1, num2, result = 1;
		char op = 0;
		
		//entrada de dados
		num1 = Integer.parseInt(JOptionPane.showInputDialog(msgEntry));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(msgEntry));
		op = JOptionPane.showInputDialog("Digite 1 para calcular o produto\nDigite 2 para produtoria").charAt(0);
		
		
		switch (op) {
		
		case '1':{
			
			if(num1>0 && num2>0) {
				
				result = num1*num2;
				msg = msg + "Produto de " + num1 + " por " + num2 + " = " + result + "\n\n";
				System.out.println(msg);
				
			}break;
		}
		case '2':{
			
			for(int i=1; i<=num2; i=i+1) {
				
				result = result * num1;
			}
			msg = msg + "Produtoria de " + num1 + ", " + num2 + " vezes eh: " + result + "\n\n";
			System.out.println(msg);
		}
		
		}

	}

}
