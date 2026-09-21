public class ejercicio {
    public static void main(String[] args) throws Exception {
        int pares = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                pares ++;
                System.out.println(i);
            }

        }
        System.out.println("numeros pares: " + pares);
    }
}
