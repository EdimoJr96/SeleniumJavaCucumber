package br.com.nttdata.attributes;

import org.openqa.selenium.By;

public class AttributsCelulares {
    public By segundoCelularDaLista = By.xpath("(//a[@class='product-card product-card--grid'])[2]");
    public By popUpPromocao = By.xpath("(//a[@class='product-card product-card--grid'])[2]"); //pegar o caminho correto depois
}