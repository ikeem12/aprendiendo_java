package Dia7;

class Vehiculo {
    String mark = "Toyota";
    String model = "Corolla";
    String year = "2021";
    String color;

    public void printCar(){
        imprimirSeparador();
        System.out.println("marca: " + mark);
        System.out.println("modelo: " + model);
        System.out.println("año: " + year);
        imprimirSeparador();
    }

    private static void imprimirSeparador() {
        System.out.println("------------------------");
    }
}
