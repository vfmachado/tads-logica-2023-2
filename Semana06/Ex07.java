import java.util.Scanner;

public class T {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char genero = in.next().charAt(0);
        float altura, peso, imc;

        altura = in.nextFloat();
        peso = in.nextFloat();

        imc = peso / (altura * altura);

        if (imc < 18) {
            System.out.println("ABAIXO DO PESO");
        } else if ( (genero == 'M' && imc <= 25) || (genero == 'F' && imc <= 24) ) {
            System.out.println("PESO NORMAL");
        } else if (imc <= 30) {
            System.out.println("SOBREPESO");
        } else if (imc <= 35) {
            System.out.println("OBESIDADE I");
        } else if (imc <= 40) {
            System.out.println("OBESIDADE II"); 
        } else {
            System.out.println("OBESIDADE III");
        }

    }
}