import java.util.Scanner;

public class Desenhando {
    public static void main(String[] args) {
        
        int n = 8;
        int posx = 2;
        int posy = 4;
        char movimento;
        Scanner in = new Scanner(System.in);
        /*
        
         * * * * 
         * * * * 
         * * * *
         * * * * 
        
         */

        while (true) {
            for (int linha = 0; linha < n; linha++) {
                for (int coluna = 0; coluna < n; coluna++) {
                    if (linha == posx && coluna == posy)
                        System.out.print(" X ");
                    else
                        System.out.print(" - ");
                }
                System.out.println();
            }

            movimento = in.next().charAt(0);
            if (movimento == 'w') {
                posx--;
            } else  if (movimento == 's') {
                posx++;
            } else if (movimento == 'a') {
                posy--;
            } else if (movimento == 'd') {
                posy++;
            }

            if (movimento == '0') break;

            System.out.print("\033[H\033[2J");  
            System.out.flush();  
        }
    }
}
