import java.util.Scanner;
import java.io.*;


public class bufferReader {

	public static void writeFile(String []lista)
	{
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
		}
	}
	
	public static void readFile(String [] lista)
	{
		try 
		{
			File fichero = new File("ficheroNombresBuffered.txt");
			FileReader ficheroLectura = new FileReader(fichero);
			BufferedReader ficheroBuffer = new BufferedReader(ficheroLectura);
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
		} catch (Exception e) {
		}
		
	}
	
	public static void imprimirTabla(String[] lista) {
		System.out.println("Contenido de la tabla");
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Posicion" + i + ":" + lista[i]);
		}
	}
	
	public static void vaciarTabla(String[] lista) {
		for (int i = 0; i < lista.length; i++)
		{
			lista[i] = "";
		}
	}

	public static void meterPersonas(String[] lista, Persona [] people)
	{
		int a=0;
		
		for(int i=0;i<lista.length;i+=3)
		{ 
			people[a] = new Persona();
			people[a].meterNombre(lista[i]);
			people[a].meterApellido(lista[i+1]);
			people[a].meterEdad(lista[i+2]);
			a++;
		}
	}
	
	public static void imprimirPersonas(Persona [] people) {
		for(int i=0;i<people.length;i++)
		{
			System.out.println("Persona"+i+"\n" + "Nombre: " + people[i].getNombre() + "Apellido: " + people[i].getApellido() + "Edad: " + people[i].getEdad());;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p;
		
		String [] lista = {"David","Arribas","21","Jose","Manuel","21","Jonatan","Domingas","23"};
		
		Persona [] people = new Persona[5];
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println( "1.- Escribir datos y guardarlos en buffer \n" +
							    "2.- Leer datos del fichero y almacenar sobre las clases \n" +
								"3.- Escribir por consola los datos \n" + 
							    "4.- Vaciar la structura \n" +
								"5.- meterPersonas \n" +
							    "6.- imprimirPersonas \n" +
							    "7.- salir \n"
								);
			p = sc.nextInt();
			
			switch (p) 
			{
			case 1:
				writeFile(lista);
				System.out.println("Lista creada");
				break;

			case 2:
				readFile(lista);
				System.out.println("Lista leida");
				break;
			case 3:
				imprimirTabla(lista);
				System.out.println("Leer lista");
				break;
				
			case 4:
				vaciarTabla(lista);
				break;
				
			case 5:
				meterPersonas(lista,people);
				break;
				
			case 6:
				imprimirPersonas(people);
				break;
				
			case 7:
				sc.close();
				System.exit(1);
				break;
			}
		}while (p != 7);
	}

}
