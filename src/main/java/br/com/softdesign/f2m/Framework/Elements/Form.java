package br.com.softdesign.f2m.Framework.Elements;

import br.com.softdesign.f2m.Framework.Utils.JavaScript;
import br.com.softdesign.f2m.Framework.Interfaces.IForm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Form implements IForm {

    WebDriver driver;
    WebElement element;
    JavaScript js;

    public Form(WebDriver driver, WebElement element) {
        this.driver = driver;
        this.element = element;
    }

    public void submit() {
        this.element.submit();
    }

    public void limparCampos() {
        js.execute("arguments[0].reset()", this.element);
    }

}
