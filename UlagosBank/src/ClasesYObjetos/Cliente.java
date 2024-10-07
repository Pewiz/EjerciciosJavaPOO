package ClasesYObjetos;

import java.util.ArrayList;

public class Cliente  extends Persona{
    private String password;
    private ArrayList<Cuenta> productos;

    public Cliente(String nombre, Fecha fechaDeNacimiento, String rut, String password) {
        super(nombre, fechaDeNacimiento, rut);
        this.password = password;
        this.productos = new ArrayList<Cuenta>();
    }

    public void agregarCuenta(Cuenta nuevaCuenta){
        productos.add(nuevaCuenta);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void getMovimientosProductos(int n) {
            productos.get(n).getMovimientos();
    }

    public void getProductos() {
        for (Cuenta producto : productos) {
            System.out.println(producto.toString());
        }
    }

    public double consultarSaldo(int n){
        return productos.get(n).getSaldo();
     }
 
    public void ingresarDinero(int n, double cantidad){
        productos.get(n).deposito(cantidad);
    }
    public void retirarDinero(int n, double cantidad){
        productos.get(n).retiro(cantidad);
    }
    
    public int encontrarCuenta(int n){
        int i=0, indice=0;
        boolean encontrado = false;
        while((i<productos.size()) && encontrado==false ){
            if(n == productos.get(i).getNumeroCuenta()){
                encontrado = true;
                indice = i;
            }else{
                indice= -1;
            }
            i++;
        }

        return indice;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPassword: " + password+"\n Cantidad de productos: "+productos.size();
    }
    
}
