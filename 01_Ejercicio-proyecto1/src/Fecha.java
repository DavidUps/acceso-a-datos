
public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha() {
		dia  = 23;
		mes  = 3;
		anio = 1996;
	}
	
	//get>obtener set>cambiar || Sirve para cambiar y coger variables privadas.

	public int getDia() {
		return dia;
	}
	
	public void setDia() {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes() {
		this.mes = mes;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio() {
		this.anio = anio;
	}
	
	String escribeCorta() {
		return dia + "/" + mes + "/" + anio;
	}
	
	String escribeLarga() {
		return "Es el dia " + dia + "del mes " + mes + "del año " + anio;
	}
	
	public boolean comprobarFecha() {
		boolean comprobar = false;
		if(dia<=31 && mes<=12)
			return true;
		else
			return false;
	}

	
	
	
	
	
}
