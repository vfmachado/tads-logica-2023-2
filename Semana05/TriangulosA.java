import java.util.Scanner;

public class TriangulosA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c, hip;
        System.out.println("informe os lados do triangulo");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a == b && a == c) {
            System.out.println("EQUILATERO");
        }

        if (a > b && a > c) {
            if (a < b + c) {
                if (b == c) {
                    System.out.println("ISOSCELES");
                } else {
                    System.out.println("ESCALENO");
                }

                hip = a * a;
                if (hip == b * b + c * c ) {
                    System.out.println("RETANGULO");
                }
            } else {
                System.out.println("NAO EH TRIANGULO");
            }
        }

        // copiar e colar indicando que o b ou o c podem ser maiories;

        

    }   
}