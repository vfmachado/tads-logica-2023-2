import java.util.Scanner;

public class T {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float litros, valor = 0;
        char tipo;

        System.out.println("Informe o tipo de combustivel e a quantidade");
        tipo = in.next().charAt(0);
        litros = in.nextFloat();

        if (tipo == 'A') {
            if (litros <= 20) {
                valor = 4.9f * litros * 0.97f;
            } else {
                valor = 4.9f * litros * 0.95f;
            }
        } else if (tipo == 'G') {
            if (litros <= 20) {
                valor = 5.8f * litros * 0.96f;
            } else {
                valor = 5.8f * litros * 0.94f;
            }
        }
        System.out.println("VALOR A PAGAR " + valor);
    }
}