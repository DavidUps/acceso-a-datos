import java.util.Scanner;
import java.io.*;


public class bufferReader {

	public static void escribirFichero(String []lista)
	{
		try {
			File fichero = new File("fichero.txt");
			FileReader ficherolectura = new FileReader(fichero);
			BufferedReader ficheroBuffer = new BufferedReader(ficherolectura);
			//escribir
			for(int i=0;i<lista.length;i++)
			{
				ficheroBuffer.write(lista[i]);
				ficheroBuffer.readLine();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p;
		String [] lista = {"David","Arribas","21","Jose","Manuel","21","Jonatan","Domingas","23"};
		
		
		do
		{
			Scanner sc = new Scanner(System.in);
			p = sc.nextInt();
			
			System.out.println( "1.- Escribir datos y guardarlos en buffer \n" +
							    "2.- Leer datos del fichero y almacenar sobre las clases \n" +
								"3.- Escribir por consola los datos \n" + 
							    "4.- Vaciar la structura" +
								"5.- Salir");
			
			switch (p) 
			{
			case 1:
				
				
				break;

			default:
				sc.close();
				System.exit(1);
				break;
			}
		}while (p != 6);
	}

}
