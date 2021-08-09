package demo;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4j {
	
	static Logger logger = LogManager.getLogger(Log4j.class);
	
	PropertyConfigurator.configure("log4j2.properties");	
	
	public static void main(String[] args) {
		
		System.out.println("\n Hello Sid..!! 	\n");
		
		logger.info("This is information message");
		logger.error("This is an error message");
		logger.warn("This is a warning message");
		logger.fatal("This is a fatal message");

		System.out.println("Test Completed");
	}

}
