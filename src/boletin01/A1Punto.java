package boletin01;

public class A1Punto {
	private int x;
	private int y;
	
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
		if (x%1 == 0) {
			this.x = x;
		}
	}
	
	public void setY(int y) {
		if (y%1 == 0) {
			this.y = y;
		}
	}
}
