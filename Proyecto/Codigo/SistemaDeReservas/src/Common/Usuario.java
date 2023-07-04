package Common;

public class Usuario {

    private String vgNombreDeUsuario;
    private String vgPassword;

    /** Contructor sin parametros y con asignacionde valores por defecto */
    public Usuario() {
        vgNombreDeUsuario = "";
        vgPassword = "";
    }

    /** Constructor con parametros y asignacion de variables */
    public Usuario(String vpNombreDeUsuario, String vpPassword) {
        vgNombreDeUsuario = vpNombreDeUsuario;
        vgPassword = vpPassword;
    }

    /**  */
    public String getVgNombreDeUsuario() {
        return vgNombreDeUsuario;
    }

    public void setVgNombreDeUsuario(String vgNombreDeUsuario) {
        this.vgNombreDeUsuario = vgNombreDeUsuario;
    }

    public String getVgPassword() {
        return vgPassword;
    }

    public void setVgPassword(String vgPassword) {
        this.vgPassword = vgPassword;
    }

    
}