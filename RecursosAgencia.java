
package cl.llanquihuetour.model;
public abstract class RecursosAgencia implements Registro {

    private String nombre;
    private String codigo;

    // Constructor vacío
    public RecursosAgencia() {

    }

    // Constructor con parámetros
    public RecursosAgencia(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nCodigo: " + codigo;
    }

}