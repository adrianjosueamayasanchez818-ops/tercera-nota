import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el numero de estudiantes");
        int estudiantes = scanner.nextInt();

        double notas[] = new double[estudiantes];

        int longitud = notas.length;
        double suma = 0;
        for (int i = 0; i < longitud; i++) {
            System.out.println("ingrese las nota del estudiante: " + (i + 1));
            notas[i] = scanner.nextDouble();

            while (notas[i] > 5 || notas[i] < 0) {
                System.out.println("nota no valida");
                System.out.println("ingrese las nota del estudiante: " + (i + 1));
                notas[i] = scanner.nextDouble();
            }
            suma += notas[i];
        }

        int contador = 0;
        double promedio = suma / longitud;
        for (int i = 0; i < longitud; i++) {
            if (notas[i] > promedio) {
                contador++;
            }

        }
        System.out.println("el promedio da las notas es de: " + promedio);
        System.out.println("hay: " + contador + " estudiantes que superar el promedio");

        int contador2 = 0;
        for (int i = 0; i < longitud; i++) {
            if (notas[i] >= 3) {
                System.out.println("el estudiante " + (i + 1) + " aprovo");
                contador2 ++;
            } else {
                System.out.println("el estudiante " + (i + 1) + " reprovo");
            }
        }
        System.out.println(contador2 + " estudiantes aprobaron");
        System.out.println((estudiantes - contador2) + " estudiantes reprobaron");

        scanner.close();
    }
}
