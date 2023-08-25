import java.util.Scanner;

public class L02Ex16 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    float wage = in.nextFloat();
    float loan = in.nextFloat();
    float installments = in.nextFloat();

    float calculation = (loan / installments);

    if (calculation > wage * 0.3f)
      System.out.println("loan cannot me conceived.");
    else
      System.out.println("loan can me conceived!");



  }
}
