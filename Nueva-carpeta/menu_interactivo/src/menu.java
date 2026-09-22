import java.util.Scanner;

public class menu {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        System.out.println("numero 1");
        int num1 = scanner.nextInt(); 
        System.out.println("numero 2");
        int num2 = scanner.nextInt();

        System.out.println("ingrese una opcion");
        System.out.println(" + ");
        System.out.println(" - ");
        System.out.println(" * ");
        System.out.println(" % ");
        char opcion = scanner.next().charAt(0);

        switch (opcion) {
            case '+':
                System.out.println("la suma es: " + (num1 + num2));
                break;
            case '-':
                System.out.println("la resta es: " + (num1 - num2));
                break;
            case '*':
                System.out.println("la multiplicasion es: " + (num1 * num2));
                break;
            case '%':
                if (num2 != 0) {
                    System.out.println("la division es: " + (num1 / num2));
                }else{
                    System.out.println("error no se divide entre 0");
                }
                break;
            default:
                System.out.println("opcion valida");
                break;
        }

       scanner.close();
    }
}
