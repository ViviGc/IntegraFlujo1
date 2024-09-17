package com.integra.ach.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IntegraCargaMasivaObject extends PageObject {
    /**
     * Cargue masivo exitoso
     **/

    By lblPaginaCargaMasiva = By.xpath("//h2[contains(text(),'Carga Masiva')]");
    By btnGenerarArchvioDeControl = By.xpath("//button[contains(text(),'Generar Archivo de Control')]");
    By btnCargue = By.xpath("//button[contains(text(),'Cargue')]");
    By btnSiCargar = By.xpath("//button[contains(text(),'Si,Cargar')]");
    By lblGeneracionArchivoControlExitoso = By.xpath("//div[@id='statusBox']");
    By lblCargaExitosaPullCompleted = By.xpath("//*[contains(text(),'PULL_COMPLETED')]");

    /**
     * Cargue Masivo exitoso
     **/

    public By getLblPaginaCargaMasiva() {
        return lblPaginaCargaMasiva;
    }
    public By getBtnGenerarArchvioDeControl() {
        return btnGenerarArchvioDeControl;
    }
    public By getBtnCargue() {
        return btnCargue;
    }
    public By getLblGeneracionArchivoControlExitoso() {return lblGeneracionArchivoControlExitoso;}
    public By getBtnSiCargar() {return btnSiCargar;}
    public By getLblCargaExitosaPullCompleted() {return lblCargaExitosaPullCompleted;}
}
