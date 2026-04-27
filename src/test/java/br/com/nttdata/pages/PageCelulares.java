package br.com.nttdata.pages;

import br.com.nttdata.attributes.AttributsCelulares;
import org.openqa.selenium.WebDriver;

public class PageCelulares extends AttributsCelulares {
    private WebDriver driver;

    public PageCelulares(WebDriver pdriver){
        this.driver = pdriver;
    }

    public void escolherOSegundoAparelho(){
        driver.findElement(segundoCelularDaLista).click();
    }
}