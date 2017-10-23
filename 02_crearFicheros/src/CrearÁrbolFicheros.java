import java.io.*;

public class Crear¡rbolFicheros {


	public static void main(String[] args) {

		File proyecto= new File("Proyecto");
		File bin = new File("C:\\Users\\David\\Documents\\GitHub\\acceso-a-datos\\02_crearFicheros\\Proyecto\\Bin");
		File src = new File("C:\\Users\\David\\Documents\\GitHub\\acceso-a-datos\\02_crearFicheros\\Proyecto\\Src");
		File doc = new File("C:\\Users\\David\\Documents\\GitHub\\acceso-a-datos\\02_crearFicheros\\Proyecto\\Doc");
		File bytecode = new File("C:\\Users\\David\\Documents\\GitHub\\acceso-a-datos\\02_crearFicheros\\Proyecto\\Bin\\Bytecode");
		File objetos = new File("C:\\Users\\David\\Documents\\GitHub\\acceso-a-datos\\02_crearFicheros\\Proyecto\\Bin\\Objetos");
		File clase = new File("C:\\Users\\David\\Documents\\GitHub\\acceso-a-datos\\02_crearFicheros\\Proyecto\\Src\\Clase");
		File html = new File("C:\\Users\\David\\Documents\\GitHub\\acceso-a-datos\\02_crearFicheros\\Proyecto\\Doc\\HTML");
		File pdf = new File("C:\\Users\\David\\Documents\\GitHub\\acceso-a-datos\\02_crearFicheros\\Proyecto\\Doc\\PDF");
		
		bin.mkdir();
		proyecto.mkdirs();
		src.mkdir();
		doc.mkdirs();
		bytecode.mkdirs();
		objetos.mkdirs();
		clase.mkdirs();
		html.mkdirs();
		pdf.mkdirs();
		
		
		
	}

}
