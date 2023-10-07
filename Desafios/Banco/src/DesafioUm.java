import java.util.Scanner;

public class DesafioUm {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public DesafioUm(int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Saldo: " + saldo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta

        System.out.println("Informe o nome do titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.println("Informe o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        DesafioUm conta = new DesafioUm(numeroConta, nomeTitular, saldo);
        System.out.println("Informações da Conta Bancária:");
        conta.exibirInformacoes();

        scanner.close();
    }
}
