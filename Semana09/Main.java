import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner in = new Scanner(System.in);

        int distancia = in.nextInt();
        float litros = in.nextFloat();

        float kml = distancia / litros;

        System.out.printf("%.3f km/l\n", kml);
    }
 
}