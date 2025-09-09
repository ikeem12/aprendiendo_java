package Dia9;

public class Producto {
    private String nombre;
    private double precio;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        if (precio > 0) {
            this.precio = precio;    
        }
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }
}
