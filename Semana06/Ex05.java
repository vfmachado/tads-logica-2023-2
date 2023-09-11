import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ac1, ac2;
        String an1, an2;

        int bc1, bc2;
        String bn1, bn2;

        int pa, pb;

        System.out.println("Informe o numero da carta e o naipe");
        ac1 = in.nextInt();
        an1 = in.next();
        ac2 = in.nextInt();
        an2 = in.next();

        bc1 = in.nextInt();
        bn1 = in.next();
        bc2 = in.nextInt();
        bn2 = in.next();

        if (ac1 == ac2) {
            pa = ac1 * ac2;
        }
        // sequencias
        else if (ac1 - ac2 == -1 || ac1 - ac2 == 1) {
            if (an1 == an2) {
                pa = ac1 * ac2;
            } else {
                pa = ac1 + ac2;
            }
        } else {
            if (an1 == an2) {
                if (ac1 > ac2) {
                    pa = ac1;
                } else {
                    pa = ac2;
                }
            } else {
                if (ac1 > ac2) {
                    pa = ac1 - ac2;
                } else {
                    pa = ac2 - ac1;
                }
            }
        }


        // REPETIR PARA JOGADOR B;

        // COMPARAR OS VALORES;
    }
}