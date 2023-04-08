package utils;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Helpers {

	Logger logger  = Logger.getLogger(Helpers.class.getName());
	
	public void esperaSelenium(int seconds) {
		try {
			Thread.sleep(seconds * (long)1000);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage());
		}
	}

	public void carguesAutoIT(String ruta) {
		try {
			Runtime.getRuntime().exec(ruta);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage());
		}
	}

}
