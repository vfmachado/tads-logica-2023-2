import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final float PRECO_GASOLINA = 4.3f;
        final float PRECO_ALCOOL = 3.9f;

        float quantidade, total, desconto;
        char tipoCombustivel;

        System.out.println("Informe o tipo combustivel a/g e a quantidade desejada");
        tipoCombustivel = in.next().charAt(0);

        quantidade = in.nextFloat();

        if (tipoCombustivel == 'a') {
            if (quantidade <= 20) {
                desconto = 0.97f;
            } else {
                desconto = 0.95f;
            }
            total = PRECO_ALCOOL * quantidade * desconto;
            System.out.println("ALCOOL SELECIONADO. PRECO TOTAL " + total);
        } else if (tipoCombustivel == 'g') {
            if (quantidade <= 20) {
                desconto = 0.96f;
            } else {
                desconto = 0.94f;
            }
            total = PRECO_GASOLINA * quantidade * desconto;
            System.out.println("GASOLINA SELECIONADO. PRECO TOTAL " + total);
        } else {
            System.out.println("TIPO NAO IDENTIFICADO");
        }


    }
}