
public class Persona {

	private String  nombre,
					apellido;
	
	private int edad;
	
	public Persona()
	{
		nombre = "";
		apellido = "";
		edad = 0;
	}
	public Persona(String n, String a, int e)
	{
		n = nombre;
		a = apellido;
		e = edad;
	}
	
	public void meterNombre(String lista)
	{
		nombre = lista;
	}
	
	public void meterApellido(String lista)
	{
		apellido = lista;
	}
	
	public void meterEdad(String lista)
	{
		int e;
		e =  Integer.parseInt(lista);
		edad = e;
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
