import java.util.Scanner;

public class Ex2 {
   public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int [][] matriz;

        int linhas = in.nextInt();
        int colunas = in.nextInt();

        matriz = new int[linhas][colunas];
 
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "  ");
            }
            System.out.println();
        }
   } 
}
