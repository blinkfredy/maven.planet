package maven.planet.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features ="src/test/resources/features/")
//@CucumberOptions(features ="src/test/resources/features/Busqueda/empleados.feature")
//@CucumberOptions(features ="src/test/resources/features/ColorLib/nombre.feature")
@CucumberOptions(glue = { "maven.planet" }, features = {
"src/test/resources/features/Busqueda/empleados.feature" })
public class app {

}