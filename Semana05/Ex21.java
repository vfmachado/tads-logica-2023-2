import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float minLitros;
        float comprimentoPista;
        int voltas, reabastecimentos;
        float consumokml;

        System.out.println("Informe o comprimento da pista, a quantidade de voltas, o numero de reabastecimentos, e o consumo do carro");
        comprimentoPista = in.nextFloat() / 1000;
        voltas = in.nextInt();
        reabastecimentos = in.nextInt();
        consumokml = in.nextFloat();

        float totalPistaReabastecer = voltas * comprimentoPista / reabastecimentos;

        minLitros = totalPistaReabastecer/consumokml;
        System.out.println("DEVE SER ABASTECIDO " + minLitros);
        
    }
}