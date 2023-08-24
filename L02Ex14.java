import java.util.Scanner;

public class L02Ex14 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int anoAtual = in.nextInt();
    int anoDeNascimento = in.nextInt();

    int razao = anoAtual - anoDeNascimento;

    if (razao >= 18)
      System.out.println("pode votar");
    else
      System.out.println("não pode votar");

  }
}
