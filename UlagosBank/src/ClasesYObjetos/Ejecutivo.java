package ClasesYObjetos;

public class Ejecutivo  extends Persona{
    private String usuario;
    private String password;

    public Ejecutivo(String nombre, Fecha fechaDeNacimiento, String rut, String usuario, String password) {
        super(nombre, fechaDeNacimiento, rut);
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
