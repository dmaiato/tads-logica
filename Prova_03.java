import java.util.Scanner;

public class Prova_03 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    int nota1 = in.nextInt();
    int nota2 = in.nextInt();
    int nota3 = in.nextInt();

    int total1 = 0;
    int total2 = 0;
    int total3 = 0;

    int resto1 = 0;
    int resto2 = 0;
    int resto3 = 0;

    int saque = in.nextInt();

    if (saque >= nota3) {
      total3 = saque / nota3;
      resto3 = saque % nota3;
      if (resto3 / nota2 >= 1) {
        resto2 = resto3 % nota2;
        total2 = resto3 / nota2;
        if (resto2 / nota1 >= 1) {
          total1 = resto2 / nota1;
        }

      } else if (resto3 / nota1 >= 1) {
        total1 = resto3 / nota1;
      }
    }

    System.out.printf("%d notas de %d, %d notas de %d, e %d notas de %d\n", total1, nota1, total2, nota2, total3, nota3);

  }
}
