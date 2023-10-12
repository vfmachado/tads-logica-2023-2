import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        
        int fatorial = 1;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // 5! = 1 * 2 * 3 * 4 * 5
        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }
        System.out.println("FAtorial " + fatorial);

    }
}
