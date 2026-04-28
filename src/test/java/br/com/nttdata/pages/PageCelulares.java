package br.com.nttdata.pages;

import br.com.nttdata.attributes.AttributsCelulares;
import io.cucumber.java.zh_cn.而且;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageCelulares extends AttributsCelulares {
    private WebDriver driver;

    public PageCelulares(WebDriver pdriver){
        this.driver = pdriver;
    }

    public void escolherOSegundoAparelho(){
        driver.findElement(segundoCelularDaLista).click();
    }

    public void fecharPopUpSeVisivel(){

        try {
            WebElement elementoPopUpPromocao = driver.findElement(popUpPromocao);

            if(elementoPopUpPromocao.isDisplayed()){
                elementoPopUpPromocao.click();
            }
        }catch (Exception e){
            System.out.println("Pop UP não apresentado em tela");
        }


    }
}