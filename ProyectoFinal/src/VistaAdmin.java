import java.util.InputMismatchException;
import java.util.Scanner;


public class VistaAdmin {
	private Scanner lectura;

	
	/**
	 * Vista del menú principal.
	 * @return devuelve la opcion seleccionada en el menu principal.
	 */
	public Integer menu() {
		lectura = new Scanner(System.in);
		int opcion=0;
		
		try{
			System.out.println("\nSISTEMA DE VENTA DE NEUMATICOS\n");
			System.out.println("***MENU***");
			System.out.println("\n1-Realizar venta");
			System.out.println("2-Desplegar el catalogo de productos en existencia");
			System.out.println("3-Registrar producto(s)");
			System.out.println("4-Eliminar producto(s)");
			System.out.println("5-Buscar producto");
			System.out.println("6-salir");
			System.out.println("\nOpción: ");
			
			opcion = lectura.nextInt();
			
			return opcion;
		}catch(InputMismatchException e) {
			
			System.out.println("La opcion seleccionada es inválida...");
			return opcion;
			
		}
		
	}
	
	
	
	/**
	 * Solicita al usuario que ingrese el código.
	 * @return devuelve el codigo que el usuario haya ingresado.
	 */
	public String pedirCodigo() {
		System.out.println("\nIngrese el código: ");
		lectura=new Scanner(System.in);
		return lectura.next();
	}
	
	
	/**
	 * Solicita al usuario que ingrese la medida de la llanta.
	 * @return Devuelve la medida ingresada por el usuario.
	 */
	public String pedirMedida() {
		System.out.println("Ingrese la medida del neumatico: ");
		lectura=new Scanner(System.in);
		return lectura.next();
	}
	
	
	/**
	 * Solicita al usuario que ingrese la marca del producto que este registrando.
	 * @return Devuelve la marca del neumatico.
	 */
	public String pedirMarca() {
		System.out.println("Ingrese la marca: ");
		lectura=new Scanner(System.in);
		return lectura.next();
	}
	
	
	/**
	 * Solicita al usuario que ingrese la cantidad de productos que desee registrar.
	 * @return devuelve la cantidad de productos.
	 */
	public Integer pedirCantidad() {
		System.out.println("Ingrese la cantidad de neumaticos: ");
		lectura=new Scanner(System.in);
		return lectura.nextInt();
	}
	
	
	/**
	 * Solicita al usuario que ingrese el costo unitario del neumatico que este registrando.
	 * @return Devuelve el costo unitario del neumatico.
	 */
	public Float pedirCosto() {
		System.out.println("Ingrese el costo del neumatico: ");
		lectura=new Scanner(System.in);
		return lectura.nextFloat();
	}
	
	
	/**
	 * Mensaje que se mostrara cuando no se encuentre un producto.
	 */
	public void MsgNoEncontrado() {
		System.out.println("\nNo se pudo encontrar el producto...");
	}
	
	
	/**
	 * Mensaje que se mostrara en pantalla cuando se termine un proceso con exito.
	 */
	public void MsgExito() {
		System.out.println("\nEl proceso se ha realizado correctamente.");
	}
	
	
	/**
	 * Mensaje que se mostrara en pantalla cuando la venta se realizo correctamente
	 */
	public void MsgVenta() {
	System.out.println("\nLa venta ha sido realizada exitosamente...");	
	}
}
