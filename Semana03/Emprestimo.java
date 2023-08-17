import java.util.Scanner;
public class Emprestimo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // final -> constante em java 
        final float TX_MAXIMA_EMPRESTIMO = 0.3f;

        float salario, valorEmprestimo, valorParcela, maxParcela;
        int quantParcelas;

        System.out.println("Informe seu salario, o valor do emprestimo solicitado e a quantidade de parcelas que vc deseja:");
        salario = in.nextFloat();
        valorEmprestimo = in.nextFloat();
        quantParcelas = in.nextInt();

        maxParcela = salario * TX_MAXIMA_EMPRESTIMO;
        valorParcela = valorEmprestimo / quantParcelas;

        System.out.println("O VALOR MAXIMO DA SUA PARCELA PODE SER DE " + maxParcela);
        System.out.println("O VALOR DA PARCELA DESTE EMPRESTIMO " + valorParcela);

        if (valorParcela <= maxParcela) {
            System.out.println("EMPRESTIMO PODE SER CONCEDIDO");
        }

        if (valorParcela > maxParcela) {
            System.out.println("EMPRESTIMO NEGADO");
        }


    }
}