package Common;

public class Cliente {
    // Paso 1 Definir los atributos. Los atributos son representados con variables.
    private String Nombre;
    private String Apellido;
    private String Identificacion;
    private String Telefono; // 8588-2255, 85965874

    // Paso 2
    public Cliente(String nombre, String apellido, String identificacion, String telefono) {
        Nombre = nombre;
        Apellido = apellido;
        Identificacion = identificacion;
        Telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String identificacion) {
        Identificacion = identificacion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getInformacion() {
        return "Nombre: " + getNombre() + " Apellido: " + getApellido() + " Identificacion: " + getIdentificacion();
    }

}