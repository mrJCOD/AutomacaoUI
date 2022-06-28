package Arraylist;

import javax.swing.JOptionPane;

public class CocienteEPotencia {

	public static void main(String entrada[]) {
		
		int n1, n2, div;
		double pot;
		String msg = "";
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
		
		div = n1 / n2;
		pot = Math.pow(n1, n2);
		
		msg = msg + "quociente da divisao de " + n1 + " por " + n2 + " = " + div + "\n";
		msg = msg + "potencia de " + n1 + " por " + n2 + " = " + pot + "\n";
		JOptionPane.showMessageDialog(null, msg);
		
		System.exit(0);
		

	}

}
