package boletincrud;

public class Articulo {
	private String name;
	private double withoutIva;
	private final double IVA = 0.21;
	private int howManyLast;
	
	public Articulo(String name, double withoutIva, int howManyLast) {
		this.name = name;
		this.withoutIva = withoutIva;
		this.howManyLast = howManyLast;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWithoutIva() {
		return withoutIva;
	}

	public void setWithoutIva(double withoutIva) {
		this.withoutIva = withoutIva;
	}

	public int getHowManyLast() {
		return howManyLast;
	}

	public void setHowManyLast(int howManyLast) {
		this.howManyLast = howManyLast;
	}

	public double getIVA() {
		return IVA;
	}
	
	public String toString() {
		String chain = "Nombre del artículo: " + name + " Precio del artículo sin IVA" + withoutIva + " IVA: " + IVA + " Cantidad en almacén : " + howManyLast;
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
