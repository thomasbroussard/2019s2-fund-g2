package fr.epita.logging;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileLogger extends Logger {

	@Override
	protected void print(String formattedMessage) {
		File file = new File("/temp/application2.log");
		// print in the file
		PrintWriter writer;
		try {
			FileOutputStream out = new FileOutputStream(file, true);
			writer = new PrintWriter(out);
			writer.println(formattedMessage);
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
