import java.util.Scanner;

public class Antecessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, antecessor;

        System.out.println("Informe um numero que vou dizer o antecessor");
        numero = in.nextInt();

        // atribuicao           // avaliacao
        numero          =        numero -1;
        antecessor = numero -1;

        System.out.println("O Antecessor eh " + numero);

    }
}