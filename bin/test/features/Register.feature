Feature: register
  I want to register in application

  @register @complete
  Scenario Outline: register Sucessfull
    Given camilo want to navigate into advantageOnline <Fila>
      | Ruta Excel                         | Pestana  |
      | src/test/resources/data/Datos.xlsx | Register |
    When fill out the form
    Then I can validate the correct creation

    Examples: 
      | Fila |
      |    1 |
