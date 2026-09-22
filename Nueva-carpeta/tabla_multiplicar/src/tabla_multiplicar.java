import java.util.Scanner;

public class tabla_multiplicar {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("ingrese un numero para ver su tabla");
    int num = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
        System.out.println(i + " x " + num + " = " + (i*num));
    }
    }
}
