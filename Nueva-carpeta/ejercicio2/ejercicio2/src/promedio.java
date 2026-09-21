import java.util.Scanner;

public class promedio {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numeros [] = new int[5];
        int suma = 0;
         System.out.println("ingrese 5 numeros enteros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numero " + (i+1));
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        double promedio = suma / numeros.length;

        System.out.println("el promedio de los numeros es : " + promedio);
    }
}
