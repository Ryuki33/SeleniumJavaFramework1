package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {

		System.out.println("\n Hello Engineer Wilson \n");

		logger.trace("This is a trace message");
		logger.info("This is information message");
		logger.error("This is an error message");
		logger.warn("THis is a warning message");
		logger.fatal("This is a fatal message");
		
		System.out.println("\n Completed");
	}

}
