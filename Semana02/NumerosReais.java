import java.util.Scanner;

public class NumerosReais {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float real;
        // ate 8 casas depois da virgula
        real = 1.12345678f;   // f no final indica que pro java que é um numero float

        // double 
        double maisPrecisao = 1.12451412312421531;

        System.out.println("VALOR FLOAT " + real);
        System.out.println("VALOR DOUBLE " + maisPrecisao);

        // %f serve tanto para float quanto para double
        // %d para numeros inteiros
        System.out.printf("PRINTF COM FLOAT %f\n", real);

        // %.2f determina a quantidade de casas na saída
        System.out.printf("PRINTF COM FLOAT com duas casas %.2f\n", real);

        System.out.println("Informe num novo numero do tipo float");
        real = in.nextFloat();  // Float com F maiusculo

        System.out.println("Informe um numero cheio de casas decimais");
        maisPrecisao = in.nextDouble();

        System.out.println("NOVO VALOR FLOAT " + real);
        System.out.println("NOVO VALOR DOUBLE " + maisPrecisao);

    }
}