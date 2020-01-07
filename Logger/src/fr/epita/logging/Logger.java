package fr.epita.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

	public void log(String message) {

		String timestamp = getTimeStamp();

		String formattedMessage = formatMessage(message, timestamp);

		print(formattedMessage);

	}

	protected void print(String formattedMessage) {
		System.out.println(formattedMessage);
	}

	private String formatMessage(String message, String timestamp) {
		return timestamp + " -- " + message;
	}

	private String getTimeStamp() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss.SSS");
		String timestamp = sdf.format(new Date());
		return timestamp;
	}

}
