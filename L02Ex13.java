import java.util.Scanner;

public class L02Ex13 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    float nota1 = in.nextFloat();
    float nota2 = in.nextFloat();

    float media = (nota1+nota2)/2;

    if (media >= 6)
      System.out.printf("aluno aprovado com média %.1f\n", media);
    else
      System.out.printf("aluno reprovado com média %.1f\n", media);

  }
}
