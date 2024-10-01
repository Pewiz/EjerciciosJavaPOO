package ClasesYObjetos;

public class Cuadrilatero {
    private int lado1;
    private int lado2;

    public Cuadrilatero(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public Cuadrilatero(int lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    public int getLado1(){
        return lado1;
    }
    public int getLado2(){
        return lado2;
    }
    public void setLado1(int lado1){
        this.lado1 = lado1;
    }

    public int obtenerArea(){
        int resultado = lado1 * lado2;
        return resultado;
    }

    public int obtenerPerimetro(){
        int resultado = 2*(lado1+lado2);
        return resultado;
    }
}
