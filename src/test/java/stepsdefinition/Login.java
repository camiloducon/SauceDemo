package stepsdefinition;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static utils.Constantes.CAMILO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import questions.ValidateLoginSuccess;
import tasks.AbrirNavegador;
import utils.DataDrivenExcel;
import utils.Excel;

public class Login {
    @Managed
    private WebDriver hisBrowser;

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setUp() {
        CAMILO.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^camilo want to navigate into sauceDemo (.*)$")
    public void camilo_want_to_navigate_into_sauceDemo(int row, DataTable dataExcel) {
        List<Map<String, String>> dataFeature = dataExcel.asMaps(String.class, String.class);
        Excel excel = new Excel(dataFeature.get(0).get("Ruta Excel"), dataFeature.get(0).get("Pestana"), true, row);
        data = dataDriverExcel.leerExcel(excel);
        CAMILO.wasAbleTo(AbrirNavegador.enTyba());

    }

    @When("^fill out the form$")
    public void fill_out_the_form() {
        CAMILO.wasAbleTo(tasks.Login.enSauceDemo(data.get("Username"), data.get("Password")));
    }

    @Then("^I can validate the correct Login$")
    public void i_can_validate_the_correct_Login() {
        CAMILO.should(seeThat(ValidateLoginSuccess.enSauceDemo()));
    }

}
