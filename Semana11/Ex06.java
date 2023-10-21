import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int invertida = 0;
        int digito;

        /*
        1234
        n 123
        in 4

        n 12  3     n % 10   
        in 43   = 4 * 10 + novonumero
         */

        while ( n  > 0) {
            digito = n % 10;
            System.out.println(digito);
            n = n/10;

            invertida = invertida * 10 + digito;
        }

        System.out.println(invertida);
    }
}