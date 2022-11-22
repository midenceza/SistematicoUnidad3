package Package1;


/**
 * <ol>
 * 	<li></li>
 * </ol>
 * @author MARIO
 * @version 1.0
 * @updated 22-nov.-2022 04:01:41 p. m.
 */
public class Factura {

	private int codigo;
	private String fecha;
	private Cliente m_Cliente;
	private Producto m_Producto;
	private Vendedor m_Vendedor;

	public Factura(){

	}
	public void finalize(){

	}

	/**
	 * 
	 * @param Producto
	 */
	public void agregarProducto(Producto Producto){

	}

	/**
	 * 
	 * @param precio
	 * @param iva
	 */
	public double aplicarIVA(double precio, double iva){
		return 0;
	}

	/**
	 * 
	 * @param precio
	 * @param totalProductos
	 */
	public double calcMonto(double precio, double totalProductos){
		return 0;
	}

	/**
	 * 
	 * @param Producto
	 */
	public double calcTotal(List<Producto> Producto){
		return 0;
	}

	public factura(){

	}
}//end Factura