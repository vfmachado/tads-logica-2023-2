import java.util.Scanner;

public class Ex02B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float automovel, valorFinal;
        automovel = in.nextFloat();

        valorFinal = automovel * (1 + 0.45f + 0.28f);
        // valorFinal = automovel * 1.45f * 1.28f;

        System.out.println("VALOR FINAL DO AUTOMOVEL " + valorFinal);
        

    }
}