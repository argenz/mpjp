package s080;

import java.util.Locale;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JUL {
	public static void someLog() {
		Logger log = Logger.getLogger("sample");

		log.finest("finest message");
		log.finer("finer message");
		log.fine("fine message");
		log.config("config message");
		log.info("info message");
		log.warning("warning message");
		log.severe("severe message");
	}

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "EN"));
		Logger log = Logger.getLogger("sample");

		someLog();

		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(Level.ALL);
		log.setLevel(Level.ALL);
		log.addHandler(handler);
		log.setUseParentHandlers(false);

		someLog();
	}

	public int max(int a, int b) {
    	if (a>b) {
    		return a;
    	}else {
    		return b;
    	}
	}
	
	public double max(double a, double b) {  //Same algorithm over an over again but just different type. 
    	if (a>b) {
    		return a;
    	}else {
    		return b;
    	}
	}
	
	//DRY! Use Generic method - metodi che non guardano il type     //Valgono solo per i reference type. 
	public <T> T max(T a, T b) {					                //Particolarmente utili per le collezioni!!
    	if (a == b) {  //> unsupported by type T
    		return a;
    	}else {
    		return b;
    	}
	}
	
    
}
