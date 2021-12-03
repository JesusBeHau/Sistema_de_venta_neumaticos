
public class ControladorInicio {
	VistaAdmin vista = new VistaAdmin();
	ControladorAdmin Productos = new ControladorAdmin(vista);
	VistaInicio objeto=new VistaInicio();
	
	
	/**
	 * Método para controlar el sistema al ingresar.
	 */
	public void inicio() {
		int aux=0;
		
		Productos.persistenciaDatos();
		while(aux==0) {
			int usuario=objeto.usuario();
			int contraseña=objeto.contraseña();
			
			if(usuario==93 && contraseña==931) {
				objeto.MsgAdmin();
				Productos.menuAdmin();
			}else {
				if(usuario==01 && contraseña==001) {
					objeto.MsgVendedor();
					int opcion=0;
					while(opcion!=3) {
						switch(objeto.vendedor()) {
							case 1:
								Productos.venta();
								break;
							case 2:
								Productos.imprimirProductos();
								break;
							case 3:
								opcion=3;
								break;
						}
					}
				}else {
					objeto.usuarioIncorrecto();
				}
			}
		}
	}

}
