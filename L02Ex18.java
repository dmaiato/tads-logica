import java.util.Scanner;

public class L02Ex18 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int   soldCars    = in.nextInt();
    float totalValue  = in.nextFloat();
    float fixedSalary = in.nextFloat();
    float comission   = in.nextFloat();

    float totalAmount = totalValue*0.05f + fixedSalary + comission*soldCars;

    System.out.println(totalAmount);

  }
}
