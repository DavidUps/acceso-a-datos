package repasoExamen;

import java.awt.List;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.annotation.processing.Filer;

public class Buffer {

	//menu Switch
	public static int elegirOpcionMenu()
	{
		System.out.println("Opciones");
		System.out.println("1. Escribir personas en fichero");
		System.out.println("2. Leer personas del fichero");
		System.out.println("3. Vaciar tabla de personas");
		System.out.println("4. Escribir tabla personas");
		System.out.println("5. Insertar persona");
		System.out.println("6. Eliminar personas");
		System.out.println("7. Fin");
		System.out.println("Introduce opción: ");
        Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		scan.reset();
		return numero;
	}
	
	//Escribir el fichero con la lista de personas
	public static void escribirFichero(ArrayList<Persona> lista)
	{
		try {
			File fichero = new File("fichero.txt");
			FileWriter ficheroEscritura = new FileWriter(fichero);
			BufferedWriter ficheroBufferEscritura = new BufferedWriter(ficheroEscritura);
			for(int i=0;i<lista.size();i++)
			{
				ficheroBufferEscritura.write(lista.get(i).getNombre());
				ficheroBufferEscritura.newLine();
				ficheroBufferEscritura.write(lista.get(i).getApellido());
				ficheroBufferEscritura.newLine();
				ficheroBufferEscritura.write(String.valueOf(lista.get(i).getEdad()));
				ficheroBufferEscritura.newLine();
			}
			ficheroBufferEscritura.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//Leer fichero
	public static void leerFichero(ArrayList<Persona> lista)
	{
		try {
			File fichero = new File("fichero.txt");
			FileReader ficheroLectura = new FileReader(fichero);
			BufferedReader ficheroBufferLectura = new BufferedReader(ficheroLectura);
			
			String linea;
			int i=0;
			linea = ficheroBufferLectura.readLine();
			while(linea != null)
			{
				lista.add(new Persona());
				lista.get(i).setNombre(linea);
				linea = ficheroBufferLectura.readLine();
				lista.get(i).setApellido(linea);
				linea = ficheroBufferLectura.readLine();
				lista.get(i).setEdad(linea);
				linea = ficheroBufferLectura.readLine();
				i++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//Borrar todo el array
	public static void borrarArray(ArrayList<Persona> lista)
	{
		lista.clear();
	}
	
	//Imprimir persona
	public static void imprimirPersonas(ArrayList<Persona>lista)
	{
		for(int i=0;i<lista.size();i++)
		{
			System.out.println("Persona"+i+"\n Nombre: " + lista.get(i).getNombre() + ", Apellido: " + lista.get(i).getNombre() + ", Edad: " + String.valueOf(lista.get(i).getEdad())+"\n");
		}
	}
	
	//Añadir persona
	public static void addPersona(ArrayList<Persona>lista)
	{
		lista.add(new Persona());
		String texto;
		Scanner sctexto = new Scanner(System.in);
		System.out.println("Nombre: ");
		texto = sctexto.next();
		lista.get(lista.size()-1).setNombre(texto);
		sctexto.reset();
		System.out.println("Apellido: ");
		texto = sctexto.next();
		lista.get(lista.size()-1).setApellido(texto);
		sctexto.reset();
		System.out.println("Edad: ");
		texto = sctexto.next();
		lista.get(lista.size()-1).setEdad(texto);
		sctexto.reset();
	}
	
	public static void eliminarPersona(ArrayList<Persona> lista)
	{
		System.out.println("¿A quien quieres eliminar?");
		Scanner num = new Scanner(System.in);
		for(int i=0;i<lista.size();i++)
		{
			System.out.println(i + " = " + lista.get(i).getNombre());
		}
		int nume = num.nextInt();
		lista.remove(nume);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creacion de arrayList
		ArrayList<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona("David", "Arribas", 23));
		lista.add(new Persona("Raul", "Perez", 25));
		lista.add(new Persona("Ana", "Gonzalez", 26));
		lista.add(new Persona("Joaquín", "De Obanos", 23));
		lista.add(new Persona("Antonio", "Canalejo", 27));
		
		int opcion;
		do
		{
			opcion = elegirOpcionMenu();
			switch (opcion)
			{
			case 1:
				escribirFichero(lista);
				break;

			case 2:
				leerFichero(lista);
				break;
			case 3:
				borrarArray(lista);
				break;
			case 4:
				imprimirPersonas(lista);
				break;
			case 5:
				addPersona(lista);
				break;
			case 6:
				eliminarPersona(lista);
				break;
			}
		}while(opcion != 7);
		
	}

}
