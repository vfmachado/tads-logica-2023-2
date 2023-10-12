import java.util.Scanner;

public class ExRepeticao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contador = 0;
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
        System.out.println("TERMINEI O PRIMEIRO LAÇO");

        int valor = 0;
        while (valor != -1) {
            System.out.println("Informe um valor: ");
            valor = in.nextInt();
        }
        System.out.println("TERMINEI O SEGUNDO LAÇO");


        while (true) {
            System.out.println("Informe um valor: ");
            valor = in.nextInt();

            if (valor == 100) {
                break;
            }
        }
        System.out.println("TERMINEI O TERCEIRO LAÇO");

    }
}
