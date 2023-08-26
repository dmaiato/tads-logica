import java.util.Scanner;

public class L02Ex20 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    final float GAS_PRICE = 4.599f;

    float km_init = in.nextFloat();
    float km_end = in.nextFloat();
    float usedLiters = in.nextFloat();
    float income = in.nextFloat();

    float distance = km_end - km_init;
    float avgConsumption = distance/usedLiters;
    float profit = income - usedLiters*GAS_PRICE;

    System.out.printf("the average consumption is %.2fKm/l, and the profit is R$%.2f", avgConsumption, profit);

  }
}