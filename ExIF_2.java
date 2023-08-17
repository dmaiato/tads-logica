import java.util.Scanner;

public class ExIF_2 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    float salario = in.nextFloat();
    float emprestimo = in.nextFloat();,
    float parcelas = in.nextFloat();

    float valorDeParcela = emprestimo / parcelas;

    if (salario * 0.3f < valorDeParcela) {
      System.out.println("nao pod");
    }
    else{
      System.out.println("pod :)");
    }

  }
}