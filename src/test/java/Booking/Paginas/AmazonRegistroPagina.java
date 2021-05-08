package Booking.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import net.thucydides.core.annotations.Step;

public class AmazonRegistroPagina {

	private WebDriver driver;
	
//Elementos que se encuentran en la página
	
	@FindBy( how = How.ID, using = "createAccountSubmit")
	
//Variables que se utilizan dentro de la clase
	private WebElement btnCrear;
	
	
	
	//@FindBy(how = How.XPATH, using ="//input[@name = 'customerName']")
//	private textoNombre; 
	
	
	
	
// Creación de constructor
	public AmazonRegistroPagina (WebDriver driver) {
	
		//llamado a libreria de pagefactory donde vamos a utilizar la sentencia de localizadores
		PageFactory.initElements(driver, this);
	}

//Identificar los pasos que va a realizar	
	@Step
	
//esta es un metodo que vamos a utilizar en la clase definitionsStep
	public void RegistroAmazone() {
		btnCrear.click();
		
	
	}
	
	
	
	// git comentario
	
//	@Step
	
//	public void diligenciarCampo(String nombres) {
		
//		textoNombre.sendKeys(nombres);
		
//	}
	
}