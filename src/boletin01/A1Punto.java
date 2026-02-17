package boletin01;

public class A1Punto {
	private int x;
	private int y;
	private double puntoP;
	private String chain;
	
	A1Punto (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	/*public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}*/
	
	//METHODS
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void desplaza(int dx, int dy) {
		this.x = dx;
		this.y = dy;
	}
	
	public double distancia(double puntoP) {
		return puntoP;
	}
	
	public String toString() {
		chain = "(" + x + "," + y + ")";
		return chain;
	}
}
