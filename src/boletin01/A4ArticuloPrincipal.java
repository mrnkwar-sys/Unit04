package boletin01;

public class A4ArticuloPrincipal {

	public static void main(String[] args) {
		A4Articulo articulo = new A4Articulo("FALDA", 9.99, 21, 25);
		
		A4Articulo articulo1 = new A4Articulo("CAMISETA", 5.50, 21, -7);
		
		A4Articulo articulo2 = new A4Articulo("FALDA", -8.99, 21, 5);
		
		//As the program has to show the price of the article with IVA, we will calculate it
		articulo.setPrecioConIva(articulo.getPrecioSinIva()*1.21);
		
		//Show the characteristics of the products through the console
		System.out.println(articulo.getNombre() + ": ");
		System.out.println("PRECIO -> " + articulo.getPrecioSinIva());
		System.out.println("IVA -> " + articulo.getIva() + "%");
		System.out.println("PVP -> " + articulo.getPrecioConIva());
		System.out.println("Cantidad restante en el almacén: " + articulo.getCuantosQuedan());
		
		System.out.println(articulo1.getNombre() + ": ");
		System.out.println("PRECIO -> " + articulo1.getPrecioSinIva());
		System.out.println("IVA -> " + articulo1.getIva() + "%");
		System.out.println("PVP -> " + articulo1.getPrecioConIva());
		System.out.println("Cantidad restante en el almacén: " + articulo1.getCuantosQuedan());
		
		System.out.println(articulo2.getNombre() + ": ");
		System.out.println("PRECIO -> " + articulo2.getPrecioSinIva());
		System.out.println("IVA -> " + articulo2.getIva() + "%");
		System.out.println("PVP -> " + articulo2.getPrecioConIva());
		System.out.println("Cantidad restante en el almacén: " + articulo2.getCuantosQuedan());
	}

}
