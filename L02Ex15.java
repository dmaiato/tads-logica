import java.util.Scanner;

public class L02Ex15 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    
    int start = in.nextInt();
    int end = in.nextInt();
    int playTime;

    if (end <= start)
      playTime = start + end;
    else
      playTime = end - start;

    System.out.printf("the chess game lasted %d hours.\n", playTime);
    
  }
}
