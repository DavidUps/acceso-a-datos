public class MetodosClase {
		
	public static Fecha crearFecha()
	{
		Fecha f1 = new Fecha();
		
		return f1;
	}
	
	public static void main(String[] args) {
		Fecha f1,f2;
		
		f1 = crearFecha();
				
		System.out.println(f1.escribeCorto());
		
	}

}
