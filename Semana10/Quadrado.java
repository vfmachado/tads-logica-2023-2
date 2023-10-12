public class Quadrado {
    public static void main(String[] args) {
        
        int n = 7;

        int coluna = 0;
        int linha = 0;

        while (linha < n) {

            coluna = 0;
            while (coluna < n) {
                if (linha == 0 || linha == n-1 || coluna == 0 || coluna == n-1 || linha == coluna || linha + coluna == n -1)
                    System.out.print(" * ");
                else {
                    System.out.print("   ");
                }
                coluna++;
            }
            System.out.println();

            linha++;
        }

    }
}
