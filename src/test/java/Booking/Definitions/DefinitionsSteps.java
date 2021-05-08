package Booking.Definitions;

import org.openqa.selenium.WebDriver;

import Booking.Paginas.AmazonRegistroPagina;
import Booking.Steps.Conexion;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private AmazonRegistroPagina  amazonregistroPagina = new AmazonRegistroPagina(driver);

	

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}
	
	@When("^haga click en el boton Crear$")
	
	public void diligenciarFormulario() {
		
		
		this.amazonregistroPagina = new AmazonRegistroPagina(driver);
		this.amazonregistroPagina.RegistroAmazone();
			
		
	}

}