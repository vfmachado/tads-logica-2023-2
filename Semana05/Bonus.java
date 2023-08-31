// random = aleatorio
import java.util.Random;

public class Bonus {
    public static void main(String[] args) {

        // um usuario tem 20% de chance de ganhar um bonus, faca um programa que diga se o usuario vai ou nao ganhar esse bonus.
        int resultado;
        Random sorteador = new Random();
        resultado = sorteador.nextInt(10);

        float f = sorteador.nextFloat();
        System.out.println(f);

        System.out.println(resultado + "" + resultado);
        System.out.printf("%d%d \n", resultado, resultado);



    }
}