@CargaMasiva
Feature: Prueba de carga masiva

  @CargaMasivaExitosa
  Scenario Outline: Realizar una Carga Masiva Exitosa
    Given Login Exitoso <tipoDeEntidad> <usuario> <clave>
    When Ingresar a carga masiva y realizo la carga masiva
    Then Valido carga masiva exitosa y estado de archivo exitoso

    Examples:
      | tipoDeEntidad | usuario                           | clave           |
    ##@externaldata@./src/test/resources/Data/Data_CargaMasiva.xlsx@CargaMasiva
|"EF"|"operadorachaut@gmail.com"|"ColombiaAch.2023*"|
