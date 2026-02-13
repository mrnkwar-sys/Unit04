package boletin01;

public class A3RectanguloPrincipal {

	public static void main(String[] args) {
		A3Rectangulo firstRec = new A3Rectangulo();
		A3Rectangulo secondRec = new A3Rectangulo();
		
		//The coordinates of the first rectangle 
		firstRec.x1 = 1;
		firstRec.y1 = 3;
		firstRec.x2 = 5;
		firstRec.y2 = 7;
		
		//The coordinates of the second rectangle 
		secondRec.x1 = 2;
		secondRec.y1 = 4;
		secondRec.x2 = 6;
		secondRec.y2 = 8;
		
		
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
		
		//We calculate the area
		firstRec.area = firstRec.part1 * firstRec.part2;
		
		secondRec.area = secondRec.part1 * secondRec.part2;
		
		//To get the perimeter of the rectangles, we apply the next formula: 2 * |(x2-x1) + (y2-y1)|
		firstRec.perimeter = 2 * (firstRec.part1 + firstRec.part2);
		
		secondRec.perimeter = 2 * (secondRec.part1 + secondRec.part2);
		
		//The program will show through the console the coordinates of both rectangles, their perimeter and their area
		System.out.println("DATOS DEL PRIMER RECTÁNGULO:");
		System.out.println("Coordenadas: " + "(" + firstRec.x1 + ", " + firstRec.y1 + ") (" + firstRec.x2 + ", " + firstRec.y2 + ")");
		System.out.println("Perímetro: " + firstRec.perimeter);
		System.out.println("Área: " + firstRec.area);
		
		System.out.println();
		
		System.out.println("DATOS DEL SEGUNDO RECTÁNGULO:");
		System.out.println("Coordenadas: " + "(" + secondRec.x1 + ", " + secondRec.y1 + ") (" + secondRec.x2 + ", " + secondRec.y2 + ")");
		System.out.println("Perímetro: " + secondRec.perimeter);
		System.out.println("Área: " + secondRec.area);
	}

}
