

import java.util.Scanner;

public class DesafioCinco {
    
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String entrada = scanner.nextLine();

    // Cria uma instância de Transacao com as informações fornecidas na entrada:
    Transacao transacao = new Transacao(entrada);

    // Imprime as informações da transação:
    transacao.imprimir();
  }
}

class Transacao {
  private String data;
  private String hora;
  private String descricao;
  private double valor;

  public Transacao(String entrada) {
    String[] partes = entrada.split(",");
    this.data = partes[0];
    this.hora = partes[1];
    this.descricao = partes[2];
    this.valor = Double.parseDouble(partes[3]);
  }
  
  public void imprimir() {
    System.out.println(this.descricao);
    System.out.println(this.data);
    System.out.println(this.hora);
    System.out.printf("%.2f", this.valor);
  }
}
