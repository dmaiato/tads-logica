import java.util.Scanner;

public class Churrasco {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    int homens = in.nextInt();
    int mulheres = in.nextInt();
    int criancas = in.nextInt();

    float total = homens*400 + mulheres*320 + criancas*200;
    total = total*1.2f;

    System.out.println(total);

  }
}