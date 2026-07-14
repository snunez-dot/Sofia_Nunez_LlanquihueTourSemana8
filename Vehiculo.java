package cl.llanquihuetour.model;

/**
 * Representa un vehículo de la empresa.
 */

public class Vehiculo extends RecursosAgencia {

    private String patente;
    private int capacidad;

    // Constructor vacío.
    public Vehiculo() {

    }

    // Constructor con parámetros.
    public Vehiculo(String nombre, String codigo,
            String patente, int capacidad) {

        super(nombre, codigo);
        this.patente = patente;
        this.capacidad = capacidad;
    }

    // Getters.
    public String getPatente() {
        return patente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    // Setters.
    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String mostrarResumen() {

        return "Vehiculo{" +
                "nombre='" + getNombre() + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", patente='" + patente + '\'' +
                ", capacidad=" + capacidad +
                '}';

    }

}