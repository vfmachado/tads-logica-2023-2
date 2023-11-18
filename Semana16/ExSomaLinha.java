public class ExSomaLinha {
    public static void main(String[] args) {
        
        int [][] M = {
            {1, 2, 3, 4, 5},    // 15
            {1, 2, 3, 4, 6},    // 16
            {1, 2, 3, 4, 7}     // 17
        };

        for (int linha  = 0; linha < M.length; linha++) {
            for (int coluna = 0; coluna < M[linha].length; coluna++) {
                System.out.print(M[linha][coluna] + "  ");
            }
            System.out.println();
        }

        // CALCULAR A SOMA DE CADA UMA DAS LINHAS

        for (int i = 0; i < M.length; i++) {
        
            int soma = 0;
            for (int coluna = 0; coluna < M[i].length; coluna++) {
                soma = soma + M[i][coluna];
            }
            System.out.println("SOMA " + soma);
        
        }
    }
}
