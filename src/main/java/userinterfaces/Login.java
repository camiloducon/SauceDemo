package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Login extends PageObject {


	public static final Target TXT_USER_NAME = Target.the("user-name")
			.located(By.name("user-name"));

	public static final Target TXT_PASSWORD = Target.the("password")
			.located(By.name("password"));

	public static final Target BTN_SIGN_IN = Target.the("boton SIGN IN")
			.locatedBy("//*[@id='login-button']");

	public static final Target LBL_CONFIRMATION_LOGIN = Target.the("LBL_CONFIRMATION_LOGIN")
			.located(By.id("shopping_cart_container"));


}
