import java.util.Scanner;

public class Conversao {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int horas, minutos, segundos;
        System.out.println("Informe o tempo em segundos: ");

        segundos = in.nextInt();

        horas = segundos / 3600;
        System.out.println("Horas " + horas);

        minutos = ( segundos % 3600 ) / 60;
        // minutos = (segundos - horas * 3600 ) / 60;

        System.out.println("Minutos " + minutos);

        segundos = ( segundos % 3600 ) % 60;
        System.out.println("Segundos " + segundos);

    }
}