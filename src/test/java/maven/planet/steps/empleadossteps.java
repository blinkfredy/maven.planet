package maven.planet.steps;

import maven.planet.pageobjects.empleadospageobjects;
import net.thucydides.core.annotations.Step;

public class empleadossteps {
	
	empleadospageobjects empleadosPageObjects;
	
	@Step
	public void abrir_planet() {
		empleadosPageObjects.open();
	}
	
	@Step
	public void ingresar_usuario(String usuario) {		
		empleadosPageObjects.usuario(usuario);
	}
	
	@Step
	public void ingresar_password(String password) {
		empleadosPageObjects.password(password);
	} 

	@Step
	public void click_btnLogin() {
		empleadosPageObjects.btnLogin();
	} 
	
	@Step
	public void verificar_login() {
		empleadosPageObjects.VerificaLogin();
	} 
	@Step
	public void click_encuentrame() {
		empleadosPageObjects.click_encuentrame();
	} 
	@Step
	public void click_empleados() {
		empleadosPageObjects.click_empleados();
	} 
}
