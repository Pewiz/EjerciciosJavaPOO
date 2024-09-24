package ClasesYObjetos;

public class Triangulo {
    private double lado;
    private double base;

    public Triangulo(double lado, double base){
        this.lado = lado;
        this.base = base;
    }

    public double perimetro(){
        double per = base + 2*lado;
        return per;
    }
    public double area(){
        double are = (base*Math.sqrt((lado*lado) - ((base*base)/4))/2);  
        return are;
    }
}
