
import java.io.*;
import java.util.Scanner;

public class CrearFicheroConVariable {

	public static void main(String[] args) {
		
		System.out.println("Introduce el nombre del fichero que quieras guardar");
		
		Scanner sc = new Scanner(System.in);
		String nombreFichero = sc.nextLine();
		
		File fichero = new File( nombreFichero + ".txt");
		
		try {
			if (fichero.createNewFile() == true) {
				System.out.println("El fichero se ha creado");
			}else {
				System.out.println("El fichero no se ha creado");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
