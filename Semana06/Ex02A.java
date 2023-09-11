import java.util.Scanner;

public class Ex02A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float salario, prestacao, emprestimo;
        int quantidadeParcelas;

        System.out.println("Informa o valor do emprestimo, em quantas vezes e seu salario");
        emprestimo = in.nextFloat();
        quantidadeParcelas = in.nextInt();
        salario = in.nextFloat();

        prestacao = emprestimo / quantidadeParcelas;

        if (prestacao <= salario * 0.3f) {
            System.out.println("EMPRESTIMO CONCEDIDO");
        } else {
            System.out.println("VALOR NAO PODE SER EMPRESTADO");
        }
    }
}