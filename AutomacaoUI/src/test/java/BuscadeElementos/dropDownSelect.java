package BuscadeElementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownSelect {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver mauro = new ChromeDriver();
		mauro.get(
				"https://www.facebook.com/campaign/landing.php?&campaign_id=1661784632&extra_1=s%7Cc%7C320269324047%7Ce%7Cfacebook%7C&placement=&creative=320269324047&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D1661784632%26adgroupid%3D63686352403%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-541132862%26loc_physical_ms%3D1001773%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIzNnC0NXN9wIVGneRCh1yKgvzEAAYASAAEgJjxfD_BwE");
		mauro.manage().window().maximize();
		
		//Selecionando o dia
		WebElement dDia = mauro.findElement(By.name("birthday_day"));
		Select select = new Select(dDia);
		select.selectByValue("4");
		select.selectByVisibleText("4");
		select.selectByIndex(3);
		
		//selecionando o mes
		WebElement dMes = mauro.findElement(By.name("birthday_month"));
		Select select2 = new Select(dMes);
		select2.selectByValue("3");
		select2.selectByVisibleText("Mar");
		select2.selectByIndex(2);
		
		//
		WebElement dAno = mauro.findElement(By.name("birthday_year"));
		Select select3 = new Select(dAno);
		select3.selectByValue("2019");
		select3.selectByVisibleText("2019");
		select3.selectByIndex(3);
		

	}

}
