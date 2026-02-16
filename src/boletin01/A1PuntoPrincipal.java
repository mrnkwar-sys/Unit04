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
		
		System.out.println("(" + punto1.getX() + "," + punto1.getY() + ")");
		System.out.println("(" + punto2.getX() + "," + punto2.getY() + ")");
		System.out.println("(" + punto3.getX() + "," + punto3.getY() + ")");
		
		/*
		punto1.x -= 2;
		punto1.y -= 2;
		
		punto2.x += 2;
		punto2.y += 2;
		
		punto3.x *= 2;
		punto3.y *= 2;
		*/
		
		punto1.setX(5-2);
		punto1.setY(0-2);
		
		punto2.setX(10+2);
		punto2.setY(10+2);
		
		punto3.setX(-3*2);
		punto3.setY(7*2);
		
		//D1 Activity; The movement of the point 1
		punto1.desplaza(punto1.getX() + 3, punto1.getY() + 3);
		
		System.out.println();
		/*System.out.println("(" + punto1.getX() + "," + punto1.getY() + ")");*/
		System.out.println("(" + punto2.getX() + "," + punto2.getY() + ")");
		System.out.println("(" + punto3.getX() + "," + punto3.getY() + ")");
	}

}
