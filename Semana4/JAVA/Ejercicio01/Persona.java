
//En este ejemplo, creamos una clase llamada "Persona" que tiene dos atributos: "nombre" (de tipo String) y 
//"edad" (de tipo int). La clase también tiene un constructor que nos permite inicializar los atributos al crear 
// un objeto de tipo Persona.

//La clase Persona tiene dos métodos: "saludar()" y "cumplirAnio()". El método "saludar()" muestra un mensaje de 
//saludo en la consola, utilizando los valores de los atributos nombre y edad. 
//El método "cumplirAnio()" incrementa la edad en 1 y muestra un mensaje de felicitación.

//Dentro del método principal "main()", creamos una instancia de la clase Persona llamada "persona1" y
//llamamos a los métodos de la clase para probar su funcionamiento.

// Definición de la clase
public class Persona {
    // Atributos de la clase
    private String nombre;
    private int edad;

    // Constructor de la clase
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos de la clase
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }

    public void cumplirAnio() {
        edad++;
        System.out.println("¡Feliz cumpleaños! Ahora tengo " + edad + " años.");
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de la clase Persona
        Persona persona1 = new Persona("Juan", 25);

        // Llamar a los métodos de la clase
        persona1.saludar();
        persona1.cumplirAnio();
        persona1.saludar();
    }
}
