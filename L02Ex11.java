import java.util.Scanner;

public class L02Ex11 {
  public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    float num1 = in.nextFloat();
    float num2 = in.nextFloat();

    float soma = num1+num2;

    if (soma > 20)
      soma = soma + 8;
    else
      soma = soma - 10;

    System.out.printf("o resultado é %.2f\n", soma);

  }
}
