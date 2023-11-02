import java.util.Scanner;

public class Av06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int altura, quantCanos;
        int canoAtual, alturaProx, diferenca;

        altura = in.nextInt();
        quantCanos = in.nextInt();

        boolean morre = false;

        canoAtual = in.nextInt();
        for (int i = 0; i < quantCanos-1; i++) {
            alturaProx = in.nextInt();

            diferenca = alturaProx - canoAtual;
            if (diferenca < 0) {
                diferenca = diferenca * -1;
            }

            if (diferenca > altura) {
                morre = true;
            }
            canoAtual = alturaProx;
        }

        System.out.println(morre ? "MORREU" : "VIVEU");

    }
}