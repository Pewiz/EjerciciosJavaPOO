package ClasesYObjetos;

public class Rectangulo extends Poligono {
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public double area(){
        return lado1*lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo"+"\nN°Lado: "+super.nLado+"\nLado1 = " + lado1 + "\nLado2 = " + lado2 ;
    }


    
}
