package Semana9;

public class Ejercicio01 {

    public static void main(String[] args) {

        // 1.- Empleando arreglos, mostrar n productos con sus respectivos precios.

        String utiles[] = { "pelota", "zapatilla", "mochila", "polo" }; // el tamaño es de 4
        double precios[] = { 35.5, 89.60, 45.99 }; // el tamaño es 3

        System.out.println("Lista de Productos y sus precios");

        int ultimaPosicion = (precios.length - 1);

        for (int u = 0; u < utiles.length; u++) {

            //

            if (ultimaPosicion >= u) {
                System.out.println(utiles[u] + " " + precios[u]);
            } else {
                System.out.println(utiles[u] + " " + 0);

            }

        }
    }
}
