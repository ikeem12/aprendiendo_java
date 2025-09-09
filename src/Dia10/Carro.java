package Dia10;

public class Carro extends Vehiculo{
    int puerta;
    
    public Carro(String marca, String modelo, String color, int puerta){
        super(marca, modelo, color);
        this.puerta = puerta;
    }

    @Override
    void mostrarInfo(){
        System.out.println(marca + " - " + modelo + " - " + color + " - " + puerta);
    }
}
