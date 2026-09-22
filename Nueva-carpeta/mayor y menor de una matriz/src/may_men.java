import java.util.Scanner;

public class may_men {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int[][] matriz = new int[4][4];
    System.out.println("ingrese los numeros de la matriz");

    int filas = matriz.length;
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.println("fila " + (i + 1) + " colucna " + (j + 1));
        matriz[i][j] = scanner.nextInt();
      }
    }
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print("[" + matriz[i][j] + "] ");
      }
      System.out.println();
    }

    int menor = matriz[0][0];
    int mayor = matriz[0][0];
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] > mayor) {
         mayor = matriz[i][j];
        }
        if (matriz[i][j] < menor) {
         menor = matriz[i][j];
        }
      }
    }
    System.out.println("el mayor es: " + mayor);
    System.out.println("el menor es: " + menor);

    scanner.close();
  }
}
