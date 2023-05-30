// Importar librerias que nos brindan el acceso a funcionalidades como en este caso la de comunicarnos con la temminal.
import java.util.Scanner;

// Creamos una clase
public class Ejercicio05 
{ //Inicio de clase

	//Metodo de inicio de la clase
	public static void main(String args[]) 
	{ // Inicio del metodo main
		
		// Abrimos canal de comunicaci'on con la terminal
		Scanner entrada = new Scanner(System.in);
		// Definiendo una variable de tipo para almacenar la opcion seleccionada por el usuario
		int opcionseleccionada;

		// Creamos un ciclo
		do {

			System.out.println("Menu de comidas");
			System.out.println("(1) Para comidas mexicanas");
			System.out.println("(2) Para comidas peruanas");
			System.out.println("(0) Para salir");
			System.out.println("Por favor ingrese una opci�n");

			opcionseleccionada = entrada.nextInt();

			switch (opcionseleccionada) {
				case 1:
					System.out.println("Tacos $100");
					System.out.println("Burritos $200");
					System.out.println("Chilaquines $300");
					break;
				case 2:
					System.out.println("Ceviche");
					break;
				default:
					System.out.println("No lo podemos ayudar con su pedido");
			}
		} while (opcionseleccionada != 0);

		entrada.close();
	} // Fin del metodo main

} //Fin de clase
