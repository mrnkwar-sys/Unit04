package boletin01;

public class A4Articulo {
	private String nombre;
	private double precioSinIva;
	private double precioConIva;
	private int iva;
	private int cuantosQuedan;
	private double precioConDescuento;
	private String venta;
	private String chain;
	
	A4Articulo (String nombre, double precioSinIva, int iva, int cuantosQuedan){
		if (nombre.equals("FALDA")) {
			this.nombre = nombre;
		} else {
			this.nombre = "ARTICULO INCORRECTO";
		}
		if (precioSinIva > 0) {
			this.precioSinIva = precioSinIva;
		} else {
			this.precioSinIva = 5;
		}
		if (iva == 21) {
			this.iva = iva;
		} else {
			this.iva = 21;
		}
		/*if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		} else {
			this.cuantosQuedan = 10;
		}*/
		}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecioSinIva() {
		return precioSinIva;
	}
	
	public double getPrecioConIva() {
		precioConIva = precioSinIva*1.21;
		return precioConIva;
	}
	
	public int getIva() {
		return iva;
	}
	
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}
	
	public double getPVPDescuento() {
		precioConDescuento = precioConIva*0.9;
		return precioConDescuento;
	}
	
	public String getVender() {
		return venta;
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
	
	public boolean sePuedeVender(int cuantosQuedan) {
		boolean vender;
		if (cuantosQuedan > 0) {
			vender = true;
		} else {
			vender = false;
		}
		return vender;
	}
	
	public int Update(int cuantosQuedan) {
		if (cuantosQuedan > 10) {
			cuantosQuedan += 10;
		}
		
		return cuantosQuedan;
	}
	
	public String toString() {
		chain = "PRECIO -> " + precioSinIva;
		return chain;
	}
	
	public String toString1() {
		chain = "IVA -> " + iva + "%";
		return chain;
	}
	
	public String toString2() {
		chain = "PVP -> " + precioConIva;
		return chain;
	}
	
	public String toString3() {
		chain = "PVP con descuento -> " + precioConDescuento;
		return chain;
	}
	
	public String toString4() {
		chain = "Cantidad restante en el almacén: " + cuantosQuedan;
		return chain;
	}
}
