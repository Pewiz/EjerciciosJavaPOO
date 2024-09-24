package ClasesYObjetos;

public class Auto {
    private String marca;
    private String modelo;
    private float precio;

    public Auto(String marca, String modelo, float precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio(){
        return precio;
    }

    public String mostrarDatos(){
        return ("Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: "+precio);
    }
}
