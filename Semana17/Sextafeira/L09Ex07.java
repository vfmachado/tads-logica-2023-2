public class L09Ex07 {
    public static void main(String[] args) {
        
        int [][] M = {
            {1, 1, 1, 1, 1 }, // 5
            {1, 1, 1, 1, 2 }, // 6
            {1, 1, 1, 1, 3 }, // 7
            {1, 1, 1, 1, 1 }, // 5
            {1, 1, 1, 1, 2 }  // 6
        };
        int x = 7;

        for (int i = 0; i < 5; i++) {

            int soma = 0;

            // verifica a soma da primeira linha
            for (int j = 0; j < M.length; j++) {
                soma = soma + M[i][j];
            }

            if (soma == x) {
                System.out.println("NA LINHA " + i + " tem a soma " + x);
            }
        }
    }
}
