import java.util.Scanner;

public class ExemploScanner {

    public static void main(String[] args) {

        // declaracao
        // tipo nome;
        Scanner in;

        // inicializacao
        in = new Scanner(System.in);

        // ln = line = linha no final
        System.out.println("Informe um numero inteiro");

        int numero1, resultado;
        numero1 = in.nextInt();

        System.out.println("Informe outro numero inteiro");
        int numero2 = in.nextInt();

        // f -> formatado
        // %d sera substituido por um numero inteiro
        // \n quebra de linha
        System.out.printf("NUMERO 1 => %d FOI DIGITADO\n", numero1);
        System.out.println("NUMERO 1 => " + numero1 + " FOI DIGITADO");
        numero1 = numero1 * 2;
        System.out.println("O DOBRO DO NUMERO 1 EH " + numero1);

        resultado = numero1 + numero2;

        System.out.println(numero1 + " + " + numero2 + " = " + resultado);
        System.out.printf("%d + %d = %d\n", numero1, numero2, resultado);
    }
}