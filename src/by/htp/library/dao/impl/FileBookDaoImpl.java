package by.htp.library.dao.impl;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import by.htp.library.bean.Author;
import by.htp.library.bean.Book;
import by.htp.library.dao.BookDao;

public class FileBookDaoImpl implements BookDao {

	private static final String FILE_PATH = "resources/Library.txt";

	@Override
	public Book[] readAll() {
		Book[] books = new Book[5];
		Author[] authors = new Author[5];
		for (int i = 0; i < 5; i++) {
			books[i] = new Book();
			authors[i] = new Author();
		}

		byte[] bytes = new byte[1024];
		char[] chars = new char[1024];

		readFromFile(bytes);
		bytesIntoChars(bytes, chars);

		String library = new String(chars);

		String[] booksInStrings = library.split("\n");
		for (int j = 0; j < 5; j++) {
			String[] temp = booksInStrings[j].replaceAll("[,]", "").split(" ");
			initializeBook(temp, books, authors, j);
		}

		return books;
	}

	private void readFromFile(byte[] bytes) {
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(FILE_PATH))) {
			int count;
			do {
				count = bis.read(bytes);
			} while (count > 0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void bytesIntoChars(byte[] bytes, char[] chars) {
		int i = 0;
		for (byte b : bytes) {
			chars[i] = (char) b;
			i++;
		}
	}

	private void initializeBook(String[] book, Book[] books, Author[] authors, int j) {
		int id = Integer.parseInt(book[3]);
		authors[j].setId(id);
		authors[j].setName(book[4]);
		authors[j].setSurname(book[5]);
		int id2 = Integer.parseInt(book[0]);
		books[j].setId(id2);
		books[j].setTitle(book[1]);
		int year = Integer.parseInt(book[2]);
		books[j].setYear(year);
		books[j].setAuthor(authors[j]);
	}

}
