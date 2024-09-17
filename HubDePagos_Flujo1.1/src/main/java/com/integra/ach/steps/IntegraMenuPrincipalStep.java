package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraMenuPrincipalObject;
import com.integra.ach.utils.EsperaImplicita;
import com.integra.ach.utils.Robot;
import net.thucydides.core.annotations.Step;

import java.awt.*;


public class IntegraMenuPrincipalStep {
    Robot robot = new Robot();
    IntegraMenuPrincipalObject integraMenuPrincipalObject;

    public IntegraMenuPrincipalStep() throws AWTException {
    }


    @Step
    public void clickModuloDeCiclos() throws AWTException {
        while (integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloDeCiclos()).isDisplayed()) {
            break;
        }
        EsperaImplicita.esperaImplicitaWeb(3);
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloDeCiclos()).click();
    }
    @Step
    public void clickModuloDeTransferencias() throws AWTException {
        while (integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloDeTransferencias()).isDisplayed()) {
            break;
        }
        EsperaImplicita.esperaImplicitaWeb(3);
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnModuloDeTransferencias()).click();
    }

    @Step
    public void clickCargaMasiva() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(1);
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnCargaMasiva()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
    }
    @Step
    public void clickCInstruccionesRecibidas() throws AWTException {
        EsperaImplicita.esperaImplicitaWeb(120);
        integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnInstruccionesRecibidas()).click();
        EsperaImplicita.esperaImplicitaWeb(2);
        try {
            integraMenuPrincipalObject.getDriver().findElement(integraMenuPrincipalObject.getBtnVistaLista()).click();
            EsperaImplicita.esperaImplicitaWeb(2);
        }catch (Exception e){
        }
    }
}