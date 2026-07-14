package cl.llanquihuetour.data;

import cl.llanquihuetour.model.ColaboradorExterno;
import cl.llanquihuetour.model.GuiaTuristico;
import cl.llanquihuetour.model.Registro;
import cl.llanquihuetour.model.Vehiculo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GestorEntidades {

    private ArrayList<Registro> entidades;

    // Constructor
    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

    // Menú principal
    public void iniciarSistema() {

        int opcion;

        do {

            String menu = """
                    === LLANQUIHUE TOUR ===

                    1. Registrar guía turístico
                    2. Registrar vehículo
                    3. Mostrar entidades
                    4. Salir
                    """;

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {

                case 1:

                    registrarGuia();
                    break;

                case 2:

                    registrarVehiculo();
                    break;

                case 3:

                    mostrarEntidades();
                    break;

                case 4:

                    JOptionPane.showMessageDialog(null,
                            "Hasta pronto.");
                    break;

                default:

                    JOptionPane.showMessageDialog(null,
                            "Opción inválida.");

            }

        } while (opcion != 4);

    }

    // Registrar guía
    private void registrarGuia() {

        String nombre = JOptionPane.showInputDialog("Nombre:");

        String codigo = JOptionPane.showInputDialog("Código:");

        String especialidad = JOptionPane.showInputDialog("Especialidad:");

        entidades.add(new GuiaTuristico(nombre, codigo, especialidad));

    }

    // Registrar vehículo
    private void registrarVehiculo() {

        String nombre = JOptionPane.showInputDialog("Nombre del vehículo:");

        String codigo = JOptionPane.showInputDialog("Código:");

        String patente = JOptionPane.showInputDialog("Patente:");

        int capacidad = Integer.parseInt(
                JOptionPane.showInputDialog("Capacidad:")
        );

        entidades.add(new Vehiculo(nombre, codigo,
                patente, capacidad));

    }

    // Mostrar entidades
    public void mostrarEntidades() {

        if (entidades.isEmpty()) {

            JOptionPane.showMessageDialog(null,
                    "No existen registros.");

            return;

        }

        String salida = "";

        for (Registro entidad : entidades) {

            if (entidad instanceof GuiaTuristico) {

                salida += "=== GUÍA TURÍSTICO ===\n";

            } else if (entidad instanceof Vehiculo) {

                salida += "=== VEHÍCULO ===\n";

            } else if (entidad instanceof ColaboradorExterno) {

                salida += "=== COLABORADOR EXTERNO ===\n";

            }

            salida += entidad.mostrarResumen();
            salida += "\n-----------------------------\n";

        }

        JOptionPane.showMessageDialog(null, salida);

    }

}