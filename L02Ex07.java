import java.util.Scanner;

public class L02Ex07 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    float salario = in.nextFloat();
    float horas = in.nextFloat();

    float salarioMensal = salario*8*30;
    float salarioAtual = salario*horas;

    System.out.println("Seu salario mensal é: " + salarioMensal);
    System.out.println("Seu salario atual é: " + salarioAtual);

  }
}
