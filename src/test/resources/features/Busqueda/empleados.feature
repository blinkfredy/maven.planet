@FeatureTest
Feature: busqueda empleados

@Scenario1
  Scenario: buscar por nombre y apellido
    Given logeado en planet con usuario "ralvarez" y clave "Bendicion2015d"
    When realizo busqueda de empleado con nombre "John Fredy" y apellidos "Clavijo Parra"
    Then retorna "1" empleados
