/**
 * @author lucas
 */
abstract  class Conta {

    protected double saldo;

    public abstract void atualiza(double taxaSelic);

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

}
