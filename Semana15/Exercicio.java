import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao = -1;
        int [] v = new int[10];
        while (true) {
            System.out.print("ESCOLHA UMA OPCAO: \n" +
            "0. SAIR\n"+
            "1. Mostrar o vetor\n" +    // MOSTRA TODOS OS VALORES DO VETOR
            "2. Inserir um valor em uma posicao\n"+  // PEDE PARA O USUARIO A POSICAO E O VALOR PARA INSERIR
            "3. Maior valor do vetor e sua posicao\n" +
            "4. Menor valor do vetor e sua posicao\n" +
            "5. Media dos valores que sao diferentes de zero\n" +
            "6. Identificar a quantidade de numeros pares e numeros impares no vetor\n" +
            "7. Trocar os valores entre duas posicoes\n" +
            "8. Identificar quantas sequencias tem no vetor\n" +
            "9. Ordenar o vetor\n"+
            "10. Criar um novo vetor com tamanho diferente copiando os valores do vetor antigo\n" +
            "OPCAO: "
            );
            opcao = in.nextInt();
            if (opcao == 0) break;
            switch (opcao) {
                // case 0:
                //     System.out.println("TCHAU!");
                //     break;
                case 1:
                    // MOSTRAR O VETOR
                    for (int i = 0; i < v.length; i++) {
                        System.out.print(v[i] + "  ");
                    }
                    System.out.println();

                    break;     
                case 2:
                    // INSERIR UM VALOR EM UM POSICAO
                    // O USUARIO DIGITA PRIMEIRO A POSICAO, DEPOIS O VALOR
                    // DEVE SER VALIDADA A POSICAO\
                    System.out.println("Informe uma posicao e um valor");
                    int posicao = in.nextInt();
                    int valor = in.nextInt();
                    if (posicao >= 0 && posicao <= 9)
                        v[posicao] = valor;
                    else
                        System.out.println("Posicao invalida");
                    break;

                case 3: 
                    // MAIOR VALOR DO VETOR E A POSICAO DO VALOR
                    int maior = v[0];
                    int maiorPosicao = 0;
                    for (int i = 0; i < v.length; i++) {
                        if (v[i] > maior) {
                            maior = v[i];
                            maiorPosicao = i;
                        }
                    }
                    System.out.println("MAIOR VALOR: " + maior + " NA POSICAO " + maiorPosicao);
                    break;

                case 4:
                    // MENOR VALOR DO VETOR E A POSICAO DO VALOR
                    int menorPosicao = 0;
                    for (int i = 0; i < v.length; i++) {
                        if (v[i] < v[menorPosicao]) {
                            menorPosicao = i;
                        }
                    }
                    System.out.println("MENOR VALOR: " + v[menorPosicao] + " NA POSICAO " + menorPosicao);
                    break;

                case 5: 
                    // MEDIA DOS DIFERENTES DE ZERO
                    float media = 0;
                    int quantidadeDiffZero = 0;
                    for (int i = 0; i < v.length; i++) {
                        if (v[i] != 0) {
                            media += v[i];  // media = media + v[i]
                            quantidadeDiffZero++;
                        }
                    }
                    media /= quantidadeDiffZero;    // media = media / quantidadeDiffZero;
                    System.out.println("MEDIA " + media);
                    break;
                
                case 6:
                    // QUANTIDADE DE PARES E IMPARES
                    break;

                case 7:
                    // TROCAR O VALOR DE DUAS POSICOES
                    System.out.println("Informe duas posicoes");
                    int p1, p2;
                    p1 = in.nextInt();
                    p2 = in.nextInt();
                    int aux = v[p1];
                    v[p1] = v[p2];
                    v[p2] = aux;
                    break;

                case 8:
                    // IDENTIFICAR A QUANTIDADE DE SEQUENCIAS
                    break;

                case 9:
                    // ORDENAR O VETOR
                    break;

                case 10:
                    // CRIAR UM VETOR DE TAMANHO IDENTIFICADO PELO USUARIO,
                    // CASO O TAMANHO SEJA MENOR, IGNORAR OS ZEROS DO VETOR ORIGINAL;
                    // CASO O TAMANHO SEJA MAIOR, COPIAR TODOS OS VALORES E REPETIR OS VALORES DO INICIO DO VETOR NAS POSICOES NOVAS
                    break;
                default:
                    System.out.println("OPCAO INVALIDA");
                    break;
            }
        }
    }
}