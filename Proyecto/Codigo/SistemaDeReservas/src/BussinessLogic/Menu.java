package BussinessLogic;

import java.util.Scanner;

import Common.Cliente;

public class Menu {

    public Menu() {
        showMenu();
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú ===");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opción 1");
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
            }

            System.out.println(); // Salto de línea
        } while (opcion != 4);

        scanner.close();
    }

}
