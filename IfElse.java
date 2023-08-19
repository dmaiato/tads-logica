import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
  
    int idade;
    idade = in.nextInt();

    String resultado;
    resultado = "";

    if (idade <= 12) {
      resultado = "infantil";
    } else if (idade <= 17) {
      resultado = "adolescente";
    } else if (idade <= 40) {
      resultado = "adulto i";
    } else if (idade <= 64) {
      resultado = "adulto ii";
    } else {
      resultado = "experiente";
    }

    System.out.println(resultado);

  }
}
