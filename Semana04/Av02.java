import java.util.Scanner;  

public class Av02 {
    public static void main(String[] args) {

        int nLados;
        float medida, perimetro, area;
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o número de lados do polígono e a medida: ");
        nLados = in.nextInt();
        medida = in.nextFloat();

        if (nLados == 3) {
            perimetro = 3 * medida;
            System.out.printf("TRIANGULO DE PERIMETRO %f\n", perimetro);
        } else if (nLados == 4) {
            area = medida * medida;
            System.out.printf("QUADRADO DE AREA %f\n", area);
        } else if (nLados == 5) {
            System.out.println("PENTAGONO");
        } else {
            System.out.println("DESCONHECIDA");
        }


    }
}