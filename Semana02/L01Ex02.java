import java.util.Scanner;

public class L01Ex02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float valor, resultado;
        
        final float porcentagem = 20.0f;

        System.out.println("Informe o valor inicial");
        valor = in.nextFloat();
        resultado = valor  + valor * porcentagem/100;

        // System.out.println("O Resultado do valor acrescido de 20% eh " + resultado);
        System.out.printf(" 20%% de %f = %.2f\n", valor, resultado);

    }
}