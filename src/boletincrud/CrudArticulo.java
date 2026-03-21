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
	
	public ArrayList <Articulo> getListaArticulos(){
		return listaArticulos;
	}
	
	public void addArticle(Articulo article) {
		listaArticulos.add(article);
	}
	
	public boolean removeArticle(String name) {
		return listaArticulos.removeIf(article -> article.getName().equalsIgnoreCase(name));
	}
	
	public boolean modifyPrice(String name, double newPrice) {
		//The boolean that will indicate if it was possible to modify the price of an article
		boolean updatedPrice = false;
		
		for (Articulo any : listaArticulos) {
			if (any.getName().equalsIgnoreCase(name)) {
				any.setPrice(newPrice);
				updatedPrice = true;
			}
		}
		
		return updatedPrice;
	}
	
	public boolean addGoods(String name, int addedGoods) {
		//The boolean that will indicate if it is possible to take the goods
		boolean moreGoods = false;
				
		for (Articulo any : listaArticulos) {
			if (any.getName().equalsIgnoreCase(name)) {
				any.setHowManyLast(any.getHowManyLast() + addedGoods);
				moreGoods = true;
			}
		}
		
		return moreGoods;
	}
	
	public boolean takeGoods(String name, int takenGoods) {
		//The boolean that will indicate if it is possible to take the goods
		boolean possibleGoods = false;
		
		for (Articulo any : listaArticulos) {
			if (any.getName().equalsIgnoreCase(name) && any.getHowManyLast() >= takenGoods) {
				any.setHowManyLast(any.getHowManyLast() - takenGoods);
				possibleGoods = true;
			}
		}
		
		return possibleGoods;
	}
}
