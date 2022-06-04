package Formulario;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class teste {
	Metodos met = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void setUp() throws Exception {
		
		met.iniciarTeste("chrome", "https://www.tuasaude.com/beneficios-da-laranja/");
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		
		String texto = met.pegarTexto(el.getTexto());
		String textoDesejado = "Uma boa forma de obter esses benefícios, é consumir pelo menos 1 laranja por dia ou 150 mL do suco natural, que é muito rico em nutrientes mas tem a desvantagem de não possuir as fibras que existem na fruta crua. Além disso, a laranja adicionada em receitas cozidas ou que vão ao forno tem menos nutrientes que a fruta crua.";
		assertEquals(texto, textoDesejado);
		met.fechar();
		
		
	}

}
