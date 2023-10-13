import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String senha;

        do {
            System.out.print("Informe a senha: ");
            senha = in.next();
        } while (!senha.equals("senha"));

        System.out.println("VC ACERTOU A SENHA");
    }
}
