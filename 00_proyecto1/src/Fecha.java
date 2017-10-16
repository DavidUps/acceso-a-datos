
public class Fecha
{
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha()
	{
		dia  =1;
		mes  =1;
		anio =2200;
	}
	
	public String escribeCorto()
	{
		return dia + "/" + mes + "/" + anio;
	}
}
