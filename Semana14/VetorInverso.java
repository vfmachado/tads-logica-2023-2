import java.util.Scanner;

public class VetorInverso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int tamanho;
        int [] vetor;

        System.out.println("INFORME O TAMANHO DO VETOR");
        tamanho = in.nextInt();
        vetor = new int[tamanho];

        System.out.println("Informe os valores do vetor");
        for (int posicao = 0; posicao < tamanho; posicao++) {
            vetor[posicao] = in.nextInt();
        }

        // mostrando o vetor normal
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "  " );
        }
        System.out.println();

        // mostrando o vetor na ordem inversa
        for (int i = tamanho - 1; i >= 0  ; i--  ) {
            System.out.print(vetor[i] + "  ");
        }
        System.out.println();

        // criem um novo vetor inverso ao primeiro  [1, 2, 3] => [3, 2, 1]

        int [] v2 = new int[tamanho];

        // int crescendo = 0;
        // int diminuindo = tamanho - 1;
        // while (crescendo < tamanho) {
        //     v2[diminuindo] = vetor[crescendo];
        //     diminuindo--;
        //     crescendo++; 
        // }

        int aux = tamanho -1;
        for (int i = 0; i < vetor.length; i++) {
            v2[aux] = vetor[i];
            aux--;
        }

        // for (int i = 0; i < vetor.length; i++) {
        //     v2[tamanho -1 -i] = vetor[i];
        // }

        // SEMPRE SEPARAR A PARTE DE LOGICA DA PARTE DE MOSTRAR O VETOR
        System.out.println("VETOR INVERTIDO");
        for (int i = 0; i < v2.length; i++) {
            System.out.print(v2[i] + "  ");
        }
        System.out.println();
    }
}
