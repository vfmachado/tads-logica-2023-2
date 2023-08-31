import java.util.Scanner;

public class TriangulosB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;
        int hip, maior, lado1, lado2;
        System.out.println("informe os lados do triangulo");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        maior = 0;
        lado1 = 0;
        lado2 = 0;
        
        if (a > b && a > c) {
            maior = a;
            lado1 = b;
            lado2 = c;
        } else if (b > c && b > a) {
            maior = b;
            lado1 = c;
            lado2 = a;
        } else if (c > a && c > b) {
            maior = c;
            lado1 = b;
            lado2 = a;
        }

        // A PARTIR DE AGORA EU SEI QUAL O MAIOR LADO
        if (a == b && a == c) {
            System.out.println("EQUILATERO");
        }
        else if (maior < lado1 + lado2) {
            if (lado1 == lado2) {
                System.out.println("ISOSCELES");
            } else {
                System.out.println("ESCALENO");
            }

            hip = maior * maior;
            if (hip == lado1 * lado1 + lado2 * lado2 ) {
                System.out.println("RETANGULO");
            }
        } else {
            System.out.println("NAO EH TRIANGULO");
        }
        

    }   
}