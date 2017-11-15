import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CrearCarpetaConVariable {

	public static void main(String[] args) {
		
		System.out.println("Introduce el nombre de la carpeta que quieras guardar");
		
		Scanner sc = new Scanner(System.in);
		String nombreCarpeta = sc.nextLine();
		
		File folder = new File(nombreCarpeta);
		
		if (folder.mkdirs() == true) {
			System.out.println("Carpeta creada");
		}else {
			System.out.println("Carpeta ya creada");
		}
	}

}
