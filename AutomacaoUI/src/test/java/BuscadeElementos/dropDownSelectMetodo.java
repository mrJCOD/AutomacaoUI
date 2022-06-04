package BuscadeElementos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import Metodos.Metodos;

public class dropDownSelectMetodo {
	
	Metodos met = new Metodos();

	@Before
	public void setUp() throws Exception {
		
		met.iniciarTeste("chrome", "https://www.facebook.com/campaign/landing.php?&campaign_id=1661784632&extra_1=s%7Cc%7C320269324047%7Ce%7Cfacebook%7C&placement=&creative=320269324047&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D1661784632%26adgroupid%3D63686352403%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-541132862%26loc_physical_ms%3D1001773%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIzNnC0NXN9wIVGneRCh1yKgvzEAAYASAAEgJjxfD_BwE");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		met.select(By.name("birthday_day"), "4", "4", 3);

	}

}
