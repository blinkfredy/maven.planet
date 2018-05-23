package maven.planet.definition;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import maven.planet.steps.empleadossteps;
import net.thucydides.core.annotations.Steps;

public class empleadosdefinition {
	
	@Steps
	empleadossteps empleadosSteps;
	
	@Given("^logeado en planet con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void logeado_en_planet_con_usuario_y_clave(String usuario, String password) throws Throwable {
		empleadosSteps.abrir_planet();
		empleadosSteps.ingresar_usuario(usuario);
		empleadosSteps.ingresar_password(password);
		empleadosSteps.click_btnLogin();
		empleadosSteps.verificar_login();
	}
	
	@And("^ingresando a buscar empleado$")
	public void ingresando_a_buscar_empleado() throws Throwable {
		empleadosSteps.click_encuentrame();
		empleadosSteps.click_empleados();	
	}

	@When("^realizo busqueda de empleado con nombre \"([^\"]*)\" y apellidos \"([^\"]*)\"$")
	public void realizo_busqueda_de_empleado_con_nombre_y_apellidos(String nombre, String apellidos) throws Throwable {		
		empleadosSteps.txtNombre(nombre);
		empleadosSteps.txtApellidos(apellidos);
		empleadosSteps.lnkBuscar();
	}
	
	@When("^realizo busqueda de empleado con país \"([^\"]*)\", ciudad \"([^\"]*)\" y cargo \"([^\"]*)\"$")
	public void realizo_busqueda_de_empleado_con_país_ciudad_y_cargo(String pais, String ciudad, String cargo) throws Throwable {
	    empleadosSteps.cmbPais(pais);
		empleadosSteps.cmbCiudad(ciudad);
		//empleadosSteps.cmbCargo(cargo);
		empleadosSteps.lnkBuscar();
	}
	
	@When("^realizo busqueda de empleado con cargo \"([^\"]*)\" y cliente \"([^\"]*)\"$")
	public void realizo_busqueda_de_empleado_con_cargo_y_cliente(String cargo, String cliente) throws Throwable {
	    empleadosSteps.cmbCargo(cargo);
	    empleadosSteps.cmbCliente(cliente);
		empleadosSteps.lnkBuscar();
	}

	@When("^realizo busqueda de empleado con todos los campos del formulario$")
	public void realizo_busqueda_de_empleado_con_todos_los_campos_del_formulario(DataTable dtDatosPlanet) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> data   = dtDatosPlanet.raw();
	    
		for (int i = 1; i<data.size(); i++)
		{
			empleadosSteps.llenarFormularioEncuentrame(data, i);
			empleadosSteps.lnkBuscar();
		}
	}
	
	@Then("^retorna \"([^\"]*)\" empleados$")
	public void retorna_empleados(String i) throws Throwable {
		empleadosSteps.VerificarResultado(i);
	}

}
