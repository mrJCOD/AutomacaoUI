package Arraylist;

import javax.swing.JOptionPane;

public class Modulos {

	public static void soma() {

		int n1, n2;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));

		JOptionPane.showMessageDialog(null, "A soma eh " + (n1 + n2));
	}

	public static void subtracao(int x, int y) {

		int result;
		result = x - y;
		JOptionPane.showMessageDialog(null, "A diferenca eh " + result);
	}

	public static int produto() {
		int n1, n2;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));

		return (n1 * n2);

	}

	public static double divisao(int x, int y) {

		double result;
		result = (double)x / (double)y;

		return result;

	}

	public static void main(String[] args) {
		
		int n1,n2,result;
		double r;
		
		soma();
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: ")); 
		subtracao(n1, n2);
		result = produto();
		JOptionPane.showMessageDialog(null, "O produto eh " + result);
		r = divisao(n1, n2);
		JOptionPane.showMessageDialog(null, "A divisao eh " + r);
		System.exit(0);
		
		
		
		

	}

}
