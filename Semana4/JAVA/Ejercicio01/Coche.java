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

/**
 * Clase que representa un coche.
 */
public class Coche {

    // Atributos ( variables tipo )
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private int anno;
    private String tipoCombustible;
    private String tipoMotor;
    private String tipoTransmision;

    // 

    /**
     * Constructor de la clase Coche.
     * Es el metodo encargado de iniciar la creacion de un objeto nuevo con base a
     * la clase y donde se encapsula
     * la funcionalidad de inicio del mismo.
     * 
     * @param marca  La marca del coche.
     * @param modelo El modelo del coche.
     * @param color  El color del coche.
     */
    public Coche(
            String vpMarca,
            String vpModelo,
            String vpColor,
            int vpAnno,
            String vpTipoCobustible,
            String vpTipoMotor,
            String vpTipoTransmision) {
        //
        this.marca = vpMarca;
        this.modelo = vpModelo;
        this.color = vpColor;
        this.velocidad = 0;

        this.anno = vpAnno;
        this.tipoCombustible = vpTipoCobustible;
        this.tipoMotor = vpTipoMotor;
        this.tipoTransmision = vpTipoTransmision;

    }

    /**
     * Método para acelerar el coche.
     * 
     * @param incremento El valor de incremento de velocidad.
     */
    public void acelerar(int incremento) {
        this.velocidad += incremento;
        System.out.println("El coche " + marca + " " + modelo + " ha acelerado a " + velocidad + " km/h.");
    }

    /**
     * Método para frenar el coche.
     * 
     * @param decremento El valor de decremento de velocidad.
     */
    public void frenar(int decremento) {
        if (velocidad >= decremento) {
            velocidad -= decremento;
        } else {
            velocidad = 0;
        }
        System.out.println("El coche " + marca + " " + modelo + " ha frenado a " + velocidad + " km/h.");
    }



    /**
     * Método para mostrar la información del coche.
     */
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidad + " km/h");

        System.out.println("Año: " + anno);
        System.out.println("tipo Combustible: " + tipoCombustible);
        System.out.println("tipo Motor: " + tipoMotor);
        System.out.println("tipo Transmision: " + tipoTransmision);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {

        // Crear una instancia de la clase Coche
        Coche miCoche = new Coche("Ford", "Mustang", "Rojo", 2023, "Gasolina", "2000CC", "Automatica");

        // Llamar a los métodos de la instancia
        miCoche.mostrarInformacion();

        miCoche.acelerar(50);

        miCoche.frenar(20);

        miCoche.mostrarInformacion();


        

    }
}
