package com.automationpractice.RetoUnoSqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoguearCuentaPage {
	
private WebDriver driver;
	
	@FindBy(xpath = "//form[@id = 'login_form']/h3[@class = 'page-subheading']")
	WebElement tituloLOgueo;
	
	@FindBy(xpath  = "//*[@id='email']")
	WebElement emailLOgueo;
	
	
	@FindBy(xpath = "//input[@id = 'passwd']")
	WebElement passwordLOgueo;
	
	
	@FindBy(xpath = "//button[@class = 'button btn btn-default button-medium']")
	WebElement btnLOgueo;
	
	@FindBy(xpath="//p[@class='info-account']")
	WebElement registroExitoso;
	
	@FindBy(xpath="//a[@class = 'account']/span")
	WebElement validaruserName;
	
	public LoguearCuentaPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String tituloLOgueo() {
		String mensaje = tituloLOgueo.getText();
		return mensaje;
	}
	
	public void emailLogueo(String texto) {
		this.emailLOgueo.sendKeys(texto);
	}
	
	public void passwordLOgueo(String texto) {
		passwordLOgueo.sendKeys(texto);
	}
	
	public void btnLOgueo() {
		btnLOgueo.click();
	}
	
	public String registroExitoso() {
		String mensaje = this.registroExitoso.getText();
		return mensaje;
	}
	
	public String validaruserName() {
		String mensaje = this.validaruserName.getText();
		return mensaje;
	}
	
	public void esperar() {
		try {
			Thread.sleep((long) (3*1000));
		} catch (InterruptedException var3) {
			var3.printStackTrace();
		}
	}
	
	public void loguearUsuario() {
		esperar();
		emailLogueo("leider67@mail.com");
		passwordLOgueo("password");
		btnLOgueo.click();
	}
}
