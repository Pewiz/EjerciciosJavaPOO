package ClasesYObjetos;

public class Cuenta {
    private int numeroCuenta;
    private int saldo;

    public Cuenta(int numeroCuenta, int saldo){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    public int consultarSaldo(){
        return saldo;
    }
    public void ingresarSaldo(int cantidad){
         saldo+=cantidad;
    }
    public void retirarSaldo(int cantidad){
         saldo -=cantidad;
    }
}
