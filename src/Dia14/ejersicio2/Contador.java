package Dia14.ejersicio2;

public class Contador {
    private int valor = 0;

    public synchronized void incrementar(){
        valor++;
    }

    public synchronized int getValor(){
        return valor;
    }
}
