import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        double saldo = 100000;
        int opcion;

        do {
            System.out.println();
            System.out.println("--- CAJERO ---");
            System.out.println("1. ver saldo");
            System.out.println("2. retirar");
            System.out.println("3. depositar");
            System.out.println("4. salir");
            System.out.println("escoja una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("su saldo es: " + saldo);
                    break;

                case 2:
                    System.out.println("cuanto va a retirar ");
                    double retiro = sc.nextDouble();

                    if (retiro <= 0) {
                        System.out.println("el valor debe ser mayor a 0.");
                    } else if (retiro > saldo) {
                        System.out.println("dinero insufisiente");
                    } else {
                        saldo = saldo - retiro;
                        System.out.println("retiro exitoso");
                        System.out.println("su saldo es de: " + saldo);
                    }
                    break;

                case 3:
                    System.out.println("cuanto va a depositar ");
                    double deposito = sc.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("el deposito tiene que ser mayor a cero");
                    } else {
                        saldo = saldo + deposito;
                        System.out.println("deposito exitoso");
                        System.out.println("su nuevo saldo es de: " + saldo);
                    }
                    break;

                case 4:
                    System.out.println("salio del cajero");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
