package exercicio2;



public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(2000);

        try {
            conta.sacar(2500); // Tentando sacar mais do que o saldo disponível
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}

