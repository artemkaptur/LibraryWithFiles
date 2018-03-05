package by.htp.library.run;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Runner3 {

	private static final String FILE_PATH = "resources/sample.txt";

	public static void main(String[] args) {

		// Reader reader = new FileReader(FILE_PATH);
		// BufferedReader br = new BufferedReader(reader);

		try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {

			// String str = br.readLine();
			String str = null;

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
