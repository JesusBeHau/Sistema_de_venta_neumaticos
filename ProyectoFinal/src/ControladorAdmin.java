import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class ControladorAdmin {
	ArrayList<Producto> prodList;
	VistaAdmin vista;
	VistaVenta vistaVent=new VistaVenta();
	ControlVenta ventas=new ControlVenta();
	ControlArchivos archivo=new ControlArchivos();
	Producto obj1;
	
	ControladorAdmin(VistaAdmin vista){
		prodList = new ArrayList<Producto>();
		this.vista=vista;
	}
	
	
	public void persistenciaDatos() {
		archivo.pasarArray(prodList);
	}
	
	/**
	 * metodo para realizar la venta, invoca a los metodos para generar y guardar el ticket.
	 */
	public void venta() {
		int x=findProducto();
		if(x != -1) {
			String cliente=vistaVent.cliente();
			ventas.generarTicket(prodList.get(x), cliente);
			int opcion=vistaVent.confirmarVenta();
			
			switch(opcion) {
			case 1:
					ventas.guardarTicket(cliente, prodList.get(x));
					prodList.remove(x);
					archivo.nuevoArch(prodList);
					vista.MsgVenta();
			case 2:
				break;
			}
		}
	}
	
	
	/**
	 * Imprime todos los productos registrados
	 */
	public void imprimirProductos() {
		for(int i=0; i<prodList.size(); i++) {
			System.out.println("código: "+prodList.get(i).getCodigo()+" Medida: "+prodList.get(i).getMedida()+" Marca: "+prodList.get(i).getMarca()+" Precio al publico: "+(prodList.get(i).getCosto()*1.25*1.16));
		}
	}
	
	
	/**
	 * Método para registrar un producto.
	 */
	public void addProducto() {
		obj1 = new Producto(vista.pedirCodigo(), vista.pedirMedida(), vista.pedirMarca(), vista.pedirCosto());
		
		int cant= vista.pedirCantidad();
		
		for(int i=1; i<=cant; i++) {
			prodList.add(obj1);
			
			archivo.añadirObj(obj1);
		}
		
		vista.MsgExito();
	}
	
	
	/**
	 * Método para eliminar un producto.
	 */
	public void eliminarProducto() {
		int pos=findProducto();
		
		if(pos!=-1) {
			prodList.remove(pos);
			archivo.nuevoArch(prodList);
			vista.MsgExito();
		}
		
	}
	
	
	/**
	 * Método para encontrar un producto.
	 * @return devuelve la posicion del objeto en el array.
	 */
	public int findProducto() {
		String cod =vista.pedirCodigo();
		int pos=-1;
		
		for(int j=0; j < prodList.size(); j++) {
			if(prodList.get(j).getCodigo().trim().equals(cod.trim())) {
				pos=j;
				break;
			}
		}
		
		if(pos==-1){
			vista.MsgNoEncontrado();
		}else{
			System.out.println("Código: "+prodList.get(pos).getCodigo()+"  Medida: "+prodList.get(pos).getMedida()+"  Marca: "+prodList.get(pos).getMarca()+"  Precio al publico: "+(prodList.get(pos).getCosto()*1.25)*1.16);
		}
		return pos;
	}
	
	
	/**
	 * Controlador del menu principal del administrador.
	 */
	public void menuAdmin() {
		Integer opcion=0;
		
		while(opcion !=6 ) {
			switch(vista.menu()) {
				case 1:
					venta();
					break;
				case 2:
					imprimirProductos();
					break;
				case 3:
					addProducto();
					break;
				case 4:
					eliminarProducto();
					break;
				case 5:
					findProducto();
					break;
				case 6:
					opcion=6;
					break;
			}
		}
	}
}
