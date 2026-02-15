package boletin01;

public class A3RectanguloPrincipal {

	public static void main(String[] args) {
		A3Rectangulo firstRec = new A3Rectangulo(0, 0, 5, 5);
		A3Rectangulo secondRec = new A3Rectangulo(7, 9, 2, 3);
		
		
		//To get the area of the rectangles, we have to apply the next formula: |x2 - x1| * |y2 - y1| 
		/*if (firstRec.x2 > firstRec.x1) {
			firstRec.part1 = firstRec.x2 - firstRec.x1;
		} else {
			firstRec.part1 = firstRec.x1 - firstRec.x2;
		}
		
		if (firstRec.y2 > firstRec.y1) {
			firstRec.part2 = firstRec.y2 - firstRec.y1;
		} else {
			firstRec.part2 = firstRec.y1 - firstRec.y2;
		}
		*/
		
		if (firstRec.getX2() > firstRec.getX1()) {
			firstRec.setPart1(firstRec.getX2() - firstRec.getX1());
		} else {
			firstRec.setPart1(firstRec.getX1() - firstRec.getX2());
		}
		
		if (firstRec.getY2() > firstRec.getY1()) {
			firstRec.setPart2(firstRec.getY2() - firstRec.getY1());
		} else {
			firstRec.setPart2(firstRec.getY1() - firstRec.getY2());
		}
		
		
		//The second rectangle
		/*if (secondRec.x2 > secondRec.x1) {
			secondRec.part1 = secondRec.x2 - secondRec.x1;
		} else {
			secondRec.part1 = secondRec.x1 - secondRec.x2;
		}
		
		if (secondRec.y2 >secondRec.y1) {
			secondRec.part2 = secondRec.y2 - secondRec.y1;
		} else {
			secondRec.part2 = secondRec.y1 - secondRec.y2;
		}
		*/
		
		if (secondRec.getX2() > secondRec.getX1()) {
			secondRec.setPart1(secondRec.getX2() - secondRec.getX1());
		} else {
			secondRec.setPart1(secondRec.getX1() - secondRec.getX2());
		}
		
		if (secondRec.getY2() > secondRec.getY1()) {
			secondRec.setPart2(secondRec.getY2() - secondRec.getY1());
		} else {
			secondRec.setPart2(secondRec.getY1() - secondRec.getY2());
		}
		
		//We calculate the area
		firstRec.setArea(firstRec.getPart1() * firstRec.getPart2());
		
		secondRec.setArea(secondRec.getPart1() * secondRec.getPart2());
		
		//To get the perimeter of the rectangles, we apply the next formula: 2 * |(x2-x1) + (y2-y1)|
		firstRec.setPerimeter(2 * (firstRec.getPart1() + firstRec.getPart2()));
		
		secondRec.setPerimeter(2 * (secondRec.getPart1() + secondRec.getPart2()));
		
		//The program will show through the console the coordinates of both rectangles, their perimeter and their area
		System.out.println("DATOS DEL PRIMER RECTÁNGULO:");
		System.out.println("Coordenadas: " + "(" + firstRec.getX1() + ", " + firstRec.getY1() + ") (" + firstRec.getX2() + ", " + firstRec.getY2() + ")");
		System.out.println("Perímetro: " + firstRec.getPerimeter());
		System.out.println("Área: " + firstRec.getArea());
		
		System.out.println();
		
		System.out.println("DATOS DEL SEGUNDO RECTÁNGULO:");
		System.out.println("Coordenadas: " + "(" + secondRec.getX1() + ", " + secondRec.getY1() + ") (" + secondRec.getX2() + ", " + secondRec.getY2() + ")");
		System.out.println("Perímetro: " + secondRec.getPerimeter());
		System.out.println("Área: " + secondRec.getArea());
	}

}
