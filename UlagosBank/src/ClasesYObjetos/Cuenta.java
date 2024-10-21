package ClasesYObjetos;
import java.util.ArrayList;

public class Cuenta {
    protected Cliente titular;
    protected int numeroCuenta;
    protected double saldo;
    protected ArrayList <Movimiento> movimientos;

    public Cuenta(Cliente titular, int numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        movimientos = new ArrayList<Movimiento>();
    }


    public Cuenta() {
        this.titular = null;
        this.numeroCuenta = 0;
        this.saldo = 0.0;
        this.movimientos = null;
    }



    public String getTitular() {
        return "\nNombre: "+titular.getNombre()+"\n Rut: "+titular.getRut();
    }


    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }


    public void getMovimientos() {
        int i = 0; 
        for (Movimiento movimiento : movimientos) {
            System.out.println("Movimiento N°"+ i++ +"\n"+movimiento.toString());
        }

    }

    public void deposito(double cantidad){
        saldo +=cantidad;
        movimientos.add(new Movimiento("Deposito", cantidad));
    }

    public void retiro(double cantidad){
        saldo -=cantidad;
        movimientos.add(new Movimiento("Retiro", cantidad));
    }

    @Override
    public String toString() {
        return "Cuenta \n Titular:" + getTitular() + "\n Numero de Cuenta: " + numeroCuenta + "\n Saldo: " + saldo;
    }

    
    
    
}
