import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int anterior = -1, lido;
        int queda = 0;

        // while (n > 0) {

        //     n--;
        // }

        // int cont = 0;
        // while (cont < n) {

        //     cont++;
        // }


        for (int i = 0; i < n; i++) {
            lido = in.nextInt();
            if (anterior != -1) {
                if (lido < anterior) {
                    queda++;
                }
            }
            anterior = lido;
        }

        System.out.println("Houveram " + queda + " quedas");
    }
}