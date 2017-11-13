import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File carpeta = new File ("numeros");
		Scanner scan = new Scanner(System.in);
		File fichero;
		int numero;
		try
		{
			carpeta.mkdirs();
			for(int i=0; i<10;i++)
			{
				System.out.println("Introduce numero: ");
				numero = scan.nextInt();
				fichero =new File("Numeros\\" + numero + ".txt");
				fichero.createNewFile();
			}
				
		}catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
