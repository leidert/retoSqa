package com.automationpractice.RetoUnoSqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IngresarEmailPage {
	
	private WebDriver driver;
	
	@FindBy(id = "SubmitCreate")
	WebElement btnRegistrar;
	
	@FindBy(id = "email_create")
	WebElement email;
	
	@FindBy(xpath="//div[@class = 'alert alert-danger']//li")
	WebElement errorEmail;
	
	public IngresarEmailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click(WebElement elemento) {
		elemento.click();
	}
	
	public void escribir( String texto) {
		this.email.sendKeys(texto);
	}
	
	public void esperar() {
		try {
			Thread.sleep((long) (3*1000));
		} catch (InterruptedException var3) {
			var3.printStackTrace();
		}
	}
	
	public void ingresarEmail() {
		esperar();
		escribir("leider84@mail.com");
		click(btnRegistrar);
	}	

	public String validarMensaje() {
		String mensaje = errorEmail.getText();
		return mensaje;
	}
}
