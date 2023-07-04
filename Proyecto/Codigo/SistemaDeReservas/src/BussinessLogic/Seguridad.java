package BussinessLogic;

import Common.Usuario;

public class Seguridad {

    public Seguridad() {
        registroDeUsuarios();
    }

    /** Definir las vaariables globales */
    public Usuario[] arregloUsuarios = new Usuario[5];

    /** Metodo para cargar usuarios en el sistema */
    public void registroDeUsuarios() {

        /** Paso 1 Crear una instancia de la clase usuario */
        Usuario usuarioAdmin = new Usuario();
        usuarioAdmin.setVgNombreDeUsuario("Admin");
        usuarioAdmin.setVgPassword("123");

        Usuario usuarioClienteJohn = new Usuario("John", "123");
        Usuario usuarioClienteSaul = new Usuario("Saul", "123");
        Usuario usuarioClienteJenny = new Usuario("Jenny", "123");
        Usuario usuarioClienteAndrey = new Usuario("Andrey", "123");
        /** Paso 2 Agregar al arreglo la instancia del usuario admin */

        /** Posiscion del arreglo */
        arregloUsuarios[0] = usuarioAdmin;
        arregloUsuarios[1] = usuarioClienteJohn;
        arregloUsuarios[2] = usuarioClienteSaul;
        arregloUsuarios[3] = usuarioClienteJenny;
        arregloUsuarios[4] = usuarioClienteAndrey;
    }

    /**
     * Se declara un método llamado buscarUsuarioPorUsuarioClave que toma dos
     * parámetros:
     * vpUsuario y vpClave.
     * Tambien se utiliza la variable global arregloUsuarios,
     * que es el arreglo de Usuarios en el que se realizará la búsqueda.
     */
    public boolean buscarPorUsuarioClave(String vpUsuario, String vpClave) {
        /**
         * Se inicia un bucle for que recorre el arreglo de objetos desde el índice 0
         * hasta el último índice (length - 1).
         */
        /**
         * indice es la variable que se utilizara para indicarle al for cuando
         * detenerse, esta inicia con un valor inicial de
         * 0 porque este valor es la primer posicion de un arreglo.
         * 
         * y mediante el comando indice++ cada iteracion aumenta el valor en 1.
         * 
         * el condicional indice < arregloUsuarios.length le indica al for que debe
         * continuar siempre y cuando la respuesta sea TRUE
         */
        for (int indice = 0; indice < arregloUsuarios.length; indice++) {

            /**
             * Utilizamos la variable indice para obtener el usuario almacenado en la
             * posicion del arreglo
             */
            String vlUsuario = arregloUsuarios[indice].getVgNombreDeUsuario();
            String vlClave = arregloUsuarios[indice].getVgPassword();

            if (vlClave.equals(vpClave) && vlUsuario.equals(vpUsuario)) {

                /** Usuario existe y las credenciales son correctas */
                return true;
            }
        }

        /** Usuario no existe o las credenciales son incorrectas */
        return false;
    }

}
