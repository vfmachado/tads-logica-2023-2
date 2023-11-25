public class Matriz {
    
    public static void main(String[] args) {
        
        int [][] a = {
            {1, 1, 1, 1, 1},
            {2, 2, 2, 2, 2},
            {3, 3, 3, 3, 3},
            {4, 4, 4, 4, 4},
            {5, 5, 5, 5, 5}
        };

        // trocar as linhas 0 e 2
        for (int col = 0; col < a.length; col++) {
            int troca = a[0][col];
            a[0][col] = a[2][col];
            a[2][col] = troca;
        }
       


        
        for (int linha = 0; linha < a.length; linha++) {
            for (int coluna = 0; coluna < a[linha].length; coluna++) {
                System.out.print(a[linha][coluna] + "  ");
            }
            System.out.println();
        }
    }

}
