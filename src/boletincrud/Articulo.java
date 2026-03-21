package boletincrud;

public class Articulo {
	private String name;
	private double price;
	private int howManyLast;
	
	public Articulo() {
		this.name = "";
		this.price = 0.0;
		this.howManyLast = 0;
	}
	
	public Articulo(String name, double price, int howManyLast) {
		this.name = name;
		this.price = price;
		this.howManyLast = howManyLast;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getHowManyLast() {
		return howManyLast;
	}

	public void setHowManyLast(int howManyLast) {
		this.howManyLast = howManyLast;
	}
	
	public String toString() {
		String chain = "Nombre del artículo: " + name + " | Precio del artículo: " + price + " | Cantidad en almacén: " + howManyLast;
		return chain;
	}
	
	public boolean equals(Object objeto) {
		//The boolean that will indicate if two articles are the same or not
		boolean sameArticle = false;
		
		//The cast
		Articulo otherArticle = (Articulo) objeto;
		
		if (this.name.equalsIgnoreCase(otherArticle.name)) {
			sameArticle = true;
		}
		
		return sameArticle;
	}

}
