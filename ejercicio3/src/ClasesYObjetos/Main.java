package ClasesYObjetos;

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double lado, base;
        int nTriangulo;

        System.out.print("Cantidad de triangulos: ");
        nTriangulo = leer.nextInt();

        Triangulo triangulos[] = new Triangulo[nTriangulo];

        for(int i=0; i<triangulos.length; i++){
            System.out.println("-- DATOS TRIANGULO N°"+(i+1)+" --");
            System.out.print("Lado: ");
            lado = leer.nextDouble();
            System.out.print("Base: ");
            base = leer.nextDouble();

            triangulos[i] = new Triangulo(lado, base);
            System.out.println("Área: "+triangulos[i].area());
            System.out.println("Perímetro: "+triangulos[i].perimetro());
            System.out.println("\n");
        }

        System.out.println("El area del triangulo con mayor superficie es: "+areaMayor(triangulos));
    }

    public static double areaMayor(Triangulo triangulos[]){
        double areaM= triangulos[0].area();
        for(int i=1; i<triangulos.length; i++){
            if(triangulos[i].area() > areaM){
                areaM = triangulos[i].area();
            }
        }
        return areaM;
    }
}
