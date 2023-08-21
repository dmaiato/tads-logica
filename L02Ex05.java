import java.util.Scanner;

public class L02Ex05 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    float numerador = in.nextFloat();
    float denominador = in.nextFloat();

    if (denominador != 0) {
      float divisao = numerador/denominador;
      System.out.println(divisao);
    } else {
      System.out.println("Erro: Divisão por 0");
    }
  }
}
