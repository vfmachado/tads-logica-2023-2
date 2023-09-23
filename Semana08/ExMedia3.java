import java.util.Scanner;

public class ExMedia2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // considerando que nao sabemos quantas notas serao digitadas, calcule a media aritmetica de todas notas digitadas até que seja digitada uma nota com valor negativo.

        float nota, media = 0;
        int quantidade = 0;

        // PRECISAMOS FORÇAR QUE ESTE TESTE SEJA INICIALMENTE VERDADEIRO
        // PODEMOS COLOCAR UM VALOR "QUALQUER NA NOTA"

        nota = in.nextFloat();

        while (nota >= 0) {
            System.out.println("TESTE");
            
            media = media + nota;
            quantidade++;
            System.out.println("SOMA DAS NOTAS ATEH AGORA: " + media);
            System.out.println("Quantidade de notas digitadas: " + quantidade);
            
            nota = in.nextFloat();
        } 

        media = media / quantidade;
        System.out.println("Media " + media);


    }
}