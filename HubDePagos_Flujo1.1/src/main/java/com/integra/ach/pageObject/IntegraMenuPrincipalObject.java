package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraMenuPrincipalObject extends PageObject {
    By btnModuloDeCiclos = By.xpath("//span[contains(text(),'Módulo de Ciclos')]");
    By btnModuloDeTransferencias = By.xpath("//span[contains(text(),'Módulo de Transferencias')]");
    By btnCargaMasiva = By.xpath("//span[contains(text(),'Carga Masiva')]");
    By btnInstruccionesRecibidas = By.xpath("(//span[contains(text(),'Instrucciones Recibidas')])[1]");
    By btnVistaLista = By.xpath("//body/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/i[1]");

    public By getBtnModuloDeCiclos() {
        return btnModuloDeCiclos;
    }
    public By getBtnModuloDeTransferencias() {return btnModuloDeTransferencias;}
    public By getBtnCargaMasiva() {
        return btnCargaMasiva;
    }
    public By getBtnInstruccionesRecibidas() {return btnInstruccionesRecibidas;}
    public By getBtnVistaLista() {return btnVistaLista;}
}
