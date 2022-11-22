package modelos;


/**
 * @author MARIO
 * @version 1.0
 * @created 22-nov.-2022 03:32:37 p. m.
 */
public class Cliente {

	private String apellidos;
	private int codigo;
	private String direccion;
	private String email;
	private String nombre;
	private String telefono;
	public Factura m_Factura;

	public Cliente(){

	}

    public Cliente(String apellidos, int codigo, String direccion, String email, String nombre, String telefono, Factura m_Factura) {
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.direccion = direccion;
        this.email = email;
        this.nombre = nombre;
        this.telefono = telefono;
        this.m_Factura = m_Factura;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Factura getM_Factura() {
        return m_Factura;
    }

    public void setM_Factura(Factura m_Factura) {
        this.m_Factura = m_Factura;
    }
        
}//end Cliente