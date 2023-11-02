import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        
        // IMAGINE QUE VC PRECISA FAZER UMA LISTA COM 5 NOMES;
        
        // DECLARACAO
        int [] x;
       
        // INICIALIZACAO
        x = new int[5]; // 5 indica o tamanho do vetor
                        // as posições vão de 0 a 4

        // declaracao e inicializacao
        float [] notas = new float[10];

        // x[n] => x na posicao n
        int TAM = 5; // EH UMA OPCAO REAL
        x[0] = 5;
        // x[5] = 10;  // posicao nao existe    Exception
        // ArrayIndexOutOfBounds

        Scanner in = new Scanner(System.in);
        System.out.println("INFORMAR OS 5 valores do vetor X");
        //                  5
        for (int i = 0; i < x.length; i++) {
            System.out.print("valor pos " + i + ": ");
            x[i] = in.nextInt();
        }
       

        // cont++;
        // System.out.println("valor pos 1: ");
        // x[cont] = in.nextInt();
        // System.out.println("valor pos 2: ");
        // x[2] = in.nextInt();
        // System.out.println("valor pos 3: ");
        // x[3] = in.nextInt();
        // System.out.println("valor pos 4: ");
        // x[4] = in.nextInt();


        // System.out.println(x[0]);        
        // System.out.println(x[1]);
        // System.out.println(x[2]);
        // System.out.println(x[3]);
        // System.out.println(x[4]);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "  ");
        }
        System.out.println();
    }
}