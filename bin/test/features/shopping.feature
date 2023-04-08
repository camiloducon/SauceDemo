Feature: shopping
  I want to make purcharses

  @purchase @complete
  Scenario Outline: make purcharses
    Given camilo want to navigate into app advantageOnline <Fila>
      | Ruta Excel                         | Pestana  |
      | src/test/resources/data/Datos.xlsx | Purchase |
    When i login
    Then make purchase 
    And validate purchase

    Examples: 
      | Fila |
      |    1 |
