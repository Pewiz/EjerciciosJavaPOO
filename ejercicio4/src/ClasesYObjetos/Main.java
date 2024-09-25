package ClasesYObjetos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nCiclitas, numeroCiclista;
        String nombre;
        float tiempoCarrera;

        System.out.print("Ingrese la cantidad de ciclistas: ");
        nCiclitas = leer.nextInt();

        Ciclista ciclistas[] = new Ciclista[nCiclitas];

        for(int i=0; i<ciclistas.length; i++){

            System.out.println("-- DATOS CICLISTA N°"+(i+1)+" --");
            System.out.print("Numero Ciclista: ");
            numeroCiclista = leer.nextInt();
            System.out.print("Nombre: ");
            leer.nextLine();
            nombre = leer.nextLine();
            System.out.println("Tiempo: ");

            tiempoCarrera = leer.nextFloat();

            ciclistas[i] = new Ciclista(numeroCiclista, nombre, tiempoCarrera);
        }

        System.out.print("\n--El ganador es: --");
        ganador(ciclistas);

    }

    public static void ganador(Ciclista ciclistas[]){
        float tiempoGanador = ciclistas[0].getTiempoCarrera();
        int indice = 0;

        for(int i=0; i<ciclistas.length; i++){
            if(ciclistas[i].getTiempoCarrera() < tiempoGanador){
                tiempoGanador = ciclistas[i].getTiempoCarrera();
                indice = i;
            }
        }

        System.out.println(ciclistas[indice].datosCiclista());
    }
}