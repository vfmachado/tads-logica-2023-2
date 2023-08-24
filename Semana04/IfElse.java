import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        int c = 8;

        //boolean aEhMaiorQueB = a > b; 
        // if (aEhMaiorQueB) { }
        
        if (a > b) {
            if (a > c) {
                // BLOCO 1
            }
        }

        // if (a > b && a > c) { }
        // && => E
        // SOMENTE VERDADEIRO QUANDO AS CONDICOES SAO VERDADEIRAS

        // ||  => OU 
        // EXECUTA SE PELO MENOS UMA EH VERDADEIRA
        if (b < c || a < c) {
            // bloco 2
        }

        // ! => NAO
        // NEGAR O VALOR BOOLEANO ( !TRUE => FALSE /  !FALSE => TRUE)
        boolean ganhou = false;
        if (!ganhou) {}

        if (! (a > b)) {

        }
        // if (a <= b)


        int idade;
        Scanner in = new Scanner(System.in);
        idade = in.nextInt();
        String classificacao;

        // menor que 18
        if (idade < 18) {
            classificacao = "MENOR";
        } else if (idade < 65) {        // maior ou igual que 18
            classificacao = "ADULTO";
        } else {
            classificacao = "MELHOR IDADE";
        }
        

        // int conta = 2 + 2 * 3;
        // 8
        
        // int conta = (2 + 2) * 3;
        // 12
        
        // int resto = idade % 2; resto == 0; // resto zero significa ser divisivel
        if (idade % 2 == 0) // uma linha ou um bloco, as chaves opcionais
            System.out.println("IDADE PAR");
        else
            System.out.println("IDADE IMPAR");

        System.out.println("SUA CLASSIFICAO EH " + classificacao);
        System.out.printf("SUA CLASSIFICACAO EH %s\n", classificacao);
    }
}