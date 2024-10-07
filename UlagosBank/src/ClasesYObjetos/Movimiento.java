package ClasesYObjetos;

public class Movimiento {
    private String tipoTransaccion;
    private double monto;

    public Movimiento(String tipoTransaccion, double monto) {
        this.tipoTransaccion = tipoTransaccion;
        this.monto = monto;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Tipo de Transaccion: " + tipoTransaccion + 
               "\n Monto: "  + monto;
    }

    
    
}
