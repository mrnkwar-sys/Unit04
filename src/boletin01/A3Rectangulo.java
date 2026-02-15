package boletin01;

public class A3Rectangulo {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int perimeter;
	private int area;
	private int part1;
	private int part2;
	
	A3Rectangulo (int x1, int y1, int x2, int y2){
		if (y1 < y2) {
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;
		}
	}
	
	public int getX1() {
		return x1;
	}
	
	public int getY1() {
		return y1;
	}
	
	public int getX2() {
		return x2;
	}
	
	public int getY2() {
		return y2;
	}
	
	public int getPerimeter() {
		return perimeter;
	}
	
	public int getArea() {
		return area;
	}
	
	public int getPart1() {
		return part1;
	}
	
	public int getPart2() {
		return part2;
	}
	
	public void setX1(int x1) {
		this.x1 = x1;
	}
	
	public void setY1(int y1) {
		this.y1 = y1;
	}
	
	public void setX2(int x2) {
		this.x2 = x2;
	}
	
	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}
	
	public void setArea(int area) {
		this.area = area;
	}
	
	public void setPart1(int part1) {
		this.part1 = part1;
	}
	
	public void setPart2(int part2) {
		this.part2 = part2;
	}
}
