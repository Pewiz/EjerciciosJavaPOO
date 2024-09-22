package ClasesYObjetos;

public class Cuadrilatero {
    private int lado1;
    private int lado2;

    public Cuadrilatero(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public Cuadrilatero(int lado1){
        this.lado1 = lado1;
        this.lado2 = lado1;
    }

    public int obtenerArea(){
        int area = lado1 * lado2;
        return area;
    }
    public int obtenerPerimetro(){
        int perimetro = 2*(lado1+lado2);
        return perimetro;
    }

}
