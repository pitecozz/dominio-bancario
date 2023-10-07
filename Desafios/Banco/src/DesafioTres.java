
import java.util.Scanner;

public class DesafioTres {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        // Implementa a condição necessária para verificar se o cofre é seguro
        if (tipoCofre.equalsIgnoreCase("digital")) {
            System.out.println();
            int senha = scanner.nextInt();

            CofreDigital cofreDigital = new CofreDigital(senha);

        //    System.out.println("Informações do Cofre Digital:");
        //    cofreDigital.imprimirInformacoes();

            System.out.println();
            int confirmacaoSenha = scanner.nextInt();

            if (cofreDigital.validarSenha(confirmacaoSenha)) {
                System.out.println("Tipo: " + cofreDigital.tipo);
                System.out.println("Metodo de abertura: " + cofreDigital.metodoAbertura);
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Tipo: " + cofreDigital.tipo);
                System.out.println("Metodo de abertura: " + cofreDigital.metodoAbertura);
                System.out.println("Senha incorreta!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico cofreFisico = new CofreFisico();
                System.out.println("Tipo: " + cofreFisico.tipo);
                System.out.println("Metodo de abertura: " + cofreFisico.metodoAbertura);
            
        } else {
            System.out.println("Tipo de cofre inválido.");
        }

        scanner.close();
    }
}

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Método de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

}

