import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        String nome;
        int quantidade;
        float preco;
        float desconto;
        float valorTotal, valorDesconto, valorPagar;

        System.out.println("Digite o nome, preco e quantidade do produto: ");
        Scanner in = new Scanner(System.in);

        nome = in.next();
        quantidade = in.nextInt();
        preco = in.nextFloat();

        if (quantidade <= 5) {
            desconto = 2;
        } else if (quantidade <= 10) {
            desconto = 3;
        } else {
            desconto = 5;
        }

        valorTotal = quantidade * preco;
        System.out.printf("VALOR TOTAL R$ %.2f\n", valorTotal);

        valorDesconto = desconto/100 * valorTotal;
        System.out.printf("VALOR DESCONTO R$ %.2f\n", valorDesconto);

        valorPagar = valorTotal - valorDesconto;
        System.out.printf("VALOR PAGAR R$ %.2f\n", valorPagar);

    }
}