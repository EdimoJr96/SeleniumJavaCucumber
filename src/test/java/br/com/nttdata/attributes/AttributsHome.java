package br.com.nttdata.attributes;

import org.openqa.selenium.By;

public class AttributsHome {
    protected By consentButton = By.id("consent");

    protected By menuCelulares(String menu){
        return By.xpath("//a[@title='" + menu + "']");
    }
}