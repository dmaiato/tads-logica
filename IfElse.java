import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
  
    int idade;
    idade = in.nextInt();

    String resultado;
    resultado = "";

    if (idade >= 0 && idade < 13) {
      resultado = "infantil";
    } else if (idade > 12 && idade < 18) {
      resultado = "adolescente";
    } else if (idade > 17 && idade < 41) {
      resultado = "adulto i";
    } else if (idade > 40 && idade < 65) {
      resultado = "adulto ii";
    } else if (idade > 64) {
      resultado = "experiente";
    }

    System.out.println(resultado);

  }
}