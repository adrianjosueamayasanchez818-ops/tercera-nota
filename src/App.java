import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("ingrese el primer numero entero");
    int num1 = scanner.nextInt();

    System.out.println("ingrese el segundo numero entero");
    int num2 = scanner.nextInt();

    int suma = num1 + num2;
    int resta = num1 - num2;
    int multiplicacio = num1 * num2;
    int divicion = num1 / num2;
    int modulo = num1 % num2;

    System.out.println("la suma de los dos numeros es: " + suma);
    System.out.println("la resta de los dos numeros es: " + resta);
    System.out.println("la multiplicacion de los dos numeros es: " + multiplicacio);
    System.out.println("la divicion de los dos numeros es: " + divicion);
    System.out.println("el modulo de los dos numeros es: " + modulo);
    }
}
