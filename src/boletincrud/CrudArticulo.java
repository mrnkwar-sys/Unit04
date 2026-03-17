package boletincrud;

import java.util.ArrayList;

public class CrudArticulo {
	private ArrayList <Articulo> listaArticulos;
	
	CrudArticulo(){
		listaArticulos = new ArrayList<>();
	}
	
	CrudArticulo(ArrayList <Articulo> listaArticulos){
		this.listaArticulos = listaArticulos;
	}
	
	public void addArticle(Articulo article) {
		listaArticulos.add(article);
	}
	
	public boolean removeArticle(String name) {
		return listaArticulos.removeIf(article -> article.getName().equalsIgnoreCase(name));
	}
	
	public void addGoods(String name, int howManyLast, int addedGoods) {
		for (Articulo any : listaArticulos) {
			if (any.getName().equalsIgnoreCase(name)) {
				any.setHowManyLast(howManyLast + addedGoods);
			}
		}
	}
	
	public boolean takeGoods(String name, int howManyLast, int takenGoods) {
		//The boolean that will indicate if it is possible to take the goods
		boolean possibleGoods = false;
		
		return possibleGoods;
	}
}
