import java.util.Scanner;

public class numero_mayor {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       System.out.println("ingrese el primer numero");
       int numero1 = sc.nextInt();
       System.out.println("ingrese el segundo numero");
       int numero2 = sc.nextInt();
       System.out.println("ingrese el tersero numero");
       int numero3 = sc.nextInt();

       if (numero1 > numero2 && numero1 > numero3) {
        System.out.println("el numero mayor es: " + numero1);
       } else if (numero2 > numero1 && numero2 > numero3) {
         System.out.println("el numero mayor es: " + numero2);
       } else 
         System.out.println("el numero mayor es: " + numero3);
       
       sc.close();
    }
}
