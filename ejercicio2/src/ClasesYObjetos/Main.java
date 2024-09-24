package ClasesYObjetos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nAuto;
        float precio;
        String marca, modelo;

        System.out.print("Cantidad de autos a ingresar: ");
        nAuto = leer.nextInt();

        Auto autos[] = new Auto[nAuto];

        for(int i=0; i<autos.length; i++){
            leer.nextLine();
            System.out.println("\n--DATOS AUTO N°"+(i+1)+" --");
            System.out.print("Marca: ");
            marca = leer.nextLine();
            System.out.print("Modelo: ");
            modelo = leer.nextLine();
            System.out.print("Precio: ");
            precio = leer.nextFloat();

            autos[i] = new Auto(marca, modelo, precio);

        }


        System.out.println("\nEl auto más barato es: ");
        System.out.println(autos[autoMasBarato(autos)].mostrarDatos());

    }

    public static int autoMasBarato(Auto autos[]){
        float precioMenor = autos[0].getPrecio();
        int indice=0;

        for(int i=1; i<autos.length; i++){
            if(autos[i].getPrecio() < precioMenor){
                precioMenor = autos[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
}
