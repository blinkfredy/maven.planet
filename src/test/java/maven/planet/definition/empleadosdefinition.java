package maven.planet.definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import maven.planet.steps.empleadossteps;
import net.thucydides.core.annotations.Steps;

public class empleadosdefinition {
	
	@Steps
	empleadossteps empleadosSteps;
	
	@Given("^logeado en planet \"([^\"]*)\" y \"([^\"]*)\"$")
	public void logeado_en_planet_y(String usuario, String password) throws Throwable {
		empleadosSteps.abrir_planet();
		empleadosSteps.ingresar_usuario(usuario);
		empleadosSteps.ingresar_password(password);
		empleadosSteps.click_btnLogin();
		empleadosSteps.verificar_login();
		empleadosSteps.click_encuentrame();
		empleadosSteps.click_empleados();

	}

	@When("^realizo busqueda de empleado$")
	public void realizo_busqueda_de_empleado() throws Throwable {
}

	@Then("^retorna cantidad de empleados$")
	public void retorna_cantidad_de_empleados() throws Throwable {

	}

}
