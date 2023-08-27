import java.util.Scanner;
public class Comparacao {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char letra = 'A';

        // le uma letra utilizando o scanner
        // to upper case - deixa o texto em maiusculo
        // toLowerCase tbm existe =)
        letra = in.next().toUpperCase().charAt(0);
        System.out.println("LETRA DIGITADA " + letra);
        char escolha;
        System.out.println("ESCOLHA y para sim e n para nao");
        escolha = in.next().charAt(0); 



        if (escolha == 'y' || escolha == 'Y') {
            System.out.println("VC DISSE SIM");
        } else if ( escolha == 'n') {
            System.out.println("VC DISSE NAO");
        } else {
            System.out.println("EU NAO SEI OQ VC QUER DIZER");
        }

        System.out.println("digite EXCLUIR para deletar o arquivo");
        String texto  = in.next();

        // retorna true se ambas as Strings sao iguais
        if (texto.equals("EXCLUIR")) {
            System.out.println("EXCLUINDO ARQUIVO...");
        }

        if (texto.equalsIgnoreCase("ExCluIr")) {
            System.out.println("EXCLUINDO ARQUIVO... CASE IGNORED");
        }

        System.out.println("A PALAVRA QUE VC DIGITOU TEM TAMANHO " + texto.length());
    }
}