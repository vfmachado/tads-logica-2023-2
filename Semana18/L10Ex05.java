/*

LISTA 10 - EX 5

MATRIZ DE L x C
          3 x 4

    0   0   0   0
    0   0   0   0  
    0   0   0   0


*/

import java.util.Scanner;

public class L10Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int linhas = in.nextInt();
        int colunas = in.nextInt();
        int [][] M;
        int [] maiores;

        M = new int[linhas][colunas];
        maiores = new int[linhas];

        System.out.println("Informe os valores da matriz");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                M[i][j] = in.nextInt();
            }
        }

        System.out.println("\nMATRIZ:");
       
        for (int i = 0; i < linhas; i++) {
            int maior = M[i][0];

            for (int j = 0; j < colunas; j++) {
                System.out.print(M[i][j] + "  ");
                if (M[i][j] > maior) {
                    maior = M[i][j];
                }
            }
            maiores[i] = maior;
            System.out.println("   =>  " + maior);
        }

        System.out.println("MAIORES VALORES NO VETOR:");
        for (int i = 0; i < maiores.length; i++) {
            System.out.println("NA LINHA " + i + " o maior valor foi " + maiores[i]);
        }
    }
}