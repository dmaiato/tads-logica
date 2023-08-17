import java.util.Scanner;

public class ExIF_3 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    int x = in.nextInt();
    int y = in.nextInt();

    if (x < y) {
      int part = y - x;
      x = x + part + 1;
      System.out.println(x);

    }
    else {
      System.out.println(x);
    }
  } 
}