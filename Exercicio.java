import java.util.Scanner;

import javax.tools.FileObject;

public class Exercicio {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int opcao = -1;
    int [] v = new int[10];

    while (true) {

      System.out.print("\nescolha uma opcao: \n" +
      "0. Sair\n" +
      "1. Mostrar o vetor \n" +
      "2. Inserir um valor em uma posicao\n" +
      "3. Maior valor e sua posicao\n" +
      "4. Menor valor e sua posicao\n" +
      "5. Media dos valores diferentes de 0\n" +
      "6. Quantidade de pares e impares\n" +
      "7. Trocar valores entre duas posicoes\n" +
      "8. identificar quantas sequencias tem no vetor\n" +
      "9. ordenar o vetor\n" +
      "10. criar um vetor com tamanho diferente copiando o vetor anterior\n" +
      "opcao: ");

      opcao = in.nextInt();
      if (opcao == 0) break;
      switch (opcao) {
        case 1:
          for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
          }
          System.out.println();
          break;

        case 2:
          int valor = in.nextInt();
          int posicao = in.nextInt();

          if (posicao >= 0 && posicao < v.length) {
            v[posicao] = valor;
          } else {
            System.out.println("range invalido");
          }
          
          break;
          
        case 3:
          int maior = 0;
          
          for (int i = 0; i < v.length; i++) {
            if (v[i] > v[maior]) {
              maior = i;
            }
          }
          System.out.printf("maior: %d, pos: %d\n", v[maior], maior);
          break;
          
        case 4:
          int menor = 0;
          for (int i = 0; i < v.length; i++) {
            if (v[i] < v[menor]) {
              menor = i;
            }
          }
          System.out.printf("menor: %d, pos: %d\n", v[menor], menor);
          break;
          
        case 5:
          float media = 0;
          int div = 0;
          
          for (int i = 0; i < v.length; i++) {
            if (v[i] != 0) {
              media += v[i];
              div += 1;
            }
          }
          media = media / div;
          System.out.println("media: " + media);
          break;
          
        case 6:
          int quantPar = 0;
          int quantImpar = 0;

          for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) quantPar += 1;
            else quantImpar += 1;
          }
          System.out.printf("pares: %d, impares: %d", quantPar, quantImpar);
          break;

        case 7:
          int pos1 = in.nextInt();
          int pos2 = in.nextInt();
          
          
          int valor1 = v[pos1];
          int valor2 = v[pos2];
          
          v[pos1] = valor2;
          v[pos2] = valor1;
          break;
        
        case 8:
          int sequencias = 0;
          boolean ehsequencia = false;

          for (int i = 1; i < v.length; i++) {
            if (v[i] - v[i-1] == 1 && ehsequencia == false) {
              sequencias += 1;
              ehsequencia = true;
            } else if (v[i] - v[i-1] != 1 && ehsequencia == true) {
              ehsequencia = false;
            }
          }
          System.out.println("sequencias: " + sequencias);
          break;
        
        case 9:
          for (int i = 0; i < v.length; i++) {
            for (int j = i+1; j < v.length; j++) {
              if (v[j] < v[i]) {
                int bufferzinho = v[j];
                v[j] = v[i];
                v[i] = bufferzinho;
              }
            }
          }
          break;
        
        case 10:
          int num = in.nextInt();
          int[] novoVetor = new int[num];

          int contador = 0;
          for (int i = 0; i < novoVetor.length; i++) {
            if (i % (v.length - 1) == 0) {
              contador = 0;
            }
            novoVetor[i] = v[contador];
            contador++;
          }

          for (int i = 0; i < novoVetor.length; i++) {
            System.out.print(novoVetor[i] + " ");
          }
          System.out.println();
          break;

        default:
          System.out.println("opcao invalida");
          break;
        }
    }
  }
}
