package boletin01;

public class A4ArticuloPrincipal {

	public static void main(String[] args) {
		A4Articulo articulo = new A4Articulo("FALDA", 9.99, 21, 25);
		
		A4Articulo articulo1 = new A4Articulo("CAMISETA", 5.50, 21, -7);
		
		A4Articulo articulo2 = new A4Articulo("FALDA", -8.99, 21, 5);
		
		//As the program has to show the price of the article with IVA, we will calculate it
		articulo.precioConIva = articulo.precioSinIva*1.21;
		
		//Show the characteristics of the products through the console
		System.out.println(articulo.nombre + ": ");
		System.out.println("PRECIO -> " + articulo.precioSinIva);
		System.out.println("IVA -> " + articulo.iva + "%");
		System.out.println("PVP -> " + articulo.precioConIva);
		System.out.println("Cantidad restante en el almacén: " + articulo.cuantosQuedan);
		
		System.out.println(articulo1.nombre + ": ");
		System.out.println("PRECIO -> " + articulo1.precioSinIva);
		System.out.println("IVA -> " + articulo1.iva + "%");
		System.out.println("PVP -> " + articulo1.precioConIva);
		System.out.println("Cantidad restante en el almacén: " + articulo1.cuantosQuedan);
		
		System.out.println(articulo2.nombre + ": ");
		System.out.println("PRECIO -> " + articulo2.precioSinIva);
		System.out.println("IVA -> " + articulo2.iva + "%");
		System.out.println("PVP -> " + articulo2.precioConIva);
		System.out.println("Cantidad restante en el almacén: " + articulo2.cuantosQuedan);
	}

}
