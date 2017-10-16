
import java.io.*;
import java.util.Scanner;

public class MenuOpciones {

	public static void main(String[] args) {

		int op = 0;
		String fichero = "";
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		while (op < 6) {
			System.out.println("Elija una opción:" + "\n \t 1.- Crear Fichero" + "\n \t 2.- Mostrar información"
					+ "\n \t 3.- Mostrar longitud" + "\n \t 4.- Comprobar si existe" + "\n \t 5.- Borrar fichero"
					+ "\n \t 6.- Salir");
			op = sc.nextInt();
			
			switch (op) {
	
			// Crear fichero
			case 1:
				System.out.println("¿Como quieres llamar al fichero?");
				fichero = sc2.nextLine();

				File archivo = new File(fichero + ".txt");
				try {
					archivo.createNewFile();
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;

			// Mostrar Info
			case 2:
				archivo = new File(fichero + ".txt");
				System.out.println("Nombre: " + archivo.getName() + "\n Ruta Absoluta: " + archivo.getAbsolutePath()
						+ "\n Ruta relativa: " + archivo.getPath() + "\n Longitud: " + archivo.length());

				break;

			// Mostrar longitud
			case 3:
				archivo = new File(fichero + ".txt");
				System.out.println("Longuitud: " + archivo.length());
				break;

			// Comprobar si existe
			case 4:
				archivo = new File(fichero + ".txt");
				if(archivo.exists()==true) {
					System.out.println("existe");
				}else {
					System.out.println("no existe");
				}
				break;

			// Borrar fichero
			case 5:
				archivo = new File(fichero + ".txt");
				archivo.delete();
				break;

			// Salir
			case 6:
				System.exit(0);
				break;
			}
		}
	}

}
