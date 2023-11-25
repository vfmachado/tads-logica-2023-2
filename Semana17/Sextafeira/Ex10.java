
public class Ex10 {
    public static void main(String[] args) {
        
        int [][] M = {
            {1, 1, 1, 1, 1, 1, 1, 1},
            {2, 2, 2, 2, 2, 2, 2, 2},
            {3, 3, 3, 3, 3, 3, 3, 3},
            {4, 4, 4, 4, 4, 4, 4, 4},
            {5, 5, 5, 5, 5, 5, 5, 5 },
            {6, 6, 6, 6, 6, 6, 6, 6},
            {7, 7, 7, 7, 7, 7, 7, 7},
            {8, 8, 8, 8, 8, 8, 8, 8}
        };

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }


        // inverter duas linhas da matriz
        // 2 <=> 6
        for (int j = 0; j < M.length; j++) {
            int aux = M[2][j];
            M[2][j] = M[6][j];
            M[6][j] = aux;
        }
        
        System.out.println("\n\n");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }

    }
}