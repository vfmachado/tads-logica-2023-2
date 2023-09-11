import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float salario = in.nextFloat();
        float imposto = 0;

        if (salario > 2000 && salario <= 3000) {
            imposto = (salario - 2000) * 0.08f;
        }

        if (salario > 3000 && salario < 4.500) {
            imposto = 80 + (salario - 3000) * 0.18f;
        }

        if (salario > 4500) {
            imposto = 80 + 270 + (salario - 4500) * 0.28f;
        }
        
        System.out.println("IMPOSTO " + imposto);


    }
}