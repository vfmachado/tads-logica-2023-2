import java.util.Scanner;

public class Ex01A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int homens, mulheres, criancas;
        float total;
        System.out.println("Quantos sao os homens, mulheres e criancas");
        homens = in.nextInt();
        mulheres = in.nextInt();
        criancas = in.nextInt();

        total = homens * 400 + mulheres * 320 + criancas * 200;
        total = total * 1.2f;

        System.out.println("O TOTAL DE CARNE NECESSARIO (g): " + total);

    }
}