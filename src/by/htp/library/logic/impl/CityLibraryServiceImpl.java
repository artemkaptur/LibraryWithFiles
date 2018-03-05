package by.htp.library.logic.impl;

import java.util.Date;

import by.htp.library.bean.Book;
import by.htp.library.bean.Catalog;
import by.htp.library.dao.BookDao;
import by.htp.library.dao.impl.FileBookDaoImpl;
import by.htp.library.logic.LibraryService;

public class CityLibraryServiceImpl implements LibraryService {

	private BookDao dao = new FileBookDaoImpl();

	@Override
	public Catalog getMainCatalog() {

		Catalog catalog = new Catalog();

		Book[] books = dao.readAll();
		catalog.setBooks(books);
		catalog.setTitle("HTP_TAT_7_BOOK_CATALOG");
		catalog.setCreateDate(new Date());

		return catalog;
	}

}
