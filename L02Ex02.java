import java.util.Scanner;

public class L02Ex02 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    float base =  in.nextFloat(); 
    float altura = in.nextFloat();

    float area = base*altura;
    float perimetro = 2*(base + altura);

    System.out.println(area);
    System.out.println(perimetro);

  }
}
