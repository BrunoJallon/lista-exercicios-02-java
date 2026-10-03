public class ContaCorrente {
    private static final float LIMITE_OPERACAO = 10000;

    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0; // saldo inicial sempre zero
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void sacar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido: informe um valor positivo.");
        } else if (valor > LIMITE_OPERACAO) {
            System.out.println("Operação negada: o limite por saque é R$ 10000,00.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        }
    }

    public void depositar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido: informe um valor positivo.");
        } else if (valor > LIMITE_OPERACAO) {
            System.out.println("Operação negada: o limite por depósito é R$ 10000,00.");
        } else {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        }
    }

    public float consultarSaldo() {
        return saldo;
    }
}
