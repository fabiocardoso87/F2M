package br.com.softdesign.f2m.FrameworkLayer.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import br.com.softdesign.f2m.Framework.Elements.Button;
import br.com.softdesign.f2m.Framework.Elements.TextField;
import br.com.softdesign.f2m.PageObjects.Login.Login;


public class LoginFrameworkLayer {
	
	public WebDriver driver;
	
	protected TextField txtCampoEmail;
	protected TextField txtCampoSenha;
	protected Button btnEntrar;
	
	public LoginFrameworkLayer(WebDriver driver) {
		this.driver = driver;
		Login LoginPageObject = PageFactory.initElements(driver, Login.class);
		this.txtCampoEmail = new TextField(driver, LoginPageObject.campoEmail);
		this.txtCampoSenha = new TextField(driver, LoginPageObject.campoSenha);
		this.btnEntrar = new Button(driver, LoginPageObject.botaoEntrar);
	}
}
