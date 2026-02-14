package boletin01;

public class A3Rectangulo {
	int x1;
	int y1;
	int x2;
	int y2;
	int perimeter;
	int area;
	int part1;
	int part2;
	
	A3Rectangulo (int x1, int y1, int x2, int y2){
		if (y1 < y2) {
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;
		}
	}
}
