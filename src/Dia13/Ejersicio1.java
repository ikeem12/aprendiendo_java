package Dia13;

public class Ejersicio1 {
    public int num;
    public int num1;

    public Ejersicio1(int num, int num1){
        this.num = num;
        this.num1 = num1;
    }

    public int division(){
        try {
            return num / num1;
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
    }
}   
