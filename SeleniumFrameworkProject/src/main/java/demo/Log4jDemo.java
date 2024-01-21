//Selenium Framework for Beginners 14 | What is Log4j https://www.youtube.com/watch?v=rbuR9Q_55h4&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=18
package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		
		System.out.println("\nHello World...\n");
		
		logger.trace("This is a trace message"); //
		logger.info("This is an information message");
		logger.error("This is an error message");
		logger.warn("This is a warning message");
		logger.fatal("This is a fatal message");
		
		System.out.println("\n Completed");

	}

}
