// 1. Clase:
// Una clase es como un plano o una plantilla que define las características y 
//comportamiento de un objeto. Por ejemplo, si consideramos una clase "Coche",
// esta define qué atributos tiene un coche (como el color, la marca, el modelo) y 
// qué acciones puede realizar un coche (como arrancar, acelerar, frenar). La clase en sí misma no es un objeto real,
// pero sirve como un molde para crear objetos con características similares.

//2. Método:
//Un método es una función o acción específica que un objeto puede realizar. Siguiendo el ejemplo anterior,
// si tenemos una instancia de la clase "Coche", un método podría ser "arrancar()". Este método define cómo
// se inicia el motor del coche. Otros métodos podrían ser "acelerar()", "frenar()", "cambiarMarcha()", etc. 
//Los métodos encapsulan el comportamiento de un objeto y permiten interactuar con él.

/* Instancia
Imagina que una clase es como un plano o una plantilla que describe cómo se ve y cómo se comporta un objeto. 
Pero para que ese objeto exista en el mundo real, necesitamos crear una instancia de esa clase. 
La instancia es una representación concreta y única de ese objeto en particular.

Por ejemplo, si consideramos la clase "Coche", esta describe las características y comportamiento general de un coche. 
Sin embargo, cada coche individual que ves en la calle es una instancia única de la clase "Coche". 
Cada uno de ellos puede tener un color, una marca y un modelo diferentes, y pueden tener su propio estado y 
comportamiento específico.

En términos más técnicos, cuando creamos una instancia de una clase, estamos reservando memoria para almacenar los valores 
de los atributos de la clase y asignando un espacio único en la memoria para ese objeto. Luego, podemos acceder a
 los atributos y métodos de esa instancia específica.

En resumen, una instancia es una representación concreta y única de un objeto en particular, creada a partir de una clase.
 Es como tener un objeto real que ha tomado forma basándose en las características y comportamiento definidos en la clase.
*/
















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
