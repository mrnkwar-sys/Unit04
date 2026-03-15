package boletin02;

public class Libro {
	private String title;
	private String author;
	private int copies;
	private int copiesBorrowed;
	enum genre{
		Narrativo, Lírico, Dramático, Didáctico, Poético
	}
	genre genre;
	
	Libro(){
		this.title = "";
		this.author = "";
		this.copies = 0;
		this.copiesBorrowed = 0;
		this.genre = genre.Narrativo;
	}
	
	Libro(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	Libro(String title, String author, int copies, int copiesBorrowed){
		this.title = title;
		this.author = author;
		this.copies = copies;
		this.copiesBorrowed = copiesBorrowed;
	}
	
	Libro(String title, String author, int copies, int copiesBorrowed, genre genre){
		this.title = title;
		this.author = author;
		this.copies = copies;
		this.copiesBorrowed = copiesBorrowed;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public int getCopiesBorrowed() {
		return copiesBorrowed;
	}

	public void setCopiesBorrowed(int copiesBorrowed) {
		this.copiesBorrowed = copiesBorrowed;
	}

	public genre getGenre() {
		return genre;
	}

	public void setGenre(genre genre) {
		this.genre = genre;
	}
	
	public boolean loanBook(int copies, int copiesBorrowed) {
		//The boolean that will tell if it was possible to borrow the book
		boolean loanedBook;
		
		//If there are enough copies, the wanted book will be borrowed and the boolean will be true
		if (copies > 0) {
			copiesBorrowed++;
			loanedBook = true;
		} else {
			loanedBook = false;
		}
		
		return loanedBook;
	}
	
	public boolean returnBook(int copiesBorrowed) {
		//The boolean that will tell if it was possible to return the book
		boolean returnedBook;
		
		//If there are enough copies borrowed, the book will be returned and the boolean will be true
		if (copiesBorrowed > 0) {
			copiesBorrowed--;
			returnedBook = true;
		} else {
			returnedBook = false;
		}
		
		return returnedBook;
	}
	
	public String toStringTitle() {
		String chain = "Título: " + this.title;
		return chain;
	}
	
	public String toStringAuthor() {
		String chain = "Autor: " + this.author;
		return chain;
	}
	
	public String toStringCopies() {
		String chain = "Número de ejemplares: " + this.copies;
		return chain;
	}
	
	public String toStringCopiesBorrowed() {
		String chain = "Número de ejemplares prestados: " + this.copiesBorrowed;
		return chain;
	}
	
	public String toStringGenre() {
		String chain = "Género: " + this.genre;
		return chain;
	}
	
	public boolean equals(Object objeto) {
		//The boolean that will indicate if both books are identical
		boolean sameBook = false;
		
		//The cast
		Libro otroLibro = (Libro) objeto;
		
		if (this.title.toLowerCase().equals(otroLibro.title) && this.author.toLowerCase().equals(otroLibro.author)) {
			sameBook = true;
		}
		
		return sameBook;
	}

}
