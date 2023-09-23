import java.util.Scanner;
// FACA UM PROGRAMA QUE CALCULE A MEDIA DE N NOTASS
public class ExMedia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota, media = 0;
        int n, contador = 0;

        System.out.println("quantas notas serao digitadas?");
        n = in.nextInt();

        while (contador < n) {
            // toda vez que uma nota é digitada, somamos na variavel media
            System.out.println("Informe a nota");
            nota = in.nextFloat();
            
            // MUITA ATENCAO NESSA LINHA DE CODIGO
            media = media + nota;
            // guarda na variavel media tudo que ja tinha mais (somando) a nova nota

            // atencao pq essa linha garante que o teste sera falso em algum momento
            contador++;
        }

        // no final, dividimos a soma pela quantidade e temos a media
        media = media / n;
        System.out.println("Media " + media);

    }
}