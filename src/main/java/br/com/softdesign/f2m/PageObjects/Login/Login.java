package br.com.softdesign.f2m.PageObjects.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	@FindBy(xpath="//*[@id=\"root\"]/div/form/div/div[2]/div[1]/div/input")
	public WebElement campoEmail;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/form/div/div[2]/div[2]/div/input")
	public WebElement campoSenha;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/form/div/div[2]/button")
	public WebElement botaoEntrar;
	
}
