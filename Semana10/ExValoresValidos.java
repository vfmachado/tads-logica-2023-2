import java.util.Scanner;

public class ExValoresValidos {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        // INFORME 10 VALORES E SOME OS VALORES VALIDOS, SALVE O MAIOR E MENOR VALOR VALIDO;
        // SAO CONSIDERADOS OS VALIDOS POSITIVOS E MENORES QUE 10;
        int soma = 0;
        int maior = -1;
        int menor = -1;

        for (int a = 0; a < 10; a++) {

            int valor = in.nextInt();

            if (valor < 0 || valor >= 10) continue;

            soma = soma + valor;

            if (valor > maior) {
                maior = valor;
            }

            if (menor == -1 || valor < menor) {
                menor = valor;
            }

        }

        System.out.println("SOMA " + soma);
        if (maior != -1) {
            System.out.println("MAIOR " + maior);
            System.out.println("MENOR " + menor);
        } else {
            System.out.println("NENHUM VALOR FOI VALIDO");
        }

        
    }
}
