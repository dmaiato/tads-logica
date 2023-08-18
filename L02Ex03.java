import java.util.Scanner;

public class L02Ex03 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    float num = in.nextFloat();

    if (num >= 0) {
      System.out.println("positóivo");
      System.exit(0);
    }

    System.out.println("negatóivo");

  } 
}
