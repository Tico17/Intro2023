package BussinessLogic;

import java.util.Scanner;
import Common.Cliente;
import Common.Mesa;

public class Menu {
    /** Arreglo de mesas disponibles en el restaurante */
    private Mesa[] vgArregloDeMesas = new Mesa[10];
    final String vgEstadoDisponible = "Disponible";
    final String vgEstadoReservada = "Reservada";

    /**
     * Metodo constructor
     */
    public Menu() { // Inicio constructor

        inicializarMesas();

        login();
    } // Fin de constructor

    /**
     * Metodo para mostrar las opciones del menu en pantalla
     */
    public void MostrarOpciones() { // Inicio

        /**
         * Paso 1. Vamos a crear una instancia de la libreria Scanner para interactuar
         * con la terminal.
         */
        /**
         * Se le pasa como parametro al constructor de Scanner System.in para indicar
         * que solo deseamos
         * obtener los valores que ingresa el usuario
         */
        Scanner entrada = new Scanner(System.in);

        /**
         * Paso 2. Vamos a crear una variable que almacenara el la opcion seleccionada o
         * ingresada por el usuario
         */
        int opcion = 0;

        /** Paso 3. Vamos a definir un ciclo do - while */
        do { // Inicio del do

            /** 4. Vamos a mostrar las opciones que estan permitidas para el usuario */
            /** Para esto utlizamos el System.out.println */
            System.out.println("=== Menú ===");
            System.out.println("1. Consulta de mesas disponibles");
            System.out.println("2. Reservar mesa");
            System.out.println("3. Consulta de mesas reservadas");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            /**
             * Paso 5. Vamos asignar a la variable opcion que es tipo int el valor que
             * ingreso el usuario es decir la opción seleccionada
             */
            /**
             * El valor seleccionado por el usuario lo obtenemos haciendo un llamado al
             * metodo nextInt() de la clase Scanner que retornar el proximo valor de tipo
             * int ingresado por el usuario
             */
            opcion = entrada.nextInt();

            /**
             * Paso 6. Vamos definir un switch es una manejador de opciones un poco más
             * flexible que los if o else
             * recibe un parametro en este caso la variable opcion que almacena la opcion
             * seleccionada.
             * 
             * Y se puede crear diferentes casos, los casos como las opciones que el switch
             * maneja para un valor particular.
             * 
             * Los casos son escenarios para opciones pre establecidas
             * 
             * Existe un escenario default que va capturar todo las opciones no manejadas
             * por el switch.
             */
            switch (opcion) { // inicio de switch
                case 1:
                    getMesasPorEstado(vgEstadoDisponible);
                    break;
                case 2:
                    // Todos tienen que ser llenados por el usuario.

                    Cliente vlCliente = new Cliente();
                    vlCliente.setNombre("John");
                    vlCliente.setApellido("Quesada");
                    vlCliente.setIdentificacion("202220222");
                    vlCliente.setTelefono("8888-8888");
                    int vlNumeroMesa = 5;
                    String vlFecha = "18/07/2023";
                    String vlHora = "12:00md";

                    reservarMesa(vlCliente, vlNumeroMesa, vlFecha, vlHora);
                    // Agrega el código correspondiente a la opción 2
                    break;
                case 3:
                    getMesasPorEstado(vgEstadoReservada);

                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
                    break;
            } // finaliza switch

            System.out.println(); // Salto de línea

        } // Fin del do

        /**
         * Agregamos la condicion logica que indica si el ciclo debe continuar o
         * finalizar
         */
        while (opcion != 4);

        entrada.close();
    } // Fin

    public void Saludar() {
        System.out.print("Hola");
    }

    public void login() {

        /**
         * Se le pasa como parametro al constructor de Scanner System.in para indicar
         * que solo deseamos
         * obtener los valores que ingresa el usuario
         */
        Scanner entrada = new Scanner(System.in);

        /** Solicitar los valores al usuario */
        String vlUsuario = "";
        String vlClave = "";

        System.out.println("Por favor ingrese sus credenciales");
        System.out.println("Ingrese su usuario");
        vlUsuario = entrada.next();
        System.out.println("Por favor ingrese su contraseña");
        vlClave = entrada.next();

        Seguridad vlSeguridad = new Seguridad();

        Boolean vlResultado = vlSeguridad.buscarPorUsuarioClave(vlUsuario, vlClave);

        if (vlResultado) {
            System.out.println("Bienvenido!");
            MostrarOpciones();
        } else {
            System.out.println("Credenciales incorrectas!");

        }

        entrada.close();

    }

    public void inicializarMesas() {
        // Todas mis mesas van a tener 4 espacios.
        for (int indice = 0; vgArregloDeMesas.length > indice; indice++) {
            vgArregloDeMesas[indice] = new Mesa(indice + 1, 4);
        }

    }

    // crear un metodo
    public void getMesasPorEstado(String vpEstado) {
        System.out.println("Lista de mesas : " + vpEstado);

        for (int indice = 0; vgArregloDeMesas.length > indice; indice++) {
            String vlEstado = vgArregloDeMesas[indice].getVgEstado();

            if (vlEstado.equals(vpEstado)) {
                System.out.println("Mesa #" + vgArregloDeMesas[indice].getVgNumeroDeMesa());
            }
        }
    }

    /**
     * 
     * @param vpCliente
     * @param vpNumeroMesa
     * @param vpFecha
     * @param vpHora
     */
    public void reservarMesa(Cliente vpCliente, int vpNumeroMesa, String vpFecha, String vpHora) {

        /** Paso 1: Creamos un for para recorrer el arregle de mesas --> vgArregloDeMesas. Este recorrido
         * tiene el objetivo de buscar y verificar si la mesa seleccionada para la reserva esta disponible.
         */
        for (int indice = 0; vgArregloDeMesas.length > indice; indice++) {

            /** Paso 2: Creamos un condicional por medio de un if para ir verificando cada posicion del arreglo hasta
             * encontrar la mesa donde su numero se igual al suministrado por el usuario.
             * para esto revisamos el arreglo en cada recorrido, ciclo o vuelta del for.
             * 
             * Se comparar dos atributos del la mesa numero de mesa y el estado.
             */

            /** Paso 2.1 obtener el valor de la mesa que pertenece al indice del ciclo y asignarlo a una variable */
            Mesa vlMesaDelCiclo = vgArregloDeMesas[indice];
            /** Paso 2.2 obtener el numero de mesa y su estado por medio de los metodo getters*/
            String vlEstado = vlMesaDelCiclo.getVgEstado(); /** Para obtener el estado utilizamos el metodo getVgEstado() */
            int vlNumeroMesa = vlMesaDelCiclo.getVgNumeroDeMesa(); /** Para obtener el numero de mesa utilizamos el metodo getVgNumeroDeMesa */
            
            /** Paso 3. comparamos los valores de la mesa que va en el ciclo contra los parametros suministrados al metodo */
            if (vlNumeroMesa == vpNumeroMesa  && vlEstado.equals(vgEstadoDisponible)) {

                /** Paso 4. Si los parametros son iguales a la mesa se ingresa al if para realizar la reserva */
                /** Paso 4.1 Se muestra un mensaje indicando que la mesa fue reservada de forma exitosa  */
                System.out.println("La mesa #" + vpNumeroMesa + ", fue reservada de forma exitosa!");

                /** Paso 4.2 Modificamos los atributos de la mesa para asignar los valores de la reserva y tener los datos diponibles 
                 * para futuras consultas.
                 */

                /** Pas 4.3 como vamos a modificar los datos almacenados previamente en una posicion del arreglo utilizamos
                 * la siguiente forma arreglo[indice].setMedoDelAtributo que deseamos modificar.
                 * 
                 * Teniendo en cuenta que los metodos get son para obtener informacion y los set para asigna o actualizar informacion
                */
                vgArregloDeMesas[indice].setVgEstado(vgEstadoReservada);
                vgArregloDeMesas[indice].setVgCliente(vpCliente);
                vgArregloDeMesas[indice].setFecha(vpFecha);
                vgArregloDeMesas[indice].setHora(vpHora);

                return;
            }
        }

        /** Si el for finaliza y nunca ingreso al if es porque no existe una mesa que cumpla con los parametros de busqueda
         * por medio de un mensaje le informamos al usuario que la mesa no esta disponible.
         */
        System.out.println("El numero de mesa: " + vpNumeroMesa + " no esta disponible!");
    }
}
