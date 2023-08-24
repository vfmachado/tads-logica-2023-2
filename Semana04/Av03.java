import java.util.Scanner;

public class Av03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // VALOR DE CADA NOTA
        int n1, n2, n3; // n3 > n2 > n1
        int quantN1, quantN2, quantN3;
        int saque, sobra;

        System.out.println("Informe o valor das notas disponiveis e quanto deseja sacar");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
        saque = in.nextInt();
        
        quantN3 = saque / n3;
       
        sobra = saque % n3; // sobra = saque - quantN3 * n3;
        //System.out.println("FALTA TE ENTREGAR ... " + sobra);
        
        quantN2 = sobra / n2;
        sobra = sobra % n2;

        quantN1 = sobra / n1;

        int total = quantN1 * n1 + quantN2 * n2 + quantN3 * n3;
        if (total == saque) {
            if (quantN3 > 0)
                System.out.println(quantN3 + " de notas de " + n3);
            
            if (quantN2)
                System.out.println(quantN2 + " de notas de " + n2);
            
            if (quantN1)
                System.out.println(quantN1 + " de notas de " + n1);
        } else {
            System.out.println("VC QUE DISSE QUAIS SAO AS NOTAS E ESCOLHEU UM SQUE IMPOSSIVEL");
        }
        
    }
}