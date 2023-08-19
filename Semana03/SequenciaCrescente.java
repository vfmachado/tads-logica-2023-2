import java.util.Scanner;

public class SequenciaCrescente {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        String resultado;

        // mostra os 3 valores ordenados 

        // juntar condicoes
        // 2 "e comercial" &&
        // as duas expressoes logicas precisam ser verdadeiras para que o resultado seja verdadeiro
        if (a < b && b < c) {
            resultado = " a b c ";
        } else if (a < c && c < b) {
            resultado = " a c b ";
        } else if (b < c && c < a) {
            resultado = " b c a ";
        } else if (b < a && a < c) {
            resultado = " b a c ";
        } else if (c < a && a < b) {
            resultado = " c a b ";
        } else if (c < b && b < a) {
            resultado = " c b a ";
        }

        System.out.println(resultado);

        // if (a < b) {
        //     if (a < c) {
        //         // a 
        //         if (b < c) {
        //             // b    c
        //         } else {
        //             // c    b
        //         }
        //     }
        // }

    }
}