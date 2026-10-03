import java.util.Scanner;

public class Main {
    private static final Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Cadastro da conta ===");
        int numero = lerInt("Número da conta: ");
        System.out.print("Titular: ");
        String titular = teclado.nextLine();

        ContaCorrente conta = new ContaCorrente(numero, titular);

        int opcao;
        do {
            exibirMenu(conta);
            opcao = lerInt("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    conta.sacar(lerFloat("Valor do saque: R$ "));
                    break;
                case 2:
                    conta.depositar(lerFloat("Valor do depósito: R$ "));
                    break;
                case 3:
                    System.out.printf("Saldo atual: R$ %.2f%n", conta.consultarSaldo());
                    break;
                case 0:
                    System.out.println("Encerrando o programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        teclado.close();
    }

    private static void exibirMenu(ContaCorrente conta) {
        System.out.println();
        System.out.println("=== Conta " + conta.getNumero() + " - " + conta.getTitular() + " ===");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Consultar saldo");
        System.out.println("0 - Sair");
    }

    // Lê uma linha e converte para int, repetindo até o usuário digitar algo válido
    private static int lerInt(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return Integer.parseInt(teclado.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
    }

    // Aceita vírgula ou ponto como separador decimal (ex.: 150,50 ou 150.50)
    private static float lerFloat(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                float valor = Float.parseFloat(teclado.nextLine().trim().replace(',', '.'));
                if (Float.isFinite(valor)) { // parseFloat também aceita "NaN" e "Infinity"
                    return valor;
                }
            } catch (NumberFormatException e) {
                // cai na mensagem abaixo
            }
            System.out.println("Entrada inválida. Digite um valor numérico.");
        }
    }
}
