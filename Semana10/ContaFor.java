import java.util.Scanner;

public class ContaFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = 24;
        // MOSTRA OS DIVISORES DE UM NUMERO
        for (int divisor = 1; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                System.out.println(divisor);
            } 
        }

        int alunos = in.nextInt();
        for (int i = 0; i < alunos; i++) {

        }
    }
}
