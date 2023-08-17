import java.util.Scanner;

public class ExIF {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    float grade1 = in.nextFloat();
    float grade2 = in.nextFloat();

    float avg = (grade1 + grade2) / 2;

    if (avg >= 7) {
      System.out.println("yay, you passed with an average of " + avg);
    }
    else {
      System.out.println("you f'd up :(");
    }
  }
}
