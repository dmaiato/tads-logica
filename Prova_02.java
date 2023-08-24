import java.util.Scanner;

public class Prova_02 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int lados = in.nextInt();
    float medida = in.nextFloat();
    
    if (lados == 3) {
      System.out.printf("Triângulo, perímetro: %.2f", (medida * lados));

    } else if (lados == 4) {
      System.out.printf("Quadrado, área: %.2f", (medida * medida));

    } else if (lados == 5) {
      System.out.println("Pentágono");

    } else {
      System.out.println("Figura Desconhecida");
    }

  }
}
