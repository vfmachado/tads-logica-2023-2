import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int maior = in.nextInt();
        int menor = in.nextInt();
        int numero = maior;
        
        while (numero >= menor) {
            System.out.println(numero);
            numero--;    // maior = maior - 1;
        }

        System.out.println("MAIOR: " + maior);
        System.out.println("MENOR: " + menor);
        
    }

}