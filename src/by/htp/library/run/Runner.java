package by.htp.library.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Runner {

	private static final String FILE_PATH = "resources/sample.txt";

	public static void main(String[] args) {

		OutputStream os;
		// InputStream is = null;

		// try {
		// is = new FileInputStream("resources/sample.txt");
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// } finally {
		// try {
		// if (is != null) {
		// is.close();
		// }
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }

		try (InputStream is = new FileInputStream(FILE_PATH)) {
			int count;
			byte[] bytes = new byte[1024];
			do {
				// count = is.read();
				count = is.read(bytes);
				// System.out.print((char) count);
			} while (count > 0);
			System.out.println(new String(bytes));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// try (InputStream is = new FileInputStream(FILE_PATH);) {
		// int count;
		// do {
		// count = is.read();
		// System.out.print((char) count);
		// } while (count > 0);
		//
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		System.out.println("================================");

		try (Reader reader = new FileReader(FILE_PATH)) {
			int count2;
			char[] chars = new char[1024];
			do {
				count2 = reader.read(chars);
				// System.out.print((char) count2);
			} while (count2 > 0);
			System.out.println(new String(chars));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// try (Reader reader = new FileReader(FILE_PATH)) {
		// int count2;
		// do {
		// count2 = reader.read();
		// System.out.print((char) count2);
		// } while (count2 > 0);
		//
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

	}
}
