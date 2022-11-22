package modelos;


public class Factura {

    private int codigo;
    private String fecha;
    private Cliente m_Cliente;
    private Producto m_Producto;
    private Vendedor m_Vendedor;

    public Factura() {

    }

    public Factura(int codigo, String fecha, Cliente m_Cliente, Producto m_Producto, Vendedor m_Vendedor) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.m_Cliente = m_Cliente;
        this.m_Producto = m_Producto;
        this.m_Vendedor = m_Vendedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getM_Cliente() {
        return m_Cliente;
    }

    public void setM_Cliente(Cliente m_Cliente) {
        this.m_Cliente = m_Cliente;
    }

    public Producto getM_Producto() {
        return m_Producto;
    }

    public void setM_Producto(Producto m_Producto) {
        this.m_Producto = m_Producto;
    }

    public Vendedor getM_Vendedor() {
        return m_Vendedor;
    }

    public void setM_Vendedor(Vendedor m_Vendedor) {
        this.m_Vendedor = m_Vendedor;
    }
    
    /**
     *
     * @param Producto
     */
    public void agregarProducto(Producto Producto) {

    }

    /**
     *
     * @param precio
     * @param iva
     */
    public double aplicarIVA(double precio, double iva) {
        return 0;
    }

    /**
     *
     * @param precio
     * @param totalProductos
     */
    public double calcMonto(double precio, double totalProductos) {
        return 0;
    }

    /**
     *
     * @param Producto
     */
    public double calcTotal(List<Producto> Producto) {
        return 0;
    }

    public factura() {

    }
}//end Factura
