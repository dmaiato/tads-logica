import java.util.Scanner;

public class L02Ex22 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    float saldo = in.nextFloat();
    float debito = in.nextFloat();
    float credito = in.nextFloat();

    float saldoAtual = saldo - debito + credito;

    if (saldoAtual >= 0) 
      System.out.println("Saldo positivo");
    else
     System.out.println("Saldo negativo");

  }
}
