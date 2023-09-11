import java.util.Scanner;

public class Ex03B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int dia = in.nextInt();

        if (dia == 1) {
            System.out.println("DOM");
        } else if (dia == 2) {
            System.out.println("SEG");
        } else if (dia == 3) {
            System.out.println("TER");
        } else if (dia == 4) {
            System.out.println("QUA");
        } else if (dia == 5) {
            System.out.println("QUI");
        } else if (dia == 6) {
            System.out.println("SEX");
        } else if (dia == 7) {
            System.out.println("SAB");
        } else {
            System.out.println("INVALIDO");
        }
        
    }

}