package ClasesYObjetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        llenarPoligono();
        mostrarArea();
    }

    public static void llenarPoligono(){
        int opcion = 0;
        double lado1, lado2, lado3;
        do{
            System.out.println("-- Eliga el Poligono --");
            System.out.println("1.- Rectangulo ");
            System.out.println("2.- Triangulo");
            System.out.println("3.- Salir");
            System.out.print("Opcion: ");
            opcion = leer.nextInt();

            switch(opcion){
                case 1: 
                        System.out.println("--RECTANGULO--");
                        System.out.print("Lado1: ");
                        lado1 = leer.nextDouble();
                        System.out.print("Lado2: ");
                        lado2 = leer.nextDouble();

                        Rectangulo rec = new Rectangulo(lado1, lado2);
                        poligonos.add(rec);
                        break;
                case 2: 
                        System.out.println("--Triangulo--");
                        System.out.print("Lado1: ");
                        lado1 = leer.nextDouble();
                        System.out.print("Lado2: ");
                        lado2 = leer.nextDouble();
                        System.out.print("Lado3: ");
                        lado3 = leer.nextDouble();

                        Triangulo tri = new Triangulo(lado1, lado2, lado3);
                        poligonos.add(tri);

                        break;
            }

        }while(opcion!=3);
    }

    public static void mostrarArea(){
        for(Poligono p: poligonos){
            System.out.println(p.toString());
            System.out.println("Area: "+p.area()+"\n");
        }
    }
}
