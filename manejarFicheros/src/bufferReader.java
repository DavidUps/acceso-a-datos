import java.io.*;
import java.nio.channels.CancelledKeyException;

public class bufferReader {

	public static void escribirFichero(String[] lista) {

		try {
			// 1.- Crear fichero.
			File fichero = new File("ficheroNombresBuffered.txt");
			FileWriter ficheroEscritura = new FileWriter(fichero);
			BufferedWriter ficheroBuffer = new BufferedWriter(ficheroEscritura);
			// 2.- Escribir nombres.
			for (int i = 0; i < lista.length; i++)
			{
				ficheroBuffer.write(lista[i]);
				ficheroBuffer.newLine();
			}
			// 3.- Cerrar fichero.
			ficheroBuffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void vaciarTabla(String[] lista) {
		for (int i = 0; i < lista.length; i++)
		{
			lista[i] = "";
		}
	}

	public static void leerFichero(String[] lista) {

		try
		{
			File fichero = new File("ficheroNombresBuffered.txt");
			FileReader ficheroLectura = new FileReader(fichero);
			BufferedReader ficheroBuffer = new BufferedReader(ficheroLectura);
			// 2.- Leer nombres
			// lee 4 caracteres a capon
			int i = 0;
			String linea;
			linea = ficheroBuffer.readLine();
			while (linea != null) 
			{
				lista[i] = linea;
				i++;
				linea = ficheroBuffer.readLine();
			}
			ficheroBuffer.close();
		} 
		catch (IOException e)
		{
		}
	
	}

	public static void imprimirTabla(String[] lista) {
		System.out.println("Contenido de la tabla");
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Posicion" + i + ":" + lista[i]);
		}
	}

	public static void main(String[] args) {
		String[] lista = { "Pepe de las marias", "Ana", "Juan" };
		escribirFichero(lista);
		vaciarTabla(lista);
		leerFichero(lista);
		imprimirTabla(lista);
	}

}
