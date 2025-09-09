package Dia10;

public class Vehiculo {
    String marca;
    String modelo;
    String color;
    
    public Vehiculo(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    void mostrarInfo(){
        System.out.println(marca + " - " + modelo + " - " + color);
    }
}
