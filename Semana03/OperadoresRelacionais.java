import java.util.Scanner;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // TODOS OPERADAORES RELACIONAIS
        // RETORNAM TRUE OU FALSE (BOOLEAN)

        boolean resultado;
        int v1, v2;

        System.out.println("Informe dois valores");
        v1 = in.nextInt();
        v2 = in.nextInt();

        resultado = v1 > v2;  // >  ( é maior que? ) 

        System.out.println("v1 > v2 ? " + resultado); 
        System.out.println("v1 >= v2 ? " + (v1 >= v2)); 
        System.out.println("v1 < v2 ? " + (v1 < v2)); 
        System.out.println("v1 <= v2 ? " + (v1 <= v2)); 
        System.out.println("v1 != v2 ? " + (v1 != v2)); 
        System.out.println("v1 == v2 ? " + (v1 == v2)); 

        // FAZER UM PROGRAMA QUE INDIQUE O MAIOR DOS DOIS VALORES
        // SE ( valor_logico ) então { bloco de codigo  }
        if (v1 > v2) {
            // só executa este bloco quando a condição for satisfeita (true)
            System.out.println("SIGNIFICA QUE V1 EH MAIOR QUE V2");
        }

        boolean valorLogico = v1 > v2;
        if (valorLogico) {
             System.out.println("SIGNIFICA QUE V1 EH MAIOR QUE V2 usando uma variavel");
        }

        int ovos = 6;
        System.out.println("TEM LEITE?");
        boolean temLeite = in.nextBoolean();
        if (temLeite) {
            ovos = 1;
        }

        // ! => nega o resultado da expressão ( true => false / false => true)
        if (!temLeite) {
            System.out.println("NAO TEM LEITE... COMPREI " + ovos + " OVOS");
        }

        System.out.println("OVOS COMPRADOS: " + ovos);

    }
}