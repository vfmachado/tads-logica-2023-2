import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int valor = in.nextInt();

        int divisor = 2;

        while (valor != 1) {
            if (valor % divisor == 0) {
                System.out.println(divisor);
                valor = valor / divisor;
            } else {
                divisor++;
            }
        }

    }
}