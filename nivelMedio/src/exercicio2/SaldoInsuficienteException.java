package exercicio2;

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException() {
        super("Saldo para saque insuficiente.");
    }
}
