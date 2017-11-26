package repasoExamen;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona()
	{
		nombre = "";
		apellido = "";
		edad = 0;
	}
	
	public Persona(String n, String a, int e)
	{
		nombre = n;
		apellido = a;
		edad = e;
	}
	
	public void setNombre(String lista)
	{
		nombre = lista;
	}
	
	public void setApellido(String lista)
	{
		apellido = lista;
	}
	
	public void setEdad(String lista)
	{
		edad = Integer.parseInt(lista);
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public String getApellido()
	{
		return apellido;
	}
	
	public int getEdad()
	{
		return edad;
	}
}
