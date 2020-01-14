package fr.epita.quiz.tests;

import fr.epita.quiz.services.Configuration;

public class TestConfiguration {

	public static void main(String[] args) {

		// given "conf.properties"

		// when
		String dataFile = Configuration.getValueFromKey("data.file");

		// then
		boolean success = dataFile.equals("data.csv");
		System.out.println("success? " + success);
		if (!success) {
			System.out.println("read value : " + dataFile);
		}
	}

}
