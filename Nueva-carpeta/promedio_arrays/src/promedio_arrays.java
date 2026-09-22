import java.util.Scanner;

public class promedio_arrays {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      System.out.println("ingrese 5 numeros");

      int [] arrays = new int[5];
      arrays [0] = scanner.nextInt();
      arrays [1] = scanner.nextInt();
      arrays [2] = scanner.nextInt();
      arrays [3] = scanner.nextInt();
      arrays [4] = scanner.nextInt();

      double suma = 0;
      int longitud = arrays.length;
      for (int i = 0; i < longitud;) {
        suma += arrays[i];
        i++;
      }
      double promedio = suma / longitud;
      System.out.println("el promedio es: " + promedio);
      scanner.close();
    }
}
