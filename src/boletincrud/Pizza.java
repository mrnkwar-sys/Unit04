package boletincrud;

public class Pizza {
	private int code;
	Size size;
	Type type;
	State state;
	public enum Size{
		MEDIANA, FAMILIAR
	}
	public enum Type{
		MARGARITA, CUATRO_QUESOS, FUNGHI
	}
	public enum State{
		PEDIDA, SERVIDA
	}
	
	Pizza(int code, Size size, Type type, State state) {
		this.code = code;
		this.size = size;
		this.state = state.PEDIDA;
		this.type = type;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
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
