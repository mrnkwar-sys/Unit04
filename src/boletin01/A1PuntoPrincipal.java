package boletin01;

public class A1PuntoPrincipal {

	public static void main(String[] args) {
		A1Punto punto1 = new A1Punto(5, 0);
		A1Punto punto2 = new A1Punto(10, 10);
		A1Punto punto3 = new A1Punto(-3,7);
		
		/*punto1.x = 5;
		punto1.y = 0;
		
		punto2.x = 10;
		punto2.y = 10;
		
		punto3.x = -3;
		punto3.y = 7;
		*/
		
		System.out.println("(" + punto1.x + "," + punto1.y + ")");
		System.out.println("(" + punto2.x + "," + punto2.y + ")");
		System.out.println("(" + punto3.x + "," + punto3.y + ")");
		
		punto1.x -= 2;
		punto1.y -= 2;
		
		punto2.x += 2;
		punto2.y += 2;
		
		punto2.x *= 2;
		punto2.y *= 2;
		
		System.out.println();
		System.out.println("(" + punto1.x + "," + punto1.y + ")");
		System.out.println("(" + punto2.x + "," + punto2.y + ")");
		System.out.println("(" + punto3.x + "," + punto3.y + ")");
	}

}
