package fr.epita.logging.tests;

import fr.epita.logging.FileLogger;
import fr.epita.logging.Logger;

public class TestLogger {

	public static void main(String[] args) {
		Logger logger = new Logger();
		logger.log("beginning of the program");

		FileLogger fileLogger = new FileLogger();
		fileLogger.log("beginning of the program");
		fileLogger.log("second trace");

	}

}
