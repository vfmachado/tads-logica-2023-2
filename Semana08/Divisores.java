import java.util.Scanner;
public class Divisores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero = in.nextInt();
        int divisor = 1, quantDivisores = 0;

        // quem sao os divisores de numero?
        while (divisor <= numero) {
            if (numero % divisor == 0) {
                System.out.println("DIVISOR " + divisor);
                quantDivisores++;
            }
            divisor++;
        }

        if (quantDivisores == 2) {
            System.out.println("NUMERO PRIMO!");
        }

    }
}