package com.automationpractice.PruebaSQA.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automationpractice.RetoUnoSqa.pages.IngresarEmailPage;
import com.automationpractice.RetoUnoSqa.pages.LoguearCuentaPage;
import com.automationpractice.RetoUnoSqa.pages.PaginaPrincipalPage;
import com.automationpractice.RetoUnoSqa.pages.RegistrarCuentaPage;

public class IngresarEmailTest {

	private WebDriver driver;
	
	static final String REGISTRO_EXITOSO = "Welcome to your account. Here you can manage all of your personal information and orders.";
	static final String NOMBRE_USUARIO = "leider tanos";
	static final String URL = "http://automationpractice.com/index.php";
	static final String TITULO_LOGUEO = "ALREADY REGISTERED?";
	
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","src/test/java/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	
	@Test
	public void ingresarEmail() {

		paginaPrincipalObject().registrar();
		ingresarCorreoObjec().ingresarEmail();
		registrarCuentaObject().registrarUsuario();
		
	}
	
	public PaginaPrincipalPage paginaPrincipalObject() {
		PaginaPrincipalPage page = new PaginaPrincipalPage(driver);
		return page;
	}
	
	public IngresarEmailPage ingresarCorreoObjec() {
		IngresarEmailPage ingresarCorreo = new IngresarEmailPage(driver);
		return ingresarCorreo;
	}
	
	public RegistrarCuentaPage registrarCuentaObject(){
		RegistrarCuentaPage registrarCuenta = new RegistrarCuentaPage(driver);
		return registrarCuenta;
	}
	
	public LoguearCuentaPage loguearCuentaObject() {
		LoguearCuentaPage loguearCuenta = new LoguearCuentaPage(driver);
		return loguearCuenta;
	}
	
	@After
	public void imprimirMensajeError() {
		assertEquals(loguearCuentaObject().tituloLOgueo(), TITULO_LOGUEO);
		loguearCuentaObject().loguearUsuario();
		assertEquals(loguearCuentaObject().registroExitoso(), REGISTRO_EXITOSO);
		assertEquals(loguearCuentaObject().validaruserName(), NOMBRE_USUARIO);
	}
	
}
