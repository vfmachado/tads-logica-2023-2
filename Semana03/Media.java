import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float n1, n2, media;

        System.out.println("INFORME AS NOTAS");
        n1 = in.nextFloat();
        n2 = in.nextFloat();

        media = (n1 + n2)/2;

        if (media >= 7) {
            System.out.println("APROV");
        
        // senao
        } else  {
            System.out.println("REPROV");
        }



    }
}