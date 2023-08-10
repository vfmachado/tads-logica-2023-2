import java.util.Scanner;

public class L01Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n1, n2, media;

        System.out.println("Informe as duas notas");
        // le as notas
        n1 = in.nextFloat();
        n2 = in.nextFloat();

        // calcula a media
        // media = (n1 + n2)/2;
        float soma = n1 + n2;
        media = soma/2;
        
        // mostra o resultado
        System.out.println("A NOTA FINAL EH " + media);
    }
}