package by.htp.library.run;

import by.htp.library.bean.Book;
import by.htp.library.bean.Catalog;
import by.htp.library.logic.LibraryService;
import by.htp.library.logic.impl.CityLibraryServiceImpl;

public class LibraryMain {

	public static void main(String[] args) {

		LibraryService service = new CityLibraryServiceImpl();
		Catalog booksCatalog = service.getMainCatalog();
		viewCatalogInfo(booksCatalog);
	}

	private static void viewCatalogInfo(Catalog catalog) {
		for (Book book : catalog.getBooks()) {
			System.out.println(book);
		}
		//System.out.println(catalog);
	}

}
