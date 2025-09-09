package Dia14.ejersicio4;

import java.util.concurrent.atomic.AtomicInteger;

public class Contador {
    private final AtomicInteger valor = new AtomicInteger(0);

    public void incrementar(){
        valor.incrementAndGet();
    }

    public int getValor(){
        return valor.get();
    }
}
