package br.com.softdesign.f2m.Framework.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.softdesign.f2m.Framework.Interfaces.IMensagem;

public class Mensagem implements IMensagem {

    WebDriver driver;
    WebElement element;

    public Mensagem(WebDriver driver, WebElement element) {
        this.driver = driver;
        this.element = element;
    }

    public String getMessage() {
        return this.element.getText();
    }

}