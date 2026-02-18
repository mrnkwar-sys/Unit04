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
		
		punto1.setXY(punto1.getX()-2, punto1.getY()-2);
		
		punto2.setXY(punto2.getX()+2, punto2.getY()+2);
		
		punto3.setXY(punto3.getX()*2, punto3.getY()*2);
		
		//D1 Activity; The movement of the point 1
		punto1.desplaza(punto1.getX() + 3, punto1.getY() + 3);
		
		punto2.desplaza(punto2.getX() + 4, punto2.getY() + 4);
		
		punto3.desplaza(punto3.getX() + 5, punto3.getY() + 5);
		
		//D1 Activity; Show the movement of the point in the console 
		
		
		System.out.println();
		System.out.println(punto1.toString());
		System.out.println(punto2.toString());
		System.out.println(punto3.toString());
		
		System.out.println();
		System.out.println("La distancia entre el punto 1 y el 2 es " + punto1.distancia(punto2));
		System.out.println("La distancia entre el punto 3 y el 1 es " + punto3.distancia(punto1));
		System.out.println("La distancia entre el punto 2 y el 3 es " + punto3.distancia(punto2));
	}

}
