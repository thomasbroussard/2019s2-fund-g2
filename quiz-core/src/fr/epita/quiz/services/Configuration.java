package fr.epita.quiz.services;

import java.io.FileInputStream;
import java.util.Properties;

public class Configuration {

	private static Properties configurationProperties = new Properties();
	private static boolean isInit = false;

	private static void init() {
		try {
			configurationProperties.load(new FileInputStream(System.getProperty("conf.file")));
		} catch (Exception e) {
			// maybe do a custom exception
			e.printStackTrace();
		}
	}

	public static String getValueFromKey(String key) {
		if (!isInit) {
			init();
			isInit = true;
		}
		return configurationProperties.getProperty(key);
	}

}
