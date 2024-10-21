package ClasesYObjetos;
import java.time.LocalDate;
import java.time.Period;

public  class Persona {
    protected String nombre; 
    protected Fecha fechaDeNacimiento;
    protected String rut;
    

    public Persona(String nombre, Fecha fechaDeNacimiento, String rut) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.rut = rut;
    }

    public Persona(){
        this.nombre = "";
        this.fechaDeNacimiento = new Fecha(0, 0, 0);
        this.rut = "";
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFechaDeNacimiento() {
        return fechaDeNacimiento.toString();
    }
    public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }



    public boolean esMayorDeEdad(Fecha fechaDeNacimiento){
        LocalDate fechaNacimiento = LocalDate.of(fechaDeNacimiento.getYear(), fechaDeNacimiento.getMes(), fechaDeNacimiento.getDia());
        LocalDate fechaActual = LocalDate.now();

        Period diferencia = Period.between(fechaNacimiento, fechaActual);
        
        return diferencia.getYears()>=18;
    }

    @Override
    public String toString() {
        return "\n Nombre: " + nombre + 
                "\n Fecha De Nacimiento: " + fechaDeNacimiento + 
                "\n Rut: " + rut + "\n";
    }

    
    
}
