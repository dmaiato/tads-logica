import java.util.Scanner;

public class Prova_03v2 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    int menor, medio, maior;
    int saque, sobra;

    System.out.println("Informe quanto deseja sacar");

    menor = in.nextInt();
    medio = in.nextInt();
    maior = in.nextInt();
    saque = in.nextInt();

    int quantMaior = saque / maior;

    sobra = saque % maior;
    int quantMedio = sobra / medio;

    sobra = saque % medio;
    int quantMenor = sobra / medio;

    System.out.printf("%d notas de %d, %d notas de %d, e %d notas de %d", quantMaior, maior, quantMedio, medio, quantMenor, menor);
  }
}
