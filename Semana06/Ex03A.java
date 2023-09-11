import java.util.Scanner;

public class Ex03A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String t1, t2;
        int g1, g2;

        System.out.println("DIgite o nome e a quantidade de gols dos times");
        t1 = in.next();
        g1 = in.nextInt();

        t2 = in.next();
        g2 = in.nextInt();


        if (g1 > g2) {
            System.out.println(t1);
        } else if (g2 > g1) {
            System.out.println(t2);
        } else {
            System.out.println("EMPATE");
        }

    }
}