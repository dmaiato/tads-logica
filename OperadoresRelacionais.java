import java.util.Scanner;

public class OperadoresRelacionais {
  public static void main(String[] args) {
   
    Scanner in = new Scanner(System.in);

    boolean result;
    int v1, v2;

    System.out.println
    ("\nInform two numbers");
    v1 = in.nextInt();
    v2 = in.nextInt();

    result = v1 > v2;

    // boolean logic_value = v1 > v2;
    // if (logic_value){}
    if (v1 > v2) {
      System.out.println("\nBababooey");
    }
    else {
      System.out.println("Oh hell no :(");
    }
  }
}