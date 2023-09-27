import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        
        // IDENTIFICAR SE UM NUMERO É PRIMO
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int divisor = 2;
        boolean ehPrimo = true;

        while (divisor < n/2) {
            System.out.println("Tentando dividir por " + divisor);
            
            if (n % divisor == 0) {
                System.out.println("JA SEI QUE NAO EH PRIMO");
                ehPrimo = false;
                break;
            }

            divisor++;
        }

        if (ehPrimo)
            System.out.println("O NUMERO EH PRIMO");
        else
            System.out.println("NAO EH PRIMO");
    }
}
