package boletin01;

public class A4Articulo {
	String nombre;
	double precioSinIva;
	double precioConIva;
	int iva;
	int cuantosQuedan;
	
	A4Articulo (String nombre, double precioSinIva, int iva, int cuantosQuedan){
		if (nombre.equals("FALDA")) {
			this.nombre = nombre;
		}
		if (precioSinIva > 0) {
			this.precioSinIva = precioSinIva;
		}
		if (iva == 21) {
			this.iva = iva;
		}
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
		}
}
