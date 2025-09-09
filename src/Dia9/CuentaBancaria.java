package Dia9;

class CuentaBancaria {
    private String titular;
    private double saldo;

    public String getTitular(){
        return titular; 
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void depositar(double monto){
        if (monto > 0) {
            this.saldo += monto;
        }
    }

    public void retirar(double monto){
        if (this.saldo >= monto) {
            this.saldo -= monto;
        }
    }
}
