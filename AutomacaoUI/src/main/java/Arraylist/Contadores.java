package Arraylist;

public class Contadores {

	public static void main3(String[] args) {

        String textoExemplo = "Brasil Espanha";

        int comprimentoTexto = textoExemplo.length();

        System.out.println("Comprimento do texto: " + comprimentoTexto);

        int comprimentoTextoSemEspacos = textoExemplo.replace(" ", "").length();
        System.out.println("Comprimento do texto sem Espacos: " + comprimentoTextoSemEspacos);
        

    }
	
	public static void main2(String[] args) {
		
		String textoExemplo2 = "Texto de exemplo         ";

        long totalCharacters = textoExemplo2.chars().filter(ch -> ch != ' ').count();

        System.out.println("Existe um total de: " + totalCharacters + " caracteres no texto");
		
	}
	
	public static void main(String[] args) {
		
		String textoExemplo = "Mauro";

        int totalCharacters = 0;
        char temp;
        for (int i = 0; i < textoExemplo.length(); i++) {

            temp = textoExemplo.charAt(i);
            if (temp == 'M')
                totalCharacters++;
        }

        System.out.println("A letra M aparece " + totalCharacters + " vezes no texto");
		
	}

}
