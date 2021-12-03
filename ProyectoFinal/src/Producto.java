

public class Producto {
	
	private String codigo;
	private String medida;
	private String marca;
	private float costo;
	
	
	/**
	 * Constructor
	 * @param codigo
	 * @param medida
	 * @param marca
	 * @param costo
	 */
	Producto(String codigo, String medida,String marca, float costo){
		setCodigo(codigo);
		setMedida(medida);
		setMarca(marca);
		setCosto(costo);
	}


	public void setCodigo(String codigo) {
		this.codigo=codigo;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public void setMedida(String medida) {
		this.medida=medida;
	}
	
	public String getMedida() {
		return this.medida;
	}
	
	public void setMarca(String marca) {
		this.marca=marca;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setCosto(float costo) {
		this.costo=costo;
	}
	
	public float getCosto() {
		return this.costo;
	}
	
	@Override
	public String toString() {
		return  getCodigo()+"  "+getMedida()+"  "+getMarca()+"  "+getCosto();
	}
}
