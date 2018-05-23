package maven.planet.pageobjects;

//import static org.junit.Assert.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.WhenPageOpens;

import org.openqa.selenium.WebDriver;
import java.util.Map;

@DefaultUrl("http://planet.choucairtesting.com/bin/login/Main/WebHome?origurl=/")

public class empleadospageobjects extends PageObject {
	
	@FindBy(xpath="//*[@id=\"foswikiLogin\"]/div/form/div[2]/p[1]/input")
    private WebElementFacade txtUser;
	
	@FindBy(xpath="//*[@id=\"foswikiLogin\"]/div/form/div[3]/p[2]/input")
    private WebElementFacade txtPass;
	
	@FindBy(xpath="//*[@id=\"foswikiLogin\"]/div/form/div[4]/input")
    private WebElementFacade btnLogin;
	
	@FindBy(xpath="//*[@id=\"patternSideBarContents\"]/div[1]/ul/li/a")
    private WebElementFacade lnkLogout;
	
	@FindBy(xpath="//*[@id='patternSideBarContents']/span/a[contains(., 'Encuéntrame')]")
    private WebElementFacade lnkEncuentrame;
	
	@FindBy(xpath="//li/a[contains(., 'Empleados')]")
    private WebElementFacade lnkEmpleados;
	
	@FindBy(xpath="//*[@id=\"nombre\"]")
    private WebElementFacade txtNombre;
	
	@FindBy(xpath="//*[@id=\"apellidos\"]")
    private WebElementFacade txtApellidos;
	
	@FindBy(xpath="//*[@id=\"pais\"]")
    private WebElementFacade cmbPais;
	
	@FindBy(xpath="//*[@id=\"ciudad\"]")
    private WebElementFacade cmbCiudad;
	
	@FindBy(xpath="//*[@id=\"cliente\"]")
    private WebElementFacade cmbCliente;
	
	@FindBy(xpath="//*[@id=\"cargo\"]")
    private WebElementFacade cmbCargo;
	
	@FindBy(xpath="//*[@id=\"patternMainContents\"]/div[3]/div[1]/div[1]/table/tbody/tr[4]/td/a")
    private WebElementFacade lnkBuscar;
	
	@FindBy(xpath="//*[@id='loadingsearch']")
    private WebElementFacade imgLoading;
	
	
	@FindBy(xpath="//*[@id='tablaempleados']/tbody/tr/td/span[@style='float: left']")
    private WebElementFacade lblResult;
	
	public void usuario(String usuario) {		
		txtUser.type(usuario);		
	}
	public void password(String password) {
		txtPass.type(password);
	}
	
	public void btnLogin() {
		btnLogin.click();
	}
	
	public void VerificaLogin() {		
		String strMensaje = lnkLogout.getText();
		assertThat(strMensaje, containsString("Logout"));		
	}
	
	public void click_encuentrame() {
		lnkEncuentrame.click();
	}
	
	public void click_empleados() {
		lnkEmpleados.click();		
	}
	
	public void txtNombre(String nombre) {		
		txtNombre.type(nombre);		
	}	
	
	public void txtApellidos(String apellidos) {		
		txtApellidos.type(apellidos);		
	}
	
	public void cmbPais(String pais) {		
		cmbPais.selectByVisibleText(pais);	//Colombia
	}
	
	public void cmbCiudad(String ciudad) {		
		cmbCiudad.selectByVisibleText(ciudad);//Medellín	
	}
	
	public void cmbCliente(String cliente) {		
		cmbCliente.selectByVisibleText(cliente);//BTG Pactual	
	}
	
	public void cmbCargo(String cargo) {		
		cmbCargo.selectByVisibleText(cargo);//Automatizador - Analista de Pruebas	
	}
	
	public void lnkBuscar() {		
		lnkBuscar.click();		
		imgLoading.withTimeoutOf(10, TimeUnit.MINUTES).waitUntilNotVisible();
	}
	
	public void VerificaResult(String i) {			
		String strMensaje = lblResult.getText();
		assertThat(strMensaje, containsString("Se encontraron "+i+" empleados"));		
	}
}
