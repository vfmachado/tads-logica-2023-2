import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        // calcular a media de 2 notas 
        // de N alunos, 
        // mostrar a maior media

        Scanner in = new Scanner(System.in);
        float n1, n2, media, maior = 0;
        int quant;
        
        System.out.println("informe a quantidade de alunos");
        quant = in.nextInt();

        for (int i = 0; i < quant; i++) {
            System.out.println("Informe as duas notas do estudante " + i);
            n1 = in.nextFloat();
            n2 = in.nextFloat();
            media = (n1 + n2)/2;
            System.out.println("A media desse aluno: " + media);

            if (media > maior) {
                maior = media;
                System.out.println("TROQUEI A MAIOR MEDIA POR " + maior);
            }
        }

        System.out.println("MAIOR MEDIA " + maior);


    }
}
