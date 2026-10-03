 import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[][] goles = new int[4][3];

        int longitud = goles.length;
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < goles[i].length; j++) {
                System.out.println("equipo: " + (j+1)  + " ingresde el numero de goles: "+ (i+1));
                goles[i][j] = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < goles[i].length; j++) {
                System.out.print("equipo: " + (i+1) + "[" + goles[i][j] + "] ");
            }
            System.out.println();
        }

        int mayorTotal = 0;
        int equipoMayor = 1;
        int sinGoles = 0;

        System.out.println();
        for (int i = 0; i < longitud; i++) {
            int total = 0;

            for (int j = 0; j < goles[i].length; j++) {
                total = total + goles[i][j];

                if (goles[i][j] == 0) {
                    sinGoles++;
                }
            }

            System.out.println("Equipo " + (i + 1) + ": " + total + " goles");

            if (total > mayorTotal) {
                mayorTotal = total;
                equipoMayor = i + 1;
            }
        }

        System.out.println("El equipo con mas goles es el " + equipoMayor);
        System.out.println("Partidos sin goles: " + sinGoles);

        scanner.close();
    }
}
