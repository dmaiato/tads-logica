import java.util.Scanner;

public class L02Ex10 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    int idade = in.nextInt();
    String categoria;

    if (idade >= 18) 
      categoria = "adulto";
    else if (idade >= 14)
      categoria = "juvenil";
    else if (idade >= 9)
      categoria = "infantil";
    else
      categoria = "mirim";

    System.out.printf("sua categoria é %s\n", categoria);

  }
}
