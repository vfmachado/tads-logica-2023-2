import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hVelho, hNovo, mVelha, mNova;
        int h1, h2, m1, m2;

        h1 = in.nextInt();
        h2 = in.nextInt();
        m1 = in.nextInt();
        m2 = in.nextInt();

        // deteccao do homem mais velho e mais novo
        if (h1 > h2) {
            hVelho = h1;
            hNovo = h2;
        } else {
            hVelho = h2;
            hNovo = h1;
        }

        // deteccao da mulher mais velha e mais nova
        if (m1 > m2) {
            mVelha = m1;
            mNova = m2;
        } else {
            mVelha = m2;
            mNova = m1;
        }

        int somatorio = hVelho + mNova;
        int produto = hNovo * mVelha;

        System.out.println("SOMATORIO " + somatorio);
        System.out.println("PRODUTO " + produto);
        System.out.println("HOMEM MAIS VELHO: " + hVelho);
    }
}