package maven.planet.pageobjects;

//import static org.junit.Assert.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://planet.choucairtesting.com/bin/login/Main/WebHome?origurl=/")

public class empleadospageobjects extends PageObject {
	
	public void usuario(String usuario) {		
		findBy("//*[@id=\"foswikiLogin\"]/div/form/div[2]/p[1]/input").and().type(usuario);		
	}
	public void password(String password) {
		findBy("//*[@id=\"foswikiLogin\"]/div/form/div[3]/p[2]/input").and().type(password);
	}
	
	public void btnLogin() {
		findBy("//*[@id=\"foswikiLogin\"]/div/form/div[4]/input").and().click();
	}
	
	public void VerificaLogin() {
		WebElementFacade lnkLogout = find(By.xpath("//*[@id=\"patternSideBarContents\"]/div[1]/ul/li/a"));
		String strMensaje = lnkLogout.getText();
		assertThat(strMensaje, containsString("Logout"));		
	}
	
	public void click_encuentrame() {
		findBy("//*[@id='patternSideBarContents']/span[7]/a").and().click();
	}
	public void click_empleados() {
		findBy("//*[@id=\"patternMainContents\"]/div[3]/div[1]/ul/li[1]/a").and().click();		
	}
}
