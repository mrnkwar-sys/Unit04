package boletin2;

public class Pizza {
	private int code;
	enum size{
		Mediana, Familiar
	}
	size size;
	enum type{
		Margarita, CuatroQuesos, Funghi
	}
	type type;
	enum state{
		Pedida, Servida
	}
	state state;
	
	Pizza(){
		this.state = state.Pedida;
	}
	
	Pizza(int code, size size, type type){
		this();
		this.code = code;
		this.size = size;
		this.type = type;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public size getSize() {
		return size;
	}

	public void setSize(size size) {
		this.size = size;
	}

	public type getType() {
		return type;
	}

	public void setType(type type) {
		this.type = type;
	}

	public state getState() {
		return state;
	}

	public void setState(state state) {
		this.state = state;
	}
	
	public String toString() {
		String chain = code + ": " + size + " - " + type + " - " + state;
		return chain;
	}
	
	public boolean equals(Object objeto) {
		//The boolean that will indicate if two pizzas are the same
		boolean samePizza = false;
		
		//The cast
		Pizza anotherPizza = (Pizza) objeto;
		
		if (this.code == anotherPizza.code) {
			samePizza = true;
		}
		
		return samePizza;
	}
}
