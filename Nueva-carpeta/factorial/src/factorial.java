import java.util.Scanner;

public class factorial {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       System.out.println("ingrese un numero");
       int numero = scanner.nextInt();
       int factorial = 1;
       int i = 1;

       while (i <= numero) {
        factorial *= i;
        i++;
       }
        System.out.println("resultado: " + factorial);
    }
}
