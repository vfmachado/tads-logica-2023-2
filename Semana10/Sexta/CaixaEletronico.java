import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int valor;
        int n100, n50, n10, n5, n1;

        while (true) {
            System.out.println("Informe o valor");
            valor = in.nextInt();
            if (valor == 0)
                break;

            n100 = 0;
            n50 = 0;
            n10 = 0;
            n5 = 0;
            n1 = 0;

            n100 = valor / 100;
            int resto = valor % 100;

            n50 = resto / 50;
            resto = resto % 50;

            n10 = resto / 10;
            resto = resto % 10;

            n5 = resto / 5;
            resto = resto % 5;

            n1 = resto;

            if (n100 > 0) {
                System.out.println(n100 + " NOTAS de 100");
            }
            if (n50 > 0) {
                System.out.println(n50 + " NOTAS de 50");
            }
            if (n10 > 0) {
                System.out.println(n10 + " NOTAS de 10");
            }
            if (n5 > 0) {
                System.out.println(n5 + " NOTAS de 5");
            }
            if (n1 > 0) {
                System.out.println(n1 + " NOTAS de 1");
            }

        }
    }
}