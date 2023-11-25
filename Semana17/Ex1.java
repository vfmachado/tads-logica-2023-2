import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int [] vetor; 
        int [][] matriz;

        vetor = new int[5]; // tam 5, POS 0, 1, 2, 3, 4

        matriz = new int[4][3]; // 4 linhas e 3 colunas
                    /*
                     *  0,0     0,1     0,2
                     *  1,0     1,1     1,2
                     *  2,0     2,1     2,2
                     *  3,0     3,1     3,2
                     */

        int [][][] triM = new int[8][8][8];
        
        
        matriz[0][0] = 5;
        matriz[0][1] = 6;
        matriz[0][2] = 7;

        matriz[1] = new int[5];

        matriz[1][2] = 1;
        matriz[1][3] = 1;
        matriz[1][4] = 1;

        matriz[2][1] = 9;
        
        matriz[3][2] = 8;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "  ");
            }
            System.out.println();
        }
     
    }

}