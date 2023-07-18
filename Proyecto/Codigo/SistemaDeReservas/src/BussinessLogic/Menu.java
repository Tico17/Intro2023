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

    public void reservarMesa(Cliente vpCliente, int vpNumeroMesa, String vpFecha, String vpHora) {

        for (int indice = 0; vgArregloDeMesas.length > indice; indice++) {

            if (vgArregloDeMesas[indice].getVgNumeroDeMesa() == vpNumeroMesa
                    && vgArregloDeMesas[indice].getVgEstado().equals(vgEstadoDisponible)) {

                System.out.println("La mesa #" + vpNumeroMesa + ", fue reservada de forma exitosa!");

                // Paso 1 cambiar el estado de la mesa por Reservada.
                vgArregloDeMesas[indice].setVgEstado(vgEstadoReservada);
                vgArregloDeMesas[indice].setVgCliente(vpCliente);
                vgArregloDeMesas[indice].setFecha(vpFecha);
                vgArregloDeMesas[indice].setHora(vpHora);

                return;
            }
        }

        System.out.println("El numero de mesa: " + vpNumeroMesa + " no esta disponible!");
    }
}
