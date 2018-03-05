package by.htp.library.run;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Runner2 {

	private static final String FILE_PATH = "resources/sample.txt";

	public static void main(String[] args) {

		// InputStream is = new FileInputStream(FILE_PATH);
		// BufferedInputStream bis = new BufferedInputStream(is);

		try (BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(FILE_PATH))) {
			int count;
			byte[] bytes = new byte[1024];
			do {
				count = bis.read(bytes);
			} while (count > 0);
			System.out.println(new String(bytes));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
