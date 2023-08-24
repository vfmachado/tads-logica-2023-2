import java.util.Scanner;

public class Av01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final float AREA_CAIXA = 1.5f;
        float comprimento, altura, largura;
        float areaTotal, resto;    // cammel case => juntar as palavras colocando em capslock a primeira letra da proxima palavra
        int quantCaixas;

        // VARIAVEIS EM JAVA COMEÇAM COM LETRA MINUSCULA
        // int estouJuntandoVariasPalavras;

        System.out.println("Informe as dimensoes da cozinha (l c a)");
        largura = in.nextFloat();
        comprimento = in.nextFloat();
        altura = in.nextFloat();

        areaTotal = 2 * comprimento  * altura + 2 * largura * altura;
                                // fazer a divisao entre floats
                        // salvando em inteiro
        quantCaixas =  (int) (areaTotal / AREA_CAIXA);

        resto = areaTotal % AREA_CAIXA;
        if (resto != 0) {
            quantCaixas = quantCaixas + 1; // quantCaixas++;
        }

        System.out.println("Quantidade de caixas: " + quantCaixas);

    }
}