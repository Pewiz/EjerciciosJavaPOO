package ClasesYObjetos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int lado1, lado2, nCuadrilatero;

        Scanner leer = new Scanner(System.in);

        System.out.print("Cuantos va a ingresar: ");
        nCuadrilatero= leer.nextInt();
    
        Cuadrilatero cuadrilateros [] = new Cuadrilatero[nCuadrilatero];

        for(int i =0; i<cuadrilateros.length; i++){
            System.out.println("CUADRILATERO");
            System.out.print("Lado 1: ");
            lado1 = leer.nextInt();
            System.out.print("Lado 2: ");
            lado2 = leer.nextInt();

            if(lado1 == lado2){
                cuadrilateros [i] = new Cuadrilatero(lado1);
            }else{
                cuadrilateros [i] = new Cuadrilatero(lado1, lado2);
            }

        }

        for(int i =0; i<cuadrilateros.length; i++){
            System.out.println("Cuadrilatero N°"+(i+1));
            System.out.println("Lado 1: "+cuadrilateros [i].getLado1());
            System.out.println("Lado 2: "+cuadrilateros[i].getLado2());
            System.out.println("Area: "+cuadrilateros[i].obtenerArea());
            System.out.println("Perimetro: "+cuadrilateros[i].obtenerPerimetro());
        }


    }
}
