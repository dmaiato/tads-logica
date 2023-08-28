import java.util.Scanner;

public class L02Ex23 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    int quantidadeAtual = in.nextInt();
    int max = in.nextInt();
    int min = in.nextInt();

    int media = (max + min)/2;

    if (quantidadeAtual >= media)
      System.out.println("não comprar");
    else
      System.out.println("comprar");

  }
}