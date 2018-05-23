@FeatureTest
Feature: busqueda empleados

  @Scenario1
  Scenario: buscar por nombre y apellido
    Given logeado en planet con usuario "ralvarez" y clave "Bendicion2015d"
    And ingresando a buscar empleado
    When realizo busqueda de empleado con nombre "John Fredy" y apellidos "Clavijo Parra"
    Then retorna "1" empleados

  @Scenario2
  Scenario: buscar por país, ciudad y cargo
    Given logeado en planet con usuario "ralvarez" y clave "Bendicion2015d"
    And ingresando a buscar empleado
    When realizo busqueda de empleado con país "Colombia", ciudad "Medellín" y cargo "Automatizador"
    Then retorna "563" empleados
    
  @Scenario3
  Scenario: buscar por cargo y cliente
    Given logeado en planet con usuario "ralvarez" y clave "Bendicion2015d"
    And ingresando a buscar empleado
    When realizo busqueda de empleado con cargo "Analista de Pruebas" y cliente "BTG Pactual"
    Then retorna "3" empleados
    