package boletin01;

public class A1Punto {
	private int x;
	private int y;
	private int dx;
	private int dy;
	private double puntoP;
	
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
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.x = ++x;
		this.y = ++y;
	}
	
	public void desplaza(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
	}
}
