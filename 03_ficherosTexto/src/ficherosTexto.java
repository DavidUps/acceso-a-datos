import java.io.*;

public class ficherosTexto {

	public static void escribirFichero(String[] lista) {

		try
		{
			//1.- Crear fichero.
			File fichero = new File("ficheroNombres.txt");
			FileWriter ficheroEscritura = new FileWriter(fichero);
			//2.- Escribir nombres.
			for(int i =0; i<lista.length;i++)
			{
				ficheroEscritura.write(lista[i]);
			}
			
			//3.- Cerrar fichero.
			ficheroEscritura.close();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void vaciarTabla(String[] lista)
	{
		for(int i=0; i<lista.length; i++)
		{
			lista[i]="";
		}
	}
	
	public static void leerFichero(String[] lista, char[] nombre)
	{
		
		try 
		{
			File fichero = new File("ficheroNombres.txt");
			FileReader ficheroLectura = new FileReader(fichero);
			//2.- Leer nombres
			//lee 4 caracteres a capon
			
			int res, i=0;
			boolean romper=false;
			
			res = ficheroLectura.read(nombre);
			while(res !=-1)
			{
				for(int a=0; a<nombre.length;a++)
				{
					if(nombre[a] == '*')
					{
						romper = true;
						break;
					}
				}
				lista[i] = String.valueOf(nombre);
				if(romper==true)
					break;
				res = ficheroLectura.read(nombre);
				i++;
			}	
			ficheroLectura.close();
		}
		catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	public static void imprimirTabla(String[] lista)
	{
		System.out.println("Contenido de la tabla");
		for(int i=0; i<lista.length;i++)
		{
			System.out.println("Posicion" + i +":" + lista[i]);
		}
	}
	
	public static void main (String[] args) 
	{
		String [] lista = {"Pepe*", "Ana*", "Juan*"};
		char[] nombre = new char[5];
		escribirFichero(lista);
		vaciarTabla(lista);
		imprimirTabla(lista);
		leerFichero(lista, nombre);
		imprimirTabla(lista);
		System.out.println(lista[0]);
		System.out.println(lista[1]);
		System.out.println(lista[2]);
	}
	
}
