import java.util.Scanner;

public class VetorCombinado {
    public static void main(String[] args) {
        
        // DADO DOIS VETORES DE MESMO TAMANHO,
        // DIZER EM QUAIS POSICOES OS VALORES SÃO IGUAIS

        /*
         *  0  1  2  3  4      TAM = 5, POS DE 0 A 4
         * [1, 2, 3, 4, 5]
         * [5, 4, 3, 2, 1]
         * 
         * VALORES SÃO IGUAIS NAS POSICOES
         * 2
         * 
         */

        Scanner in = new Scanner(System.in);
        int tamanho;
        int [] v1, v2;

        System.out.println("Informe o tamanho");
        tamanho = in.nextInt();

        v1 = new int[tamanho];
        v2 = new int[tamanho];

        System.out.println("Informe os valores do primeiro vetor");
        for (int posicao = 0; posicao < tamanho; posicao++) {
            v1[posicao] = in.nextInt();
        }

        System.out.println("Informe os valores do segundo vetor");
        for (int posicao = 0; posicao < tamanho; posicao++) {
            v2[posicao] = in.nextInt();
        }

        System.out.println("OS VALORES SAO IGUAIS NAS POSICOES");
        for (int i = 0; i < tamanho; i++) {
            if (v1[i] == v2[i]) {
                System.out.println("POSICAO " + i);
            }
        }
    }
}
