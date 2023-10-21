import java.util.Random;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float pontA, pontB;
        int teoriaA, praticaA;
        int teoriaB, praticaB;

        Random aleatorio = new Random();

        int quantPartidas;

        quantPartidas = in.nextInt();

        while (quantPartidas > 0) {
            quantPartidas--;

            System.out.println("CARTA A");
            teoriaA = in.nextInt();
            praticaA = in.nextInt();

            System.out.println("CARTA B");
            teoriaB = in.nextInt();
            praticaB = in.nextInt();

            int sorteioA = aleatorio.nextInt(6) + 1;
            int sorteioB = aleatorio.nextInt(6) + 1;
            
            pontA = (teoriaA + praticaA)/2.0f + sorteioA;
            pontB = (teoriaB + praticaB)/2.0f + sorteioB;

            System.out.println("PONT A " + pontA);            
            System.out.println("PONT B " + pontB);

            if (pontA > pontB) {
                System.out.println("A VENCEU");
            } else if (pontB > pontA) {
                System.out.println("B VENCEU");
            } else {
                System.out.println("EMPATE");
            }
        }


    }
}