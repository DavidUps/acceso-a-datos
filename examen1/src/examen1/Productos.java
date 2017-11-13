package examen1;

public class Productos {

	private String nombre;
	private int precio;
	
	public Productos(){
		nombre = "";
		precio = 0;
	}
	
	public void setPrecio(int p)
	{
		precio = p;
	}
	
	public void setNombre(String n)
	{
		nombre = n;
	}
	
	public void aumentar(int p)
	{
		precio = (int)(precio + ((p/100.0)*precio));
	}
	
	public void disminuir(int p)
	{
		precio = (int)(precio - ((p/100.0)*precio));
	}
	
	public String escribir()
	{
		return "Nombre: " + nombre + " Precio: " + precio;
	}
}
