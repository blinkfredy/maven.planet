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
	
	@Step
	public void txtNombre(String nombre) {
		empleadosPageObjects.txtNombre(nombre);
	} 
	
	@Step
	public void txtApellidos(String apellido) {
		empleadosPageObjects.txtApellidos(apellido);
	} 
	
	@Step
	public void cmbPais(String pais) {
		empleadosPageObjects.cmbPais(pais);
	} 
	
	@Step
	public void cmbCiudad(String ciudad) {
		empleadosPageObjects.cmbCiudad(ciudad);
	} 
	
	@Step
	public void cmbCargo(String cargo) {
		empleadosPageObjects.cmbCargo(cargo);
	} 
	
	@Step
	public void cmbCliente(String cliente) {
		empleadosPageObjects.cmbCliente(cliente);
	} 
	
	@Step
	public void lnkBuscar() {
		empleadosPageObjects.lnkBuscar();		
	} 
	
	@Step
	public void VerificarResultado(String i) {
		empleadosPageObjects.VerificaResult(i);		
	} 
}
