package boletin01;

public class A4ArticuloPrincipal {

	public static void main(String[] args) {
		A4Articulo articulo = new A4Articulo();
		
		//Give a value to every attribute
		articulo.nombre = "FALDA";
		articulo.precioSinIva = 9.99;
		articulo.iva = 21;
		articulo.cuantosQuedan = 25;
		
		//As the program has to show the price of the article with IVA, we will calculate it
		articulo.precioConIva = articulo.precioSinIva*1.21;
		
		//Show the characteristics of the products through the console
		System.out.println(articulo.nombre + " : ");
		System.out.println("PRECIO -> " + articulo.precioSinIva);
		System.out.println("IVA -> " + articulo.iva + "%");
		System.out.println("PVP -> " + articulo.precioConIva);
		System.out.println("Cantidad restante en el almacén: " + articulo.cuantosQuedan);

	}

}
