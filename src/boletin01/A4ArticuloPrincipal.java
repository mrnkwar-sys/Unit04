package boletin01;

public class A4ArticuloPrincipal {

	public static void main(String[] args) {
		A4Articulo articulo = new A4Articulo("FALDA", 9.99, 21, 25);
		
		A4Articulo articulo1 = new A4Articulo("CAMISETA", 5.50, 21, -7);
		
		A4Articulo articulo2 = new A4Articulo("FALDA", -8.99, 21, 5);
		
		//As the program has to show the price of the article with IVA, we will calculate it
		/*articulo.setPrecioConIva(articulo.getPrecioSinIva()*1.21);*/
		
		//Show the characteristics of the products through the console
		System.out.println(articulo.getNombre() + ": ");
		System.out.println(articulo.toString());
		System.out.println(articulo.toString1());
		System.out.println(articulo.toString2());
		System.out.println(articulo.toString3());
		System.out.println(articulo.toString4());
		
		System.out.println(articulo1.getNombre() + ": ");
		System.out.println(articulo1.toString());
		System.out.println(articulo1.toString1());
		System.out.println(articulo1.toString2());
		System.out.println(articulo1.toString3());
		System.out.println(articulo1.toString4());
		
		System.out.println(articulo2.getNombre() + ": ");
		System.out.println(articulo2.toString());
		System.out.println(articulo2.toString1());
		System.out.println(articulo2.toString2());
		System.out.println(articulo2.toString3());
		System.out.println(articulo2.toString4());
	}

}
