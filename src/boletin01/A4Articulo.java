package boletin01;

public class A4Articulo {
	private String nombre;
	private double precioSinIva;
	private double precioConIva;
	private int iva;
	private int cuantosQuedan;
	
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
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecioSinIva() {
		return precioSinIva;
	}
	
	public double getPrecioConIva() {
		return precioConIva;
	}
	
	public int getIva() {
		return iva;
	}
	
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecioSinIva(double precioSinIva) {
		this.precioSinIva = precioSinIva;
	}
	public void setPrecioConIva(double precioConIva) {
		this.precioConIva = precioConIva;
	}
	
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}
}
