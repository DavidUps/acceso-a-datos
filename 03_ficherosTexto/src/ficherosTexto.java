import java.io.*;
import java.nio.channels.CancelledKeyException;

public class ficherosTexto {

	public static void escribirFichero(String[] lista) {

		try {
			// 1.- Crear fichero.
			File fichero = new File("ficheroNombres.txt");
			FileWriter ficheroEscritura = new FileWriter(fichero);
			// 2.- Escribir nombres.
			for (int i = 0; i < lista.length; i++) {
				ficheroEscritura.write(lista[i]);
			}

			// 3.- Cerrar fichero.
			ficheroEscritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void vaciarTabla(String[] lista) {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = "";
		}
	}

	public static void leerFichero(String[] lista) {

		String cadenaFichero="";
		
		try {
			File fichero = new File("ficheroNombres.txt");
			FileReader ficheroLectura = new FileReader(fichero);
			// 2.- Leer nombres
			// lee 4 caracteres a capon

			int res, i = 0;
			boolean romper = false;
			
			//Leer nombres por bloques de 4 (Se puede variar)
			char[] nombre = new char[15];
			

			res = ficheroLectura.read(nombre);
			while (res != -1) {
				
				
				cadenaFichero = cadenaFichero + String.valueOf(nombre);
				res =ficheroLectura.read(nombre);
				
			}
			ficheroLectura.close();
			//hacer el split
			String [] corte =  new String[16];
			corte = cadenaFichero.split(";");
			for(int g=0; g<lista.length;g++)
			{
				lista [g]= corte[g];			
			}
			
			for (int d = 0; d < lista.length; d++) {
				System.out.println("Posicion" + d + ":" + lista[d]);
			}

		} catch (IOException e) {
			
		}
	
	}

	public static void imprimirTabla(String[] lista) {
		System.out.println("Contenido de la tabla");
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Posicion" + i + ":" + lista[i]);
		}
	}

	public static void main(String[] args) {
		String[] lista = { "Pepe;", "Ana;", "Juan" };
		escribirFichero(lista);
		vaciarTabla(lista);
		//imprimirTabla(lista);
		leerFichero(lista);
		//imprimirTabla(lista);
	}

}
