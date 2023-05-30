public class Ejercicio01 {

    // Metodo de inicio de nuestro proyecto
	public static void main(String args[]) {

        //Paso 1 Definir variables
		int variableresultado;
		int variablex;
		int variabley;

		// Paso 2 asignar valores iniciales
		variablex = -4;
		variabley = 2;
		// Paso 3 Realizamos la formula
		// (2(-4) - 3(2)) / 2 
		// (-8 - 6) / 2 
		// -14 / 2
		// El resultado es -7.
		variableresultado = ((2*variablex)-(3*variabley))/2;
		// Paso 4 Mostramos el resultado
        System.out.print("El resultado es: ");
		System.out.println(variableresultado);
	}
}
