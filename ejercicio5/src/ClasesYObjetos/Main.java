package ClasesYObjetos;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre,apellido,rut;
        int numeroCuenta,saldo, cantidadCuentas, opcion, indiceCuenta, cantidadDinero, cantidadRetirar;
        Cuenta cuentas[];
        Cliente cliente;


        System.out.println("\t --DATOS CLIENTES--");
        System.out.print("Nombre: ");
        nombre = leer.nextLine();
        System.out.print("Apellido: ");
        apellido = leer.nextLine();
        System.out.print("Rut: ");
        rut = leer.nextLine();
        System.out.print("Ingrese la cantidad de cuentas que tiene: ");
        cantidadCuentas = leer.nextInt();

        cuentas = new Cuenta[cantidadCuentas];

        for(int i=0; i<cuentas.length; i++){
            System.out.println("\t --DATOS CUENTA N°"+(i+1)+" --");
            System.out.print("N° cuenta: ");
            numeroCuenta = leer.nextInt();
            System.out.print("Saldo: ");
            saldo = leer.nextInt();

            cuentas[i] = new Cuenta(numeroCuenta, saldo);
        }

        cliente = new Cliente(nombre, apellido, rut, cuentas);

        do{
            System.out.println("\t ---MENU---");
            System.out.println("1.- Consultar saldo");
            System.out.println("2.- Ingresar dinero");
            System.out.println("3.- Retirar dinero");
            System.out.println("4.- Salir");
            System.out.print("Opcion: ");
            opcion = leer.nextInt();

            switch(opcion){
                case 1: System.out.print("Ingrese el N° de cuenta:");
                        numeroCuenta = leer.nextInt();
                        indiceCuenta = encontrarCuenta(numeroCuenta, cuentas);
                        if( indiceCuenta == -1){
                            System.out.println("Cuenta no encontrada");
                        }else{
                            System.out.println("Su saldo es: $"+cliente.consultarSaldo(indiceCuenta));
                        }
                        
                        break;
                
                case 2: System.out.print("Ingrese el N° de cuenta:");
                        numeroCuenta = leer.nextInt();
                        indiceCuenta = encontrarCuenta(numeroCuenta, cuentas);
                        if( indiceCuenta == -1){
                            System.out.println("Cuenta no encontrada");
                        }else{
                            System.out.print("Ingrese la cantidad de dinero: ");
                            cantidadDinero = leer.nextInt();
                            if(cantidadDinero>=0){
                                cliente.ingresarDinero(indiceCuenta, cantidadDinero);
                            }else{
                                System.out.println("Valor no valido");
                            }

                            System.out.println("Su nuevo saldo es: "+cliente.consultarSaldo(indiceCuenta));
                        }
                        break;

                case 3: System.out.print("Ingrese el N° de cuenta:");
                        numeroCuenta = leer.nextInt();
                        indiceCuenta = encontrarCuenta(numeroCuenta, cuentas);
                        if( indiceCuenta == -1){
                            System.out.println("Cuenta no encontrada");
                        }else{
                            System.out.print("Ingrese la cantidad a retirar: ");
                            cantidadRetirar = leer.nextInt();

                            if(cantidadRetirar>=0 && cantidadRetirar<= cliente.consultarSaldo(indiceCuenta)){
                                cliente.retirarDinero(indiceCuenta, cantidadRetirar);
                            }else{
                                System.out.println("El monto supera el disponible");
                            }
                            System.out.println("Su nuevo saldo es: "+cliente.consultarSaldo(indiceCuenta));
                        }
                        
                        break;
                
                case 4: break;
                default:System.out.println("Opcion no valida"); break;
                
                

            }

        }while(opcion!=4);

    }

    public static int encontrarCuenta(int n, Cuenta cuentas[]){
        int i=0, indice=0;
        boolean encontrado = false;
        while((i<cuentas.length) && encontrado==false ){
            if(n == cuentas[i].getNumeroCuenta()){
                encontrado = true;
                indice = i;
            }else{
                indice= -1;
            }
            i++;
        }

        return indice;
    }
    

}
