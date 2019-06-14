package br.com.softdesign.f2m.Tasks.Login;

import org.openqa.selenium.WebDriver;

import br.com.softdesign.f2m.FrameworkLayer.Login.LoginFrameworkLayer;

public class FazerLoginTasks extends LoginFrameworkLayer{
	
	public FazerLoginTasks(WebDriver driver){
		super(driver);
	}

	public void fazerLogin(CharSequence usuario, CharSequence senha) {
		try {
			txtCampoEmail.sendKeys(usuario);
			txtCampoSenha.sendKeys(senha);
			btnEntrar.click();
			/*if(this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div")).isDisplayed()) {
				return false;
			}*/
		} catch (Exception ex ) {
			System.out.println(ex.getMessage());
		}
		//return true;
	}

}
