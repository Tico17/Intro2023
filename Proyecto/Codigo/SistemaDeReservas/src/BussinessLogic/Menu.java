package BussinessLogic;

import java.util.Scanner;
import Common.Cliente;

public class Menu {

    /**
     * Metodo constructor
     */
    public Menu() { // Inicio constructor
        MostrarOpciones();
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
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
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
                    Saludar();
                    // Agrega el código correspondiente a la opción 1
                    break;
                case 2:
                    System.out.println("Has seleccionado la opción 2");
                    // Agrega el código correspondiente a la opción 2
                    break;
                case 3:
                    System.out.println("Has seleccionado la opción 3");
                    // Agrega el código correspondiente a la opción 3
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

    
}
