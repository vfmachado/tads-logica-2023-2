import java.util.Scanner;

public class ExLinhasDiff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // vetor bidimensional = matriz
        int [][] M;
        M = new int[5][];
        
        for (int i = 0; i < M.length; i++) {
            System.out.println("Informe a quantidade de colunas da linha " + i);
            int colunas = in.nextInt();
            M[i] = new int[colunas];
        }


        for (int linha  = 0; linha < M.length; linha++) {
            for (int coluna = 0; coluna < M[linha].length; coluna++) {
                System.out.print(M[linha][coluna] + "  ");
            }
            System.out.println();
        }

    }
}