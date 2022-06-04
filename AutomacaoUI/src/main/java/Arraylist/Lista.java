package Arraylist;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		ArrayList<String> funcionario = new ArrayList<String>();
		funcionario.add("Mauro");
		funcionario.add("Maria");
		funcionario.add("Fulano");
		funcionario.add("Ciclano");

		System.out.println(funcionario.toString());
		funcionario.remove(0);
		System.out.println(funcionario.toString());
		System.out.println(funcionario.get(1));
		System.out.println(funcionario.contains("Ciclano"));
		System.out.println(funcionario.size());
		System.out.println(funcionario.isEmpty());
		funcionario.clear();

	}

}
