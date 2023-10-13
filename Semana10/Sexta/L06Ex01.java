import java.util.Scanner;

public class L06Ex01 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String matricula;
        int idade;
        char genero;
        float altura;
        boolean concursado;

        int funcConcursadas = 0;
        int funcH = 0;
        int maiorIdadeHC = 0;
        while (true) {
            System.out.println("Informe a matricula ");
            matricula = in.next();

            if (matricula.equals("0")) break;

            System.out.println("Informe a idade ");
            idade = in.nextInt();
            System.out.println("Informe a genero ");
            genero = in.next().toUpperCase().charAt(0);
            System.out.println("Informe a altura ");
            altura = in.nextFloat();
            System.out.println("Informe a concursado ");
            concursado = in.nextBoolean();

            // a
            if (genero == 'F' && concursado) funcConcursadas++;

            // b
            if (genero == 'M') funcH++;

            // c
            if (genero == 'M' && concursado) {
                if (idade > maiorIdadeHC) {
                    maiorIdadeHC = idade;
                }
            }
        }

        System.out.println("MOSTRAR TODAS AS RESPOSTAS");
    }
}
