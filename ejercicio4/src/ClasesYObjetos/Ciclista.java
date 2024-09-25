package ClasesYObjetos;

public class Ciclista {
    private int numeroCiclista;
    private String nombre;
    private float tiempoCarrera;

    public Ciclista(int numeroCiclista, String nombre, float tiempoCarrera){
        this.numeroCiclista= numeroCiclista;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public float getTiempoCarrera(){
        return tiempoCarrera;
    }

    public String datosCiclista(){
        return ("\nN°"+numeroCiclista+"\nNombre: "+nombre+"\nTiempo: "+tiempoCarrera);
    }
}   
