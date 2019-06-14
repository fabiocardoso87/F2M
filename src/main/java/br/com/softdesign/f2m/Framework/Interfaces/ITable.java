package br.com.softdesign.f2m.Framework.Interfaces;

import org.openqa.selenium.WebElement;

import java.util.List;

public interface ITable {

    String getNumeroRegistros();

    boolean isDisplayed();

    List<String> getHeaders();

    List<WebElement> getRows();

    boolean verificaSeTemEditarAndExluir();

}
