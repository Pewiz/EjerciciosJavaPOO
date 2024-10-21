package ClasesYObjetos;

public class Cliente {
    private String nombre;
    private String apellido;
    private String rut;
    private Cuenta cuentas[];

    public Cliente(String nombre, String apellido, String rut, Cuenta [] cuentas){
        this.rut = rut;
        this.nombre=nombre;
        this.apellido = apellido;
        this.cuentas = cuentas;
    }

    public int consultarSaldo(int n){
       return cuentas[n].consultarSaldo();
    }

    public void ingresarDinero(int n, int cantidad){
        cuentas[n].ingresarSaldo(cantidad);
    }
    public void retirarDinero(int n, int cantidad){
        cuentas[n].retirarSaldo(cantidad);
    }

    public String datosClientes(){
        return ("Nombre: "+nombre+"\nApellido: "+apellido+"\nRut: "+rut+"\nCantidad de cuentas: "+cuentas.length);
    }

}
