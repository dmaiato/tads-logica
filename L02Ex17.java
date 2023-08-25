import java.util.Scanner;

public class L02Ex17 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    float factoryCost = in.nextFloat();
    
    float distribution = factoryCost*1.28f;
    float taxes = distribution*1.45f;

    System.out.printf("the final cost is $%.2f\n", taxes);


  }
}
