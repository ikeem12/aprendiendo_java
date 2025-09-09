package Dia9;

public class Encapsulamiento {
    public static void main(String[] args) {
        CuentaBancaria p = new CuentaBancaria();

        p.setTitular("johan");
        p.depositar(20);

        System.out.println(p.getSaldo());

        p.retirar(10);

        System.out.println(p.getSaldo());


        Producto t = new Producto();

        t.setNombre("camiseta");
        t.setPrecio(10);

        System.out.println(t.getNombre());
        System.out.println(t.getPrecio());
    }
}