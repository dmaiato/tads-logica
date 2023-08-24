import java.util.Scanner;

public class L02Ex12 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    float valor;
    int quantidade = in.nextInt();

    if (quantidade >= 12)
      valor = 1.30f;
    else
      valor = 1.50f;

    float custoTotal = quantidade*valor;
    
    System.out.printf("o total é R$%.2f\n", custoTotal);

  }
}
