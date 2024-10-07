package ClasesYObjetos;
import java.time.LocalDate;
import java.time.Period;

public class CuentaJoven extends Cuenta{
    private double bonificacion;

    public CuentaJoven(Cliente titular, int numeroCuenta, double saldo, double bonificacion) {
        super(titular, numeroCuenta, saldo);
        this.bonificacion = bonificacion;
    }
    
    public CuentaJoven() {
        super(null, 0, 0.0);
        this.bonificacion = 0.0;
    }

    public boolean esTitularValido(){
        LocalDate fechaNacimiento = LocalDate.of(titular.fechaDeNacimiento.getYear(), titular.fechaDeNacimiento.getMes(), titular.fechaDeNacimiento.getDia());
        LocalDate fechaActual = LocalDate.now();

        Period diferencia = Period.between(fechaNacimiento, fechaActual);
        
        return diferencia.getYears()>=18 && diferencia.getYears()<=25; 
    }

    @Override
    public void deposito(double cantidad) {
        if(esTitularValido()){
            cantidad = cantidad + (cantidad * (bonificacion/100));
        }
        super.deposito(cantidad);
    }

    @Override
    public void retiro(double cantidad) {
        if(esTitularValido()){
            cantidad = cantidad + (cantidad * (bonificacion/100));
        }
        super.retiro(cantidad);
    }

    @Override
    public String toString() {
        return super.toString()+"\n Cuenta Joven \n Bonificacion: " + bonificacion+ "\n Cuenta Joven Valida: "+ esTitularValido();
    }

   
    

    
    
}
