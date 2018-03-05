package by.htp.library.bean;

public class Author {

	private int id;
	private String Name;
	private String Surname;

	public Author() {
		super();
	}

	public Author(int id, String Name, String Surname) {
		super();
		this.id = id;
		this.Name = Name;
		this.Surname = Surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", Name=" + Name + ", Surname=" + Surname + "]";
	}

}
