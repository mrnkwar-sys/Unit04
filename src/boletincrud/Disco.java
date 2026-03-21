package boletincrud;

public class Disco {
	private int code;
	private String author;
	private String title;
	private int duration;
	public Genre genre;
	
	public enum Genre{
		ROCK, POP, JAZZ, BLUES
	}
	
	
	Disco(int code, String author, String title, int duration, Genre genre){
		this.author = author;
		this.code = code;
		this.duration = duration;
		this.genre = genre;
		this.title = title;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	public String toString() {
		String chain = "Código: " + code + " | Autor: " + author + " | Título: " + title + " | Duración: " + duration + " | Género: " + genre;
		return chain;
	}
	
	public boolean equals(Object objeto) {
		//The boolean that will indicate if the discs are the same
		boolean sameDisc = false;
		
		//The cast
		Disco anotherDisc = (Disco) objeto;
		
		if (this.code == anotherDisc.code) {
			sameDisc = true;
		}
		
		return sameDisc;
	}

}
