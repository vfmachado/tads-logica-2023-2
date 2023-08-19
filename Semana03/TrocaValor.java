import java.util.Scanner;

public class TrocaValor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /*
        se (valor_boolean) {
            bloco de codigo que sera executado quando meu valor boolean for true
        } senao { // bloco opcional

        }

        if ( x >= 7 ) {
            // bloco 1
        }

        if (x >= 7) {
            // bloco 1
        } else {
            // bloco 2
        }  
        */

        int a, b, c;
        System.out.println("DIGITE O VALOR DE A e B");
        a = in.nextInt();
        b = in.nextInt();

        // SE O VALOR DE B FOR MENOR QUE DE A, VAMOS TROCAR OS VALORES
        /// DEPOIS MOSTRAR A E B RESPECTIVAMENTE.

        if (b < a) {
            // trocar a e b 
            c = b;
            b = a;
            a = c;
        } 

        System.out.println("A => " + a);
        System.out.println("B => " + b);

/*
        if (a > 5) {
            System.out.println("VALOR MAIOR QUE 5");
            if (a < 10) {
                
                System.out.println("MAIOR QUE 5 e VALOR MENOR QUE 10");
                System.out.println("Informe um valor B agora ");
                b = in.nextInt();

                if (b >  a) {
                    System.out.println("A < B");
                } else {
                    System.out.println("B < A");
                }

            }
        }
*/


        System.out.println("FIM DO PROGRAMA");
         

    }
}