import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valorInicial;
        int outroValor;

        valorInicial = in.nextInt();

        while (true) {
            outroValor = in.nextInt();
            if (outroValor == 0) break;

            if (valorInicial % outroValor == 0) {
                System.out.println(outroValor + " eh divisor de " + valorInicial);
            } else if (outroValor % valorInicial == 0) {
                System.out.println(outroValor + " eh multiplo de " + valorInicial);
            } else {
                System.out.println("Nao tem relacao");
            }

            valorInicial = outroValor;
        }
    }
}