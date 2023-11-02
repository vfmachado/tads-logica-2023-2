import java.util.Scanner;

public class Av09 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int numero = in.nextInt();


        for (int divisor = 1; divisor <= numero; divisor++) {

            if (numero % divisor == 0) {
                System.out.println("DIVISOR " + divisor);

                boolean ehPrimo = true;
                for (int divPrimo = 2; divPrimo < divisor; divPrimo++) {
                    if (divisor % divPrimo == 0) {
                        ehPrimo = false;
                    }
                }

                if (ehPrimo) {
                    System.out.println("\tPRIMO!!!");
                }
            }

        }

    }
}
