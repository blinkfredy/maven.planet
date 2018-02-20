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
		findBy("//*[@id='patternSideBarContents']/span/a[contains(., 'Encuéntrame')]").and().click();
	}
	
	public void click_empleados() {
		findBy("//li/a[contains(., 'Empleados')]").and().click();		
	}
	
	public void txtNombre(String nombre) {		
		findBy("//*[@id=\"nombre\"]").and().type(nombre);		
	}	
	
	public void txtApellidos(String apellidos) {		
		findBy("//*[@id=\"apellidos\"]").and().type(apellidos);		
	}
	
	public void cmbPais(String pais) {		
		findBy("//*[@id=\"pais\"]").and().selectByVisibleText(pais);	
	}
	
	public void cmbCiudad(String ciudad) {		
		findBy("//*[@id=\"ciudad\"]").and().selectByVisibleText(ciudad);//Medellín	
	}
	
	public void lnkBuscar() {		
		findBy("//*[@id=\"patternMainContents\"]/div[3]/div[1]/div[1]/table/tbody/tr[4]/td/a").and().click();
		WebElementFacade imgLoading = find(By.xpath("//*[@id='loadingsearch']"));
		imgLoading.waitUntilNotVisible();
	}
	
	public void VerificaResult(String i) {
		WebElementFacade lblResult = find(By.xpath("//*[@id='tablaempleados']/tbody/tr/td/span[@style='float: left']"));
		String strMensaje = lblResult.getText();
		assertThat(strMensaje, containsString("Se encontraron "+i+" empleados"));		
	}
}
