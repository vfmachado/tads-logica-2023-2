import java.util.Scanner;

public class T {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float n1, n2, opt, media;
        System.out.println("Informe as notas das avs");
        n1 = in.nextFloat();
        n2 = in.nextFloat();

        System.out.println("Informe a nota da opt, -1 para desconsiderar");
        opt = in.nextFloat();
        
        if (opt != -1) {
            if (n1 > n2) {
                media = (opt + n1)/2;
            } else {
                media = (opt + n2)/2;
            }
        } else {
            media = (n1 + n2)/2;
        }

        if (media >= 6) {
            System.out.println("APROV");
        } else if (media < 3) {
            System.out.println("REP");
        } else {
            System.out.println("EXAM");
        }

    }
}