import java.util.Scanner;

public class DoWhile {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao;

        // QUANDO UTILIZAMOS O DO ... WHILE, SABEMOS QUE PELO MENOS 1 VEZ O MEU LAÇO SERA EXECUTADO

        // FAÇA
        do {
            System.out.println("DIGITE 1 para continuar e outro valor para sair");
            opcao = in.nextInt();
        } while (opcao == 1);

    }

}
