import java.util.Scanner;  

public class Av04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
        int digito1, digito2, digito3, digito4, resto;
        int resultado;

        digito1 = numero / 1000;
        resto = numero % 1000;

        // System.out.println("DIGITO " + digito1);
        // System.out.println("REST " + resto);

        digito2 = resto / 100;
        resto = resto % 100;

        // System.out.println("DIGITO " + digito2);
        // System.out.println("REST " + resto);

        digito3 = resto / 10;
        digito4 = resto % 10;

        // System.out.println("DIGITO " + digito3);
        // System.out.println("REST " + resto);

        resultado = 1000 * digito4 + 100 * digito3 + 10 * digito2 + digito1;
        System.out.println("MEU NUMERO INVERTIDO UTILIZANDO OPERACOES MATEMATICAS " + resultado);
    }
}