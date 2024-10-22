package ClasesYObjetos;

public abstract class Poligono {
    protected int nLado;

    public Poligono(int nLado){
        this.nLado = nLado;
    }

    public int getnLado() {
        return nLado;
    }
    
    //Se crea el método Area como abstract porque es muy general para la clase Poligono
    public abstract double area();  

    @Override
    public String toString() {
        return "Numero de Lados : " + nLado;
    }
    
}
