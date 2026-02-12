package boletin01;

public class A3RectanguloPrincipal {

	public static void main(String[] args) {
		A3Rectangulo firstRec = new A3Rectangulo();
		A3Rectangulo secondRec = new A3Rectangulo();
		
		//The coordinates of the first rectangle 
		firstRec.x1 = 0;
		firstRec.y1 = 0;
		firstRec.x2 = 5;
		firstRec.y2 = 5;
		
		//The coordinates of the second rectangle 
		secondRec.x1 = 7;
		secondRec.y1 = 9;
		secondRec.x2 = 2;
		secondRec.y2 = 3;
		
		
		//To get the area of the rectangles, we have to apply the next formula: |x2 - x1| * |y2 - y1| 
		if (firstRec.x2 > firstRec.x1) {
			firstRec.part1 = firstRec.x2 - firstRec.x1;
		} else {
			firstRec.part1 = firstRec.x1 - firstRec.x2;
		}
		
		if (firstRec.y2 > firstRec.y1) {
			firstRec.part2 = firstRec.y2 - firstRec.y1;
		} else {
			firstRec.part2 = firstRec.y1 - firstRec.y2;
		}
		
		
		//The second rectangle
		if (secondRec.x2 > secondRec.x1) {
			secondRec.part1 = secondRec.x2 - secondRec.x1;
		} else {
			secondRec.part1 = secondRec.x1 - secondRec.x2;
		}
		
		if (secondRec.y2 >secondRec.y1) {
			secondRec.part2 = secondRec.y2 - secondRec.y1;
		} else {
			secondRec.part2 = secondRec.y1 - secondRec.y2;
		}
		
		//We calculate the perimeter
		firstRec.perimeter = firstRec.part1 * firstRec.part2;
		
		secondRec.perimeter = secondRec.part1 * secondRec.part2;
		
		//The program will show through the console the coordinates of both rectangles, their perimeter and their area
		System.out.println("DATOS DEL PRIMER RECTÁNGULO:");
		
		//To show the coordinates, we will keep them inside tables
		System.out.println("Coordenadas: " + "(" + firstRec.x1 + ", " + firstRec.y1 + ") (" + firstRec.x2 + ", " + firstRec.y2 + ")");
		System.out.println();
		System.out.println("DATOS DEL SEGUNDO RECTÁNGULO:");
	}

}
