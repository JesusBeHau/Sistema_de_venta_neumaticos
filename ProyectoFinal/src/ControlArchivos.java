import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlArchivos {
	Scanner entrada;
	Producto obj2;
	
	
	/**
	 * Añade los nuevos productos en el archivo txt.
	 * @param obj1
	 */
	public void añadirObj(Producto obj1) {
		File arch;
		FileWriter escribir;
		PrintWriter linea;
		
		arch=new File("Almacen.txt");
		
		if(!arch.exists()) {
			try {
				arch.createNewFile();
				escribir = new FileWriter(arch, true);
				linea=new PrintWriter(escribir);
				
				linea.println(obj1);
				
				linea.close();
				escribir.close();
			}catch(Exception e) {
				System.out.println("No se pudo guardar en el archivo...");
			}
		}else {
			try {
				escribir = new FileWriter(arch, true);
				linea=new PrintWriter(escribir);
				
				linea.println(obj1);
				
				linea.close();
				escribir.close();
			}catch(Exception e) {
				System.out.println("No se pudo guardar en el archivo...");
			}
		}
	}
	
	
	/**
	 * Elimina el archivo txt existente y crea uno nuevo, donde registra los objetos guardados en el array
	 * @param prodList
	 */
	public void nuevoArch(ArrayList<Producto> prodList) {
		File arch;
		FileWriter escribir;
		PrintWriter linea;
		
		arch=new File("Almacen.txt");
		
		try {
			arch.createNewFile();
			escribir = new FileWriter(arch);
			linea=new PrintWriter(escribir);
			
			for(int i=0; i<prodList.size();i++) {
				obj2=prodList.get(i);
				linea.println(obj2);	
			}
				
			linea.close();
			escribir.close();
			
		}catch(Exception e) {
			System.out.println("Algo ha ocurrido mal...");
		}
	}
	
	
	/**
	 * Recupera todos los productos guardados en el archivo txt y los guarda nuevamente en el Array(Persistencia de datos).
	 * @param prodList
	 */
	public void pasarArray(ArrayList<Producto> prodList) {
		try {
			entrada=new Scanner(new File("Almacen.txt"));
			FileReader fr= new FileReader("Almacen.txt");
			BufferedReader br = new BufferedReader(fr);
			String linea;
			
			while((linea=br.readLine())!=null) {
				String codigo=entrada.next();
				String medida=entrada.next();
				String marca=entrada.next();
				float costo=entrada.nextFloat();
				
				
				obj2=new Producto(codigo, medida,marca, costo);
				prodList.add(obj2);
			}
		}catch(Exception e) {
			System.out.println("Aun no tenemos registrado alguna llanta en el sistema");
		}
		
	}
}




