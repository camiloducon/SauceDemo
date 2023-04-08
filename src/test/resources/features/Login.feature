Feature: Login
  I want to login in application

  @Login
  Scenario Outline: login Sucessfull
    Given camilo want to navigate into sauceDemo <Fila>
      | Ruta Excel                         | Pestana  |
      | src/test/resources/data/Datos.xlsx | Login |
    When fill out the form
    Then I can validate the correct Login

    Examples: 
      | Fila |
      |    1 |
