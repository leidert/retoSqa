package com.automationpractice.RetoUnoSqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrarCuentaPage {
	
private WebDriver driver;
	
	@FindBy(xpath = "//*[@id= 'uniform-id_gender1']/span/input[@id = 'id_gender1']")
	WebElement radioTitulo;
	
	@FindBy(xpath = "//input[@id='customer_firstname']")
	WebElement inputNombre;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	WebElement inputApellido;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement inputPassword;
	
	@FindBy(xpath="//select[@id='days']/option[@value='7']")
	WebElement selectCumpleAniosDia;
	
	@FindBy(xpath="//select[@id='months']/option[@value='10']")
	WebElement selectCumpleAniosMes;
	
	@FindBy(xpath="//select[@id='years']/option[@value='1990']")
	WebElement selectCumpleAniosAnio;
	
	@FindBy(xpath="//input[@id = 'newsletter']")
	WebElement checkboxBoletinNoticia;
	
	@FindBy(xpath="//input[@id = 'optin']")
	WebElement checkboxOfertaEspecial;
	
	@FindBy(xpath="//input[@id = 'company']")
	WebElement inputCompania;
	
	@FindBy(xpath="//input[@id = 'address1']")
	WebElement inputDireccion;
	
	@FindBy(xpath="//input[@id = 'city']")
	WebElement inputCiudad;
	
	@FindBy(xpath="//select[@id='id_state']/option[@value = '1']")
	WebElement selectEstado;
	
	@FindBy(xpath="//input[@id = 'postcode']")
	WebElement inputCodigoPostal;
	
	@FindBy(xpath="//select[@id = 'id_country']/option[@value='21']")
	WebElement selectPais;
	
	@FindBy(xpath="//textarea[@id = 'other']")
	WebElement textAreaComentario;
	
	@FindBy(xpath="//input[@id = 'phone']")
	WebElement inputTelefono;
	
	@FindBy(xpath="//input[@id = 'phone_mobile']")
	WebElement inputTelefonoCelular;
	
	@FindBy(xpath="//input[@id = 'alias']")
	WebElement inputAlias;
	
	@FindBy(xpath="//button[@id = 'submitAccount']")
	WebElement btnRegistrar;
	
	
	@FindBy(xpath="//a[@class = 'logout']")
	WebElement cerrarSesion;
	
	
	public RegistrarCuentaPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickRadioTitulo() {
		radioTitulo.click();
	}
	
	public void inputNombre(String texto) {
		this.inputNombre.sendKeys(texto);
	}
	
	public void inputApellido(String texto) {
		this.inputApellido.sendKeys(texto);
	}
	
	public void inputPassword(String texto) {
		this.inputPassword.sendKeys(texto);
	}
	
	public void selectCumpleAniosDia() {
		this.selectCumpleAniosDia.click();
	}
	
	public void selectCumpleAniosMes() {
		this.selectCumpleAniosMes.click();
	}
	
	public void selectCumpleAniosAnio() {
		this.selectCumpleAniosAnio.click();
	}
	
	public void checkboxBoletinNoticia() {
		this.checkboxBoletinNoticia.click();
	}
	
	public void checkboxOfertaEspecial() {
		this.checkboxOfertaEspecial.click();
	}
	
	public void inputCompania(String texto) {
		this.inputCompania.sendKeys(texto);
	}
	
	public void inputDireccion(String texto) {
		this.inputDireccion.sendKeys(texto);
	}
	
	public void inputCiudad(String texto) {
		this.inputCiudad.sendKeys(texto);
	}
	
	public void selectEstado() {
		this.selectEstado.click();
	}
	
	public void inputCodigoPostal(String texto) {
		this.inputCodigoPostal.sendKeys(texto);
	}
	
	public void selectPais() {
		this.selectPais.click();
	}
	
	public void textAreaComentario(String texto) {
		this.textAreaComentario.sendKeys(texto);
	}
	
	public void inputTelefono(String texto) {
		this.inputTelefono.sendKeys(texto);
	}
	
	public void inputTelefonoCelular(String texto) {
		this.inputTelefonoCelular.sendKeys(texto);
	}
	
	public void inputAlias(String texto) {
		this.inputAlias.clear();
		this.inputAlias.sendKeys(texto);
	}
	
	public void btnRegistrar() {
		this.btnRegistrar.click();
	}
	
	public void cerrarSesion() {
		this.cerrarSesion.click();
	}
	
	public void esperar() {
		try {
			Thread.sleep((long) (3*1000));
		} catch (InterruptedException var3) {
			var3.printStackTrace();
		}
	}
	
	public void registrarUsuario() {
		esperar();
		clickRadioTitulo();
		inputNombre("leider");
		inputApellido("tanos");
		inputPassword("password");
		selectCumpleAniosDia();
		selectCumpleAniosMes();
		selectCumpleAniosAnio();
		checkboxBoletinNoticia();
		checkboxOfertaEspecial();
		inputCompania("sqa");
		inputCiudad("Monteria");
		selectEstado();
		inputCodigoPostal("23003");
		textAreaComentario("qwsdfg");
		inputTelefono("123456789");
		inputTelefonoCelular("123456789");
		inputAlias("leider7");
		inputDireccion("qsghjjj");
		btnRegistrar();
		cerrarSesion();
	}
}
