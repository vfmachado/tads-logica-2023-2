import java.util.Scanner;

public class DiasVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String [] dias = { "Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado" };

        int dia = in.nextInt(); // input do usuario (1 - 7)
        int posicao = dia - 1;  // posicao eh a conversao do valor digitado pelo usuario para 0 - 6
        System.out.println(dias[posicao]);

    }
}
