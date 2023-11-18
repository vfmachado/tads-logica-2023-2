import java.util.Scanner;

public class ExBidimensional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // vetor bidimensional = matriz
        int [][] M;

        M = new int[3][4];

        
        for (int linha  = 0; linha < M.length; linha++) {
            for (int coluna = 0; coluna < M[linha].length; coluna++) {
                System.out.print(M[linha][coluna] + "  ");
            }
            System.out.println();
        }

        System.out.println("\n\n");
        int linha = 0;
        while (linha < M.length) {
            int coluna = 0;
            while (coluna < M[linha].length) {
                System.out.print(M[linha][coluna] + "  ");
                coluna++;
            }
            System.out.println();
            linha++;
        }
    }
}