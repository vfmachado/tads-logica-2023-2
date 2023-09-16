import java.util.Scanner;
import java.util.Random;

public class AdivinhaNumero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt(20) + 1;
        int cont = 0;
        int numeroUsuario = -1;
        
        while (cont < 5 && numeroUsuario != numeroAleatorio) {
            System.out.println("Adivinhe o numero (1-20)");
            numeroUsuario = in.nextInt();

            if (numeroAleatorio == numeroUsuario) {
                System.out.println("SORTE no JOGO");
            } else if (numeroAleatorio > numeroUsuario) {
                System.out.println("TENTE NOVAMENTE MAIOR");
            } else {
               System.out.println("TENTE NOVAMENTE MENOR");
            }

            cont++;
        }

        System.out.println("O NUMERO SORTEADO: " + numeroAleatorio);
    }
}