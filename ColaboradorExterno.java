package cl.llanquihuetour.model;

/**
 * Representa un colaborador externo de la empresa.
 */
public class ColaboradorExterno extends RecursosAgencia {

    private String empresa;
    private String servicioPrestado;

    // Constructor vacío.
    public ColaboradorExterno() {

    }

    // Constructor con parámetros.
    public ColaboradorExterno(String nombre, String codigo,
            String empresa, String servicioPrestado) {

        super(nombre, codigo);
        this.empresa = empresa;
        this.servicioPrestado = servicioPrestado;
    }

    // Getters.
    public String getEmpresa() {
        return empresa;
    }

    public String getServicioPrestado() {
        return servicioPrestado;
    }

    // Setters.
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setServicioPrestado(String servicioPrestado) {
        this.servicioPrestado = servicioPrestado;
    }

    @Override
    public String mostrarResumen() {

        return "ColaboradorExterno{" +
                "nombre='" + getNombre() + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", empresa='" + empresa + '\'' +
                ", servicioPrestado='" + servicioPrestado + '\'' +
                '}';

    }

}