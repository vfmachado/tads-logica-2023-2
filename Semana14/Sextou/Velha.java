import java.util.Scanner;

public class Velha {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int [] tab = new int[9];
        int jogador = 1;

        boolean ganhou = false;

        while (true) {

            for (int i = 0; i < tab.length; i++) {
                if (tab[i] == 0)
                    System.out.print(" - ");
                else if (tab[i] == 1)
                    System.out.print(" O ");
                else {
                    System.out.print(" X ");
                }
                if ((i+1) % 3 == 0) {
                    System.out.println();
                }
            }

            if (ganhou) break;

            System.out.println("VEZ DO JOGADOR " + jogador);
            System.out.println("ONDE QUER JOGAR? ");
            int escolha = in.nextInt();

            tab[escolha] = jogador;

            // verificando as linhas

            // linha 1
            // if (tab[0] != 0 && tab[0] == tab[1] && tab[0] == tab[2]) {}
            // // linha 2
            // if (tab[3] != 0 && tab[3] == tab[4] && tab[3] == tab[5]) {}
            // // linha 3
            // if (tab[6] != 0 && tab[6] == tab[7] && tab[6] == tab[8]) {}
           
            for (int i = 0; i < 6; i = i+3) {
                if (tab[i] != 0 && tab[i] == tab[i+1] && tab[i] == tab[i+2]) {
                    System.out.println("GANHOU!");
                    ganhou = true;
                    break;
                }
            }

            // EXERCICIO - FAZER A VERIFICACAO DAS COLUNAS E DIAGONAIS
           

            if (jogador == 1) { 
                jogador = 2;
            } else {
                jogador = 1;
            }
        }

    }
}
