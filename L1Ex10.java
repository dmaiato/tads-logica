import java.util.Scanner;

public class L1Ex10 {
  public static void main(String[] args) {
      
  Scanner in = new Scanner(System.in);
  
  float ingresso = in.nextFloat();
  int socios = in.nextInt();
  int menores = in.nextInt();
  int pagantes = in.nextInt();

  int publico = socios + menores + pagantes;

  float renda = (float) (socios*ingresso*0.7 + pagantes*ingresso);

  float perda = (float) (menores*ingresso + socios*ingresso*0.3);

  System.out.println("Renda total: " + renda);
  System.out.println("Perda total: " + perda);

  }
}