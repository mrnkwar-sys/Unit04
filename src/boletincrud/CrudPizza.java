package boletincrud;

import java.util.ArrayList;

public class CrudPizza {
	
	ArrayList <Pizza> listaPizzas;
	
	CrudPizza(){
		listaPizzas = new ArrayList<>();
	}
	
	CrudPizza(ArrayList <Pizza> listaPizzas){
		this.listaPizzas = listaPizzas;
	}
	
	public ArrayList <Pizza> getListaPizzas(){
		return listaPizzas;
	}
	
	public void addOrder(Pizza pizzaOrder) {
		listaPizzas.add(pizzaOrder);
	}
	
	public boolean servedPizza(int code) {
		//The boolean that will indicate if the pizza is served or not
		boolean served = false;
		
		for (Pizza p : listaPizzas) {
			if (p.getCode() == code) {
				p.setState(Pizza.State.SERVIDA);
				served = true;
			}
		}
		
		return served;
	}

}
