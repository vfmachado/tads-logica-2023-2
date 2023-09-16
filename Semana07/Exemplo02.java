import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = 0;
        int max = in.nextInt();

        // ENQUANTO (valor_logico) {}
        while (num <= max) {
            System.out.println(num);
            //num++;      // num++ ==>  num = num + 1;
            num = num + 2; 
        }

        // quando o teste logico eh falso, segue a execucao do codigo
        System.out.println("PAREI E O NUM FICOU EM " + num);
    }

}