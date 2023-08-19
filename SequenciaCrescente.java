import java.util.Scanner;

public class SequenciaCrescente {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    int a, b, c;
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();

    String resultado;

    if (a < b && b < c) {
      resultado = "abc";
    } else if (a < c && c < b) {
      resultado = "acb"; // acb
    } else if (b < a && a < c) {
      resultado = "bac"; // bac
    } else if (b < c && c < a) {
      resultado = "bca"; // bca
    } else if (c < a && a < b) {
      resultado = "cab"; // cab
    } else {
      resultado = "cba";
    }

    System.out.println(resultado);

  }
}
