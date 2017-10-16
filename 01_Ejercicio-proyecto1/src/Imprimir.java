
public class Imprimir {

	public static void main(String[] args) {
		
		Fecha f1 = new Fecha();
		if(f1.comprobarFecha()==true)	
			System.out.println(f1.escribeCorta());
		else
			System.out.println("fecha mal");
		if(f1.comprobarFecha()==true)	
			System.out.println(f1.escribeLarga());
		else
			System.out.println("fecha mal");

		
	}

}
