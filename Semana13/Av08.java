import java.util.Scanner;

public class Av08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int linhas = in.nextInt();

        for (int i = linhas; i > 0; i--) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
