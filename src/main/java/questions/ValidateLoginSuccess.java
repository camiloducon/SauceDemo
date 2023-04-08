package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.Login.LBL_CONFIRMATION_LOGIN;

public class ValidateLoginSuccess implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean mensajeDeIngreso =  LBL_CONFIRMATION_LOGIN.resolveFor(actor).isVisible();
        return mensajeDeIngreso;
    }

    public static ValidateLoginSuccess enSauceDemo(){
        return new ValidateLoginSuccess();
    }

}
