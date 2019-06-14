package br.com.softdesign.f2m.TestCases;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.softdesign.f2m.Framework.Driver.Driver;
import br.com.softdesign.f2m.Tasks.Login.FazerLoginTasks;

public class FazerLoginTest {
	
/*   import br.com.softdesign.anc.TestCases.FazerLoginMultiplosUsuariosTest;
       import org.junit.runner.RunWith;
       import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
       FazerLoginMultiplosUsuariosTest.class,
})
*/
    private WebDriver driver = Driver.ChromeDriver();
    private FazerLoginTasks fazerLoginTasks;

    @Before
    public void init() {
        fazerLoginTasks = new FazerLoginTasks(this.driver);
        //System.out.println("BASE DE TESTE : " +System.getenv("URL_TEST"));
        this.driver.get("http://app-develop-pf2m.ingress.softdesign-rs.com.br");
    }

    @Test
    public void fazerLoginTest() throws InterruptedException {
        fazerLoginTasks.fazerLogin("teste@gmail.com", "meuteste");
        Thread.sleep(3000);
        Assert.assertTrue(this.driver.findElement(By.cssSelector("#root > div > div.container.col-md-8.col-sm-12 > form > div > div.jss23 > h4")).isDisplayed());
      //													    
    }

    @After
    public void fazerLogout() {
        //this.driver.close();
    }

}

