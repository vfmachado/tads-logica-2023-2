import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int numerador, denominador;
        float soma = 0;

        numerador = 1;
        denominador = 1;

        for (int i = 0; i < n; i++) {

            // System.out.println(numerador  + " / " + denominador);

            soma = soma +  (float)(numerador)/denominador;
            // if (i % 2 == 0) {
            //     soma = soma + 1.0f/denominador;
            // } else {
            //     soma = soma - 1.0f/denominador;
            // }
            

            // System.out.println(soma);
            numerador = numerador * -1;
            // if (i % 2 == 0) {
            //     numerador = -1;
            // } else {
            //     numerador = 1;
            // }
            denominador = denominador + 2;

        }

        soma = soma * 4;
        System.out.println(soma);
    }
}