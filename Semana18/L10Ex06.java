/*

    G = [ 1, 2, 3, 2, 3  ]

    M =
    {
        {1, 0, 0},      1
        {0, 1, 1},      1
        {1, 1, 1},      1
        {1, 1, 0},      1
        {0, 1, 0}       0
    }
s
 */
public class L10Ex06 {
    public static void main(String[] args) {

        int[] G = { 1, 2, 3, 2, 3 };
        int[][] M = {
            { 1, 0, 0 },
            { 0, 1, 1 },
            { 1, 1, 1 },
            { 1, 1, 0 },
            { 0, 1, 0 }
        };  
        // quantidade na linhas na matriz é igual ao tamanho do vetor
        // temos APENAS 3 colunas

        int totalPts = 0;
        int tripla = 0;
        int dupla = 0;
        int simples = 0;

        int [] apostas = { 0, 0, 0 };

        for (int i = 0; i < G.length; i++) {
            
            int [] resposta = M[i]; // recebe cada uma das linhas da matriz

            // agora vamos comparar G[i] (gabarito da rodada) com um vetor do usuario (resposta);

            int gabarito = G[i] -1;
            if (resposta[gabarito] == 1) {
                System.out.println("ACERTOU A RODADA");
                totalPts++;
            } else {
                System.out.println("SEM SORTE");
            }

            // if (G[i] == 1 && resposta[0] == 1) {
            // } else if (G[i] == 2 && resposta[1] == 1) {
            // } else if (G[i] == 3 && resposta[2] == 1) {
            // }

            // if (resposta[0] == 1 && resposta[1] == 1 && resposta[2] == 1) {
            //     // aposta tripla
            //     tripla++;
            // } else if (
            //     (resposta[0] == 1 && resposta[1] == 1) ||
            //     (resposta[0] == 1 && resposta[2] == 1) ||
            //     (resposta[1] == 1 && resposta[2] == 1) ) {
                
            //         // aposta dupla
            //         dupla++;
            // } else {
            //     // aposta simples
            //     simples++;
            // }

            int quantidade = 0;
            for (int j = 0; j < resposta.length; j++) {
                if (resposta[j] == 1) {
                    quantidade++;
                }
            }
            //apostas[quantidade -1]++;
            if (quantidade == 1) {
                simples++;
            } else if (quantidade == 2) {
                dupla++;
            } else {
                tripla++;
            }

        }

        System.out.println("TOTAL DE PONTOS " + totalPts);
        // MOSTRAS SIMPLES, DUPLAS E TRIPLAS
    }
}
