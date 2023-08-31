import java.util.Scanner;

public class TriangulosC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;
        System.out.println("informe os lados do triangulo");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            // EH TRIANGULO
            if (a == b && a == c) {
                System.out.println("EQUILATERO");
            } else if (a == b || a == c || b == c) {
                System.out.println("ISOSCELES");
            } else {
                System.out.println("ESCALENO");
            }

            boolean retA = a * a == b * b + c * c;
            boolean retB = b * b == a * a + c * c;
            boolean retC = c * c == a * a + b * b;
            if (retA || retB || retC) {
                System.out.println("RETANGULO");
            }

        } else {
            System.out.println("NAO EH TRIANGULO");
        }

    }   
}