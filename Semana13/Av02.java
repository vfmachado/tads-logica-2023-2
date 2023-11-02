import java.util.Scanner;

public class Av02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantAbas, quantAcoes;
        String acao;

        quantAbas = in.nextInt();
        quantAcoes = in.nextInt();

        while (quantAcoes > 0) {
            quantAcoes--;
            acao = in.next();

            if (acao.equals("fechou")) {
                quantAbas++;
            } else {
                quantAbas--;
            }
        }

        System.out.println("QUANTIDADE DE ABAS " + quantAbas);
        // for (int i = 0; i < quantAcoes; i++) { }
    }
}