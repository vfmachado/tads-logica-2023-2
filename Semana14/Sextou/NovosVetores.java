import java.util.Scanner;

public class NovosVetores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] v1, v2;

        v1 = new int [0];
        
        // DADO O VALOR N DO USUARIO, VAMOS ADICIONAR UM ELEMENTO DE CADA VEZ, NO VETOR 1
        // O TAMANHO DE V1 VAI AUMENTAR DE 1 EM UM

        while (true) {
            int opcao = in.nextInt();

            if (opcao == 0) break;

            // caso contratio, vou adicionar no vetor
            v2 = new int[v1.length + 1];

            // copiar todos os valores de v1
            for (int i = 0; i < v1.length; i++) {
                v2[i] = v1[i];
            }

            // mostrar o vetor 2
            System.out.println("V2");
            for (int i = 0; i < v2.length; i++) {
                System.out.print(v2[i] + "  ");
            }
            System.out.println();

            // salva na ultima posicao o valor digitado
            v2[v1.length] = opcao;

            // crio um novo v1, e copio de volta dos valores
            v1 = new int[v2.length];
            for (int i = 0; i < v2.length; i++) {
                v1[i] = v2[i];
            }

            // mostrar o vetor
            System.out.println("V1");
            for (int i = 0; i < v1.length; i++) {
                System.out.print(v1[i] + "  ");
            }
            System.out.println();
        }

        // mostrar o vetor
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + "  ");
        }
        System.out.println();

    }
}
