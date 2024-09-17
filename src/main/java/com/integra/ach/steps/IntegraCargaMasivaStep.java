package com.integra.ach.steps;

import com.integra.ach.pageObject.IntegraCargaMasivaObject;
import com.integra.ach.utils.EsperaExplicita;
import com.integra.ach.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;

public class IntegraCargaMasivaStep {
    IntegraCargaMasivaObject integraCargaMasivaObject;

    String nombre;
    String estadoExitoso = "DEBULKED";
    String estado;

    /**
     * Consulta de cierres de ciclo
     **/
    @Step
    public void validaCargaPaginaCargaMasiva() {
        EsperaImplicita.esperaImplicitaWeb(3);
        EsperaExplicita.esperaexplilicitaClick(integraCargaMasivaObject.getDriver(), integraCargaMasivaObject.getLblPaginaCargaMasiva());
        integraCargaMasivaObject.getDriver().findElement(integraCargaMasivaObject.getLblPaginaCargaMasiva()).isEnabled();
    }

    @Step
    public void clickBotonGenerarArchivoControl() {
        EsperaImplicita.esperaImplicitaWeb(3);
        EsperaExplicita.esperaexplilicitaClick(integraCargaMasivaObject.getDriver(), integraCargaMasivaObject.getBtnGenerarArchvioDeControl());
        integraCargaMasivaObject.getDriver().findElement(integraCargaMasivaObject.getBtnGenerarArchvioDeControl()).click();
    }

    @Step
    public void validarArchivoDeControlGenerado() {
        EsperaExplicita.esperaexplilicitaClick(integraCargaMasivaObject.getDriver(), integraCargaMasivaObject.getLblGeneracionArchivoControlExitoso());
        Assert.assertThat(integraCargaMasivaObject.getDriver().findElement(integraCargaMasivaObject.getLblGeneracionArchivoControlExitoso()).isDisplayed(), Matchers.is(true));
    }

    @Step
    public void clickBotonCargue() {
        EsperaImplicita.esperaImplicitaWeb(3);
            EsperaExplicita.esperaexplilicitaClick(integraCargaMasivaObject.getDriver(), integraCargaMasivaObject.getBtnCargue());
        integraCargaMasivaObject.getDriver().findElement(integraCargaMasivaObject.getBtnCargue()).click();
    }

    @Step
    public void clickBotonSiCargar() {
        EsperaImplicita.esperaImplicitaWeb(3);
        EsperaExplicita.esperaexplilicitaClick(integraCargaMasivaObject.getDriver(), integraCargaMasivaObject.getBtnSiCargar());
        integraCargaMasivaObject.getDriver().findElement(integraCargaMasivaObject.getBtnSiCargar()).click();
    }

    @Step
    public void validarCargaMasivaExitosaPullCompleted() {
        EsperaExplicita.esperaexplilicitaClick(integraCargaMasivaObject.getDriver(), integraCargaMasivaObject.getLblCargaExitosaPullCompleted());
        Assert.assertThat(integraCargaMasivaObject.getDriver().findElement(integraCargaMasivaObject.getLblCargaExitosaPullCompleted()).isDisplayed(), Matchers.is(true));
    }

    @Step
    public void validarEstadoExitosoDeUnArchivoCargado(String archivo) {
        try {
            nombre = integraCargaMasivaObject.getDriver().findElement(By.xpath("(//div[@class='filelist-style cursorPointer'])[1]//ul//li[text()='" + archivo + " ']")).getText().substring(0, 13);
            System.out.println("EL NOMBRE DEL ARCHIVO ESS: " + nombre);
            Assert.assertEquals(nombre, archivo);
            estado = integraCargaMasivaObject.getDriver().findElement(By.xpath("(//div[@class='filelist-style cursorPointer'])[1]//ul//li[text()='" + archivo + " ']//ancestor::div[@class='filelist-style cursorPointer'][1]//following-sibling::div[@class='col-md-4']//span//span")).getText();
            System.out.println("EL ESTADO DEL ARCHIVO ESS: " + estado);
            Assert.assertEquals(estadoExitoso, estado);
        }catch (Exception e){
        }
        nombre = integraCargaMasivaObject.getDriver().findElement(By.xpath("(//div[@class='filelist-style cursorPointer'])[2]//ul//li[text()='" + archivo + " ']")).getText().substring(0, 13);
        System.out.println("EL NOMBRE DEL ARCHIVO ESS: " + nombre);
        Assert.assertEquals(nombre, archivo);
        estado = integraCargaMasivaObject.getDriver().findElement(By.xpath("(//div[@class='filelist-style cursorPointer'])[2]//ul//li[text()='" + archivo + " ']//ancestor::div[@class='filelist-style cursorPointer'][1]//following-sibling::div[@class='col-md-4']//span//span")).getText();
        System.out.println("EL ESTADO DEL ARCHIVO ESS: " + estado);
        Assert.assertEquals(estadoExitoso, estado);    }
}
