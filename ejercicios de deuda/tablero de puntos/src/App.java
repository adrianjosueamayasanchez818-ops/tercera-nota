import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numeros [][] = new int[3][3];

        int longitud = numeros.length;
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Numero [" + (i + 1) + "][" + (j + 1) + "]: ");
                numeros[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                System.out.print("[" + numeros[i][j] + "] ");
            }
            System.out.println();
        }

        int suma = 0;
        int pares = 0;
        int mayor = numeros[1][1];
        int menor = numeros[1][1];

        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                suma += numeros[i][j];
                if (numeros[i][j] % 2 == 0) {
                    pares++;
                }
                if (numeros[i][j] > mayor) {
                    mayor = numeros[i][j];
                }
                if (numeros[i][j] < menor) {
                    menor = numeros[i][j];
                }
            }
        }
        System.out.println("la suma de todos los puntos es de: " + suma);
        System.out.println("la cantidad de numeros pares es de: " + pares);
        System.out.println("el numero mayor es: " + mayor);
        System.out.println("el numero menor es: " + menor);

        scanner.close();
    }
}
