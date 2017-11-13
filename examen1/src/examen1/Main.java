package examen1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Productos[] tabla = new Productos[4];
		
		//1.- Creacion de los productos
		for(int i=0; i<tabla.length;i++)
		{
			tabla[i] = new Productos();
		}
		
		//2.- Leer fichero
		//		Nombre1;Precio1;Nombre2;Precio2;...
		
		try
		{
			File fichero = new File("Productos.txt");
			FileReader ficheroR = new FileReader(fichero);
			char[] cadena = new char[1];
			int resultado,
				contador = 0,
				nProducto = 0; 
			String  valor ="",
					nombreA ="",
					precioA ="";
			
			resultado = ficheroR.read(cadena);
			
			while(resultado != -1)
			{
				if(cadena[0] != ';')
					valor += cadena[0];
				else
				{
					if(contador%2 == 0) //Nombre
						nombreA = valor;
					else //Precio
					{
						precioA = valor; 
						tabla[nProducto].setNombre(nombreA);
						tabla[nProducto].setPrecio(Integer.parseInt(precioA));
						nombreA ="";
						precioA ="";
						nProducto++;
					}
					valor ="";
					contador++;
				}
				resultado = ficheroR.read(cadena);
			}
			precioA = valor; 
			tabla[nProducto].setNombre(nombreA);
			tabla[nProducto].setPrecio(Integer.parseInt(precioA));
			
			//3.- Aumentar, Disminuir producto
			
			tabla[0].aumentar(10);
			tabla[1].disminuir(20);
			
			//4.- Escribir valores
			for(int i=0; i<tabla.length;i++)
			{
				System.out.println(tabla[i].escribir());
			}
		} 
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch ( IOException  e) {
			e.printStackTrace();
		}
		
		
	}

}
