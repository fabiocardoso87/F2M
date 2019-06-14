package br.com.softdesign.f2m.Framework.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.softdesign.f2m.Framework.Interfaces.ITable;

import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;

public class Table implements ITable {

    public WebDriver driver;
    public WebElement element;

    public Table(WebDriver driver, WebElement element) {
        this.driver = driver;
        this.element = element;
    }

    public String getNumeroRegistros() {
        return this.element.findElement(By.xpath("//*[@id=\"changelist-form\"]/text()")).getText().trim().split(" ")[0];
    }

    public List<String> getHeaders() {
        List<String> lista = new ArrayList<>();
        for(WebElement element : this.element.findElements(By.xpath("//*[@id=\"result_list\"]/tbody/tr[1]/th"))) {
            lista.add(element.getText());
        }
        return lista;
    }

    public List<WebElement> getRows() {
        this.element.findElement(By.linkText("Show all")).click();
        return this.element.findElements(By.tagName("tr"));
    }

    public boolean isDisplayed() {
        return this.element.isDisplayed();
    }

    public boolean verificaSeTemEditarAndExluir() {
        boolean is = true;
        for(WebElement element : this.getRows()) {
            if(!element.findElement(By.tagName("a")).isDisplayed() || !element.findElement(By.tagName("button")).isDisplayed()) {
                is = false;
            }
        }
        return is;
    }

}