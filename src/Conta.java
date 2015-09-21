/**
 * @author lucas
 */
class Conta {

    private int numero;
    private Cliente titular;
    private double saldo;
    private double limite;

    Conta(Cliente titular) {
        this.titular = titular;
    }

    Conta(int numero, Cliente titular) {
        this(titular); // chama o construtor que foi declarado acima
        this.numero = numero;
    }

    void saca(double quantidade) {
        if (quantidade > this.saldo + this.limite) {
            System.out.println("Não posso sacar fora do limite!");
        } else {
            this.saldo = this.saldo - quantidade;
        }
    }

    public void deposita(double quantidade) {
        if (quantidade > 0) {
            this.saldo += quantidade;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
