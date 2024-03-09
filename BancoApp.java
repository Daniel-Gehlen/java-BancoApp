import java.util.Scanner;

// Classe para dados pessoais e operações bancárias
class ContaBancaria {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo;

    // Construtor
    public ContaBancaria(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }

    // Método para consulta de saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Método para realizar depósito
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    // Método para realizar saque
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

// Classe principal
public class BancoApp {
    // Método para exibição do menu
    public static void exibirMenu() {
        System.out.println("\n==== MENU ====");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Realizar depósito");
        System.out.println("3 - Realizar saque");
        System.out.println("4 - Encerrar");
        System.out.print("Escolha uma opção: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar dados pessoais do usuário
        System.out.println("Informe seus dados pessoais:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        // Criar conta bancária com os dados informados
        ContaBancaria conta = new ContaBancaria(nome, sobrenome, cpf);

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            double valor;
            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$" + conta.consultarSaldo());
                    break;
                case 2:
                    System.out.print("Informe o valor do depósito: ");
                    valor = scanner.nextDouble();
                    conta.depositar(valor);
                    break;
                case 3:
                    System.out.print("Informe o valor do saque: ");
                    valor = scanner.nextDouble();
                    conta.sacar(valor);
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        System.out.println("Obrigado por utilizar nosso serviço!");
        scanner.close();
    }
}
