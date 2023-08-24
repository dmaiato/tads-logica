import java.util.Scanner;

public class L02Ex08 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    int votosTotais = in.nextInt();
    int brancos     = in.nextInt();
    int nulos       = in.nextInt();
    int validos     = in.nextInt();

    float percentualBrancos = brancos*100/votosTotais;
    float percentualNulos   = brancos*100/votosTotais;
    float percentualValidos = brancos*100/votosTotais;


    System.out.printf("brancos = %.1f%% // nulos = %.1f%% // validos = %.1f%%\n", percentualBrancos, percentualNulos, percentualValidos);
  }
}

