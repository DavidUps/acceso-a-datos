
public class MetodoReturn {

	public static int buscarValor(int[] tabla, int valor) {
		int devolver = -1;
		for(int i=0;i<5;i++) {
			if(valor == tabla[i])
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {

		int [] miTabla = {12, 34, 44, 55, 19};
		
		int numero = buscarValor(miTabla, 43);
		System.out.println("La posicion es: " + numero);

	}

}
