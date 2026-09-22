public class ejercicio6 {
    public static void main(String[] args) throws Exception {
      final int camisa = 25;
      final int pantalon = 35;

      double valorCamisa = camisa-(camisa*0.15);
      double valorpantalon = pantalon-(pantalon*0.15);
      double total = valorCamisa + valorpantalon;

      System.out.println("el precio total de las prendas es de:  "+ total);

      double valorCamisa2 = valorCamisa-(valorCamisa*0.05);
      double totalF = total + valorCamisa2;

     System.out.println("el total finla es de: " + totalF);
    }
}
