import java.time.LocalDate;
import java.util.Scanner;
public class VistaVenta {
	/**
	 * Solicita que ingresen el nombre del cliente.
	 * @return
	 */
	public String cliente() {
		Scanner lectura=new Scanner(System.in);
		System.out.println("\nIngrese el nombre del cliente: ");
		return lectura.next();
	}
	
	
	/**
	 * Pregunta si se desea confirmar o cancelar la venta.
	 * @return Devuelve la opción seleccionada por el usuario.
	 */
	public int confirmarVenta() {
		Scanner lectura= new Scanner(System.in);
		System.out.println("\n1) Confirmar venta");
		System.out.println("2) cancelar");
		return lectura.nextInt();
	}
	
	
	/**
	 * Imprime el ticket en pantalla.
	 * @param cliente
	 * @param codigo
	 * @param marca
	 * @param medida
	 * @param subtotal
	 * @param IVA
	 * @param total
	 */
	public static void ticket(String cliente, String codigo, String marca, String medida, double subtotal, double IVA, double total) {
		System.out.println("\n"+LocalDate.now());
		System.out.println("\nCliente: "+cliente);
		System.out.println("Producto: Neumatico "+codigo);
		System.out.println("Marca: "+marca+" "+medida);
		System.out.println("Subtotal: "+subtotal);
		System.out.println("IVA: "+IVA);
		System.out.println("Total: "+total);
	}
}
