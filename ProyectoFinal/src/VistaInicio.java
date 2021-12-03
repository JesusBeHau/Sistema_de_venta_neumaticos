import java.util.Scanner;

public class VistaInicio {
	
	/**
	 * Solicita el número de usuario
	 * @return Devuelve el número de usuario ingresado.
	 */
	public int usuario() {
		Scanner lectura=new Scanner(System.in);
		int usuario=0;
		System.out.println("\n***Bienvenido al sistema de ventas neumaticos***");
		
		try {
			System.out.println("\nUsuario: ");
			usuario= lectura.nextInt();
			return usuario;
		}catch(Exception e) {
			return usuario;
		}
	}
	
	
	/**
	 * Solicita la contraseña del usuario.
	 * @return Devuelve la contraseña ingresada.
	 */
	public int contraseña() {
		Scanner lectura=new Scanner(System.in);
		int contra=0;
		try {
			System.out.println("Contraseña: ");
			contra= lectura.nextInt();
			return contra;
		}catch(Exception e) {
			return contra;
		}
	}
	
	
	/**
	 * Mensaje para informar que ha ingresado como administrador.
	 */
	public void MsgAdmin() {
		System.out.println("\nUsted ha ingresado como administrador");
	}
	
	
	/**
	 * Mensaje para informar que ha ingresado como vendedor.
	 */
	public void MsgVendedor() {
		System.out.println("\nUsted ha ingresado como vendedor");
	}
	
	
	/**
	 * Mensaje para informar que el usuario ingresado no existe.
	 */
	public void usuarioIncorrecto() {
		System.out.println("Usuario no valido, por favor intente de nuevo...");
	}
	
	
	/**
	 * Muestra el menú que se le presentara al vendedor.
	 * @return Devuelve la opción seleccionada por el usuario.
	 */
	public int vendedor() {
		Scanner lectura=new Scanner(System.in);
		int opcion=0;
		try {
			System.out.println("\nSISTEMA DE VENTAS DE NEUMATICOS\n");
			System.out.println("***Menú***");
			System.out.println("\n1-realizar venta.");
			System.out.println("2-Desplegar el catalogo de los productos existentes.");
			System.out.println("3-Salir");
			opcion= lectura.nextInt();
			return opcion;
		}catch(Exception e) {
			System.out.println("\nAlgo ha ocurrido mal, por favor intenta de nuevo");
			System.out.println("-------------------------------------------------------------------------------------------------------------");
			return opcion;
		}
		
	}
}
