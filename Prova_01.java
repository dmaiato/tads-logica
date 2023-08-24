import java.util.Scanner;

public class Prova_01 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    final float caixa = 1.5f;

    float largura = in.nextFloat();
    float comprimento = in.nextFloat();
    float altura = in.nextFloat();

    float areaTotal = 2*largura*altura + 2*comprimento*altura;

    float resto = (areaTotal) % caixa;
    int total = (int)((areaTotal) / caixa);

    if (resto > 0) {
      total = total++;
    }

    System.out.println(total);
  
  }
}
