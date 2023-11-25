public class MatrizPos {
   public static void main(String[] args) {
    
        int [][] m = new int[8][8];

        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m[linha].length; coluna++) {
                if (linha == 0 || linha == 7 || coluna == 0 || coluna == 7)
                    System.out.print(linha + "," + coluna + "  ");
                else if (linha == coluna) {
                    System.out.print("  X  ");
                }
                else
                    System.out.print("     ");
            }
            System.out.println();
        }

   } 
}
