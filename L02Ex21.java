import java.util.Scanner;

public class L02Ex21 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    float tamanho = in.nextFloat(); // metros
    int voltas = in.nextInt();
    int abastecimentos = in.nextInt();
    float consumo = in.nextFloat()*1000; // Km/L

    float litrosNecessarios = ((tamanho/abastecimentos)*voltas) / consumo;

    System.out.println(litrosNecessarios + "litros");

  }
}
