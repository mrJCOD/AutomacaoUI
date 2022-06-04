package Arraylist;

import javax.swing.JOptionPane;

public class Aula05 {

	public static void main(String[] args) {
		
		String msg = "", msgEntry = "Digite um numero inteiro";
		int num1, num2, result = 0;
		char op = 0;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog(msgEntry));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(msgEntry));
		op = (JOptionPane.showInputDialog("Digite 1 para adicao\nDigite 2 para somatoria\n")).charAt(0);
		
		switch(op) {
		
		case '1': {
			
			if(num1%2==0 && num2%2==0) {
				result = num1 + num2;
				msg = msg + "Soma de " + num1 + " por " + num2 + " = " + result + "\n\n";
				System.out.println(msg);
			
			}
			break;
		
		}
		case '2':{
			for(int i=1; i<=num2; i=i+1) {
				
				result = result + num1;
			}
			
			msg = msg + "Somatoria de " + num1 + ", " + num2 + " vezes eh: " + result + "\n\n";
			System.out.println(msg);
			break;
			}
		default: JOptionPane.showMessageDialog(null, "Opcao invalida, calculos nao realizados.");
		}
		
}

}

