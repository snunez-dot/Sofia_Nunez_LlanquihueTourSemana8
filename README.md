# Sofia_Nunez_LlanquihueTourSemana8
Llanquihue Tour App, semana 8
Breve descripción del sistema

Proyecto correspondiente a la semana 8 de Llanquihue Tour. El sistema permite registrar y mostrar distintas entidades de la agencia mediante una estructura basada en herencia, interfaces y polimorfismo. Con una interfaz gráfica de JOptionPane, permitiendo ingresar nuevos registros y ver la información almacenada.

Clases e interfaces:

Interfaz
Registro: define el método mostrarResumen() que implementan todas las entidades registrables.

Model
RecursosAgencia: clase abstracta base del sistema
GuiaTuristico
Vehiculo
ColaboradorExterno

Data:
GestorEntidades: administra una colección ArrayList<Registro>, registra nuevas entidades y utiliza instanceof para identificar el tipo de cada objeto.

UI:
Main: inicia el sistema y ejecuta la interfaz gráfica desarrollada con JOptionPane.

Instrucciones de ejecución
Clonar o descargar el proyecto.
Abrir el proyecto como proyecto Maven en NetBeans o IntelliJ IDEA.
Ejecutar la clase Main.java ubicada en el paquete ui.
Utilizar el menú de la interfaz gráfica para registrar guías turísticos o vehículos y visualizar los registros creados.
