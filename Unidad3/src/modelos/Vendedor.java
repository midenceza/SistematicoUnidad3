package modelos;


/**
 * @author MARIO
 * @version 1.0
 * @created 22-nov.-2022 03:32:40 p. m.
 */
public class Vendedor {

	private String apellido;
	private int codigo;
	private String nombre;



	public void finalize() throws Throwable {

	}
	public Vendedor(){

	}

    public Vendedor(String apellido, int codigo, String nombre) {
        this.apellido = apellido;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
}//end Vendedor