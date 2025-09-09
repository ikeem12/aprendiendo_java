package Dia14.ejersicio3;

public class Ejersicio3 {
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();

        Thread[] hilos = new Thread[80000];
        
        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new Thread(()->{
                contador.incrementar();
            });

            hilos[i].start();
        }

        for (Thread hilo : hilos) {
            hilo.join();
        }

        System.out.println("Valor final del contador: " + contador.getValor());
    }
}
