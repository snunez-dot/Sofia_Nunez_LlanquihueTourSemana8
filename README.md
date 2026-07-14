# Sofia_Nunez_LlanquihueTourSemana8
Llanquihue Tour App - Semana 8

Proyecto correspondiente a la semana 8 de Llanquihue Tour. El sistema permite registrar y administrar distintas entidades de la agencia mediante una estructura basada en herencia, interfaces y polimorfismo. Además, incorpora una interfaz gráfica para facilitar el ingreso y la visualización de los registros creados.

Clases e interfaces:
Interfaz
Registro: define el método mostrarResumen(), implementado por todas las entidades registrables.

Model

RecursosAgencia (clase abstracta).
GuiaTuristico.
Vehiculo.
ColaboradorExterno.

Data:
GestorEntidades: administra una colección ArrayList<Registro>, registra entidades y utiliza instanceof para identificar el tipo de cada objeto.

UI:
Main: ejecuta la aplicación.
Interfaz gráfica desarrollada para registrar y visualizar entidades.

Instrucciones de ejecución
Clonar o descargar el repositorio.
Abrir el proyecto como proyecto Maven en NetBeans.
Ejecutar la clase Main.java ubicada en el paquete ui.
Utilizar la interfaz gráfica para registrar entidades y visualizar los registros creados.

