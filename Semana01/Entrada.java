import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);


        System.out.println("PROGRAMA ENTRADA FUNCIONA!!!");
        System.out.println("Digite seu apelido:");

        // DECLARAR VARIAVEL
        // tipo nome;
        String apelido; // String => texto
        int idade;      // int => numero inteiro
        int proxAno;
        // in.next() => acao do scanner chamada next()
        // next() => le uma palavra
        apelido = in.next();       // associar valor a uma variavel

                                    //  o + CONCATENA o texto com o valor da variavel
        System.out.println("BEM VINDO(A) " + apelido +  " me diga sua idade");
        // next => proximo
        // int => inteiro
        // cammel case - junta os textos com letra maiuscula
        idade = in.nextInt();
        proxAno = idade + 1;
        System.out.println("LEGAL, ANO QUE VEM VC TERA " + proxAno);

    }   
}