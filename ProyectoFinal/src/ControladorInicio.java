
public class ControladorInicio {
	VistaAdmin vista = new VistaAdmin();
	ControladorAdmin Productos = new ControladorAdmin(vista);
	VistaInicio objeto=new VistaInicio();
	
	
	/**
	 * M�todo para controlar el sistema al ingresar.
	 */
	public void inicio() {
		int aux=0;
		
		Productos.persistenciaDatos();
		while(aux==0) {
			int usuario=objeto.usuario();
			int contrase�a=objeto.contrase�a();
			
			if(usuario==93 && contrase�a==931) {
				objeto.MsgAdmin();
				Productos.menuAdmin();
			}else {
				if(usuario==01 && contrase�a==001) {
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
