import java.util.Scanner;

public class ParandoLacos {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float nota, media = 0;
        int quant = 0;

        do {

            nota = in.nextFloat();

            if (nota == -1) {
                break;  // break => parar o laco de repeticao em que esta
            }

            media = media + nota;
            quant++;
        
            // while true geraria um laco infinito... porem estamos controlando a execucao com o break
            // a vantagem é tentar facilitar a logica durante o processo.
        } while (true);

        media = media / quant;
        System.out.println("Media " + media);
    }
}
