Feature: busqueda empleados

  Scenario: buscar por nombre
    Given logeado en planet "ralvarez" y "Bendicion2015d"
    When realizo busqueda de empleado
    Then retorna cantidad de empleados
