package com.integra.ach.stepDefinitions;

import com.integra.ach.steps.IntegraCargaMasivaStep;
import com.integra.ach.steps.IntegraInicioStep;
import com.integra.ach.steps.IntegraMenuPrincipalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class CargaMasivaExitosoStepDefinition {

    @Steps
    IntegraInicioStep integraInicioStep;
    @Steps
    IntegraMenuPrincipalStep integraMenuPrincipalStep;
    @Steps
    IntegraCargaMasivaStep integraCargaMasivaStep;

    @Given("^Login Exitoso \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void loginExitoso(String tipoDeEntidad, String usuario, String clave) {
        integraInicioStep.abrirWeb();
        integraInicioStep.seleccionarTipoEntidad(tipoDeEntidad);
        integraInicioStep.clickBotonVamos();
        integraInicioStep.escribirUsuarioYContrasena(usuario, clave);
        integraInicioStep.clickIngresar();
        integraInicioStep.validarInicioDeSesion();
    }

    @When("^Ingresar a carga masiva y realizo la carga masiva$")
    public void ingresarAModulodeCiclosYRealizoCargaMasiva() throws AWTException {
        integraMenuPrincipalStep.clickModuloDeCiclos();
        integraMenuPrincipalStep.clickCargaMasiva();
        integraCargaMasivaStep.validaCargaPaginaCargaMasiva();
        integraCargaMasivaStep.clickBotonGenerarArchivoControl();
        integraCargaMasivaStep.validarArchivoDeControlGenerado();
        integraCargaMasivaStep.clickBotonCargue();
        integraCargaMasivaStep.clickBotonSiCargar();

    }

    @Then("^Valido carga masiva exitosa y estado de archivo exitoso $")
    public void validoMensajeCargaExitosa() throws AWTException {
        integraCargaMasivaStep.validarCargaMasivaExitosaPullCompleted();
        integraMenuPrincipalStep.clickModuloDeTransferencias();
        integraMenuPrincipalStep.clickCInstruccionesRecibidas();
        //     integraCargaMasivaStep.validarEstadoExitosoDeUnArchivoCargado();
    }

    @Then("^Valido carga masiva exitosa y estado de archivo exitoso$")
    public void validoCargaMasivaExitosaYEstadoDeArchivoExitoso() throws AWTException {
        {
            integraCargaMasivaStep.validarCargaMasivaExitosaPullCompleted();
            integraMenuPrincipalStep.clickModuloDeTransferencias();
            integraMenuPrincipalStep.clickCInstruccionesRecibidas();
        }

    }
}

