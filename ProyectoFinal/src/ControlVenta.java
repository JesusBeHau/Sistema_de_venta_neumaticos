import java.io.*;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class ControlVenta {
	ControladorAdmin obj1;
	
	
	/**
	 * Imprime el ticket en pantalla.
	 * @param obj
	 * @param cliente
	 */
	public void generarTicket(Producto obj, String cliente) {
		String codigo=obj.getCodigo();
		String marca=obj.getMarca();
		String medida=obj.getMedida();
		double subtotal=0;
		double IVA=0;
		double total=0;
		
		if(cliente.equals("VM") || cliente.equals("vm")) {
			subtotal=(obj.getCosto()*1.25);
			IVA=subtotal*0.16;
			total=subtotal+IVA;
		}else {
			subtotal=obj.getCosto()*1.10;
			IVA=subtotal*0.16;
			total=subtotal+IVA;
		}
		
		VistaVenta.ticket(cliente, codigo, marca, medida, subtotal, IVA, total);
		
	}
	
	
	/**
	 * Guarda cada ticket generado en un archivo txt.
	 * @param cliente
	 * @param obj
	 */
	public void guardarTicket(String cliente, Producto obj) {
		File archivo;
		FileWriter escribir;
		PrintWriter linea;
		
		archivo=new File("Ventas.txt");
		
		if(!archivo.exists()) {
			try {
				archivo.createNewFile();
				escribir = new FileWriter(archivo, true);
				linea=new PrintWriter(escribir);
				
				linea.println("\n"+LocalDate.now());
				linea.println("Cliente: "+cliente);
				linea.println("Producto: Neumatico "+obj.getCodigo());
				linea.println("Marca: "+obj.getMarca()+" "+obj.getMedida());
				linea.println("Subtotal: "+obj.getCosto()*1.25);
				linea.println("IVA: "+(obj.getCosto()*1.25)*0.16);
				linea.println("Total: "+(obj.getCosto()*1.25)*1.16);
				
				linea.close();
				escribir.close();
			}catch(Exception e) {
				System.out.println("No se pudo guardar el ticket en el archivo...");
			}
		}else {
			try {
				escribir = new FileWriter(archivo, true);
				linea=new PrintWriter(escribir);
				
				linea.println("\n"+LocalDate.now());
				linea.println("Cliente: "+cliente);
				linea.println("Producto: Neumatico "+obj.getCodigo());
				linea.println("Marca: "+obj.getMarca()+" "+obj.getMedida());
				linea.println("Subtotal: "+obj.getCosto()*1.25);
				linea.println("IVA: "+(obj.getCosto()*1.25)*0.16);
				linea.println("Total: "+(obj.getCosto()*1.25)*1.16);
				
				linea.close();
				escribir.close();
			}catch(Exception e) {
				System.out.println("No se pudo guardar el ticket en el archivo...");
			}
		}
	}
	
}
