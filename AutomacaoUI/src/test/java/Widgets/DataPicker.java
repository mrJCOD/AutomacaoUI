package Widgets;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class DataPicker {
	
	Metodos met = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void setUp() throws Exception {
		
		met.iniciarTeste("Chrome", "https://automacaocombatista.herokuapp.com/widgets/datapicker");
		
		
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("Teste Finalizado...");
		
		
	}

	@Test
	public void test() throws InterruptedException {
		
		met.click(el.getDatepicker());
		Thread.sleep(2000);
		met.click(el.getProximo());
		Thread.sleep(2000);
		met.click(el.getProximo());
		Thread.sleep(2000);
		met.click(el.getDataEscolha());
		Thread.sleep(2000);
		met.click(el.getOk());
		

	}
	

}

