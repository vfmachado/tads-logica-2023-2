public class L10Ex7 {
    public static void main(String[] args) {
        // ler uma matriz e GERAR a transposta

        int [][] M = {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };

        int linhas = 2;
        int colunas = 4;

        int [][] T = new int[colunas][linhas];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                T[j][i] = M[i][j];
            }
        }


        // MOSTRAR A TRANSPOSTA
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }

    }
}
