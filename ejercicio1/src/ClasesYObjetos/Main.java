package ClasesYObjetos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nCuadrilatero, lado1, lado2;

        System.out.print("Cantidad de cuadrilateros a ingresar: ");
        nCuadrilatero = leer.nextInt();

        Cuadrilatero cuadrilateros[] = new Cuadrilatero[nCuadrilatero];

        for(int i=0; i<cuadrilateros.length;i++){
            System.out.println("\n--CUADRILATERO N°"+(i+1));
            System.out.print("Lado 1: ");
            lado1 = leer.nextInt();
            System.out.print("Lado 2: ");
            lado2 = leer.nextInt();

            if(lado1 == lado2){
                cuadrilateros[i] = new Cuadrilatero(lado1);
            }else{
                cuadrilateros[i] = new Cuadrilatero(lado1, lado2);
            }
        }

        System.out.println("\n--RESULTADO--");
        mostrarResultado(cuadrilateros);
        

    }

    public static void mostrarResultado(Cuadrilatero cuadrilateros[]){
        for(int i=0; i<cuadrilateros.length; i++){
            System.out.println("\n--CUADRILATERO N°"+(i+1));
            System.out.println("Area: "+cuadrilateros[i].obtenerArea());
            System.out.println("Perimetro: "+cuadrilateros[i].obtenerPerimetro());
        }
    }
}
