package cl.llanquihuetour.model;

/**
 * Representa un guía turístico de la empresa.
 */

public class GuiaTuristico extends RecursosAgencia {

    private String especialidad;

    // Constructor vacío.
    public GuiaTuristico() {

    }

    // Constructor con parámetros.
    public GuiaTuristico(String nombre, String codigo,
            String especialidad) {

        super(nombre, codigo);
        this.especialidad = especialidad;
    }

    // Getter.
    public String getEspecialidad() {
        return especialidad;
    }

    // Setter.
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


    @Override
    public String mostrarResumen() {

        return "GuiaTuristico{" +
                "nombre='" + getNombre() + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';

    }

}