import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int inicio, fim, divisor;
        int soma = 0;

        inicio = in.nextInt();
        fim = in.nextInt();

        divisor = in.nextInt();

        for (int v = inicio; v <= fim; v++) {
            if (v % divisor == 0) {
                soma = soma + v;
            }
        }

        // soma = 0;
        // while ( inicio <= fim ){
        //     if (inicio % divisor == 0) {
        //         soma = soma +inicio;
        //     }
        //     inicio++;
        // }

        System.out.println(soma);

    }
}