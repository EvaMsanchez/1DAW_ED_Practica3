package es.studium.cajaNegra;

public class Producto
{
	private double precio;
	private int iva;
	
	public Producto()
	{
		precio = 0.0;
		iva = 21;
	}
	
	
	public void aplicarDescuento (int porcentaje) 
	{
		this.precio=precio-((porcentaje*precio)/100);
	}
	
	
	public void setIVA (int iva) 
	{
		this.iva=iva;
	}
	
	
	public void setPrecio(double precio) 
	{
		this.precio=precio;
	}
	
	
	public int getIVA() 
	{
		return iva;
	}
	
	
	public double getPrecio() 
	{
		return precio;
	}
}


