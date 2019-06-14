package br.com.softdesign.f2m.Framework.Interfaces;

public interface IAlert {

    boolean dismiss();

    boolean accept();

    boolean sendKeys(String texto);

    boolean getText();

}
