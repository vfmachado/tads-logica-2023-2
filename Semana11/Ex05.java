import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float popA, crescA;
        float popB, crescB;

        int anos = 0;

        while (true) {
            popA = in.nextFloat();
            if (popA == 0) break;
            crescA = in.nextFloat();

            popB = in.nextFloat();
            if (popB == 0) break;
            crescB = in.nextFloat();

            if (crescB <= crescA) {
                System.out.println("O SEGUNDO PAIS NUNCA VAI ULTRAPASSAR");
            } else {
                anos = 0;
                
                while (popB < popA) {
                    anos++;
                    popA = popA * (1 + crescA/100);
                    popB = popB * (1 + crescB/100);
                }
                System.out.println("LEVOU " + anos + " PARA O SEGUNDO PAIS ULTRAPASSAR");
            }
        }

    }
}