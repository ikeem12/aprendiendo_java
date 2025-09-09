package Dia14.ejersicio3;

public class Contador {
    private int valor = 0;

    public void incrementar(){
        synchronized(this){
            valor ++;
        }
    }

    public int getValor(){
        return valor;
    }
}
