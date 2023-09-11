import java.util.Scanner;

/*
- Valor de cada ingresso
- Número de pessoas (público do evento) que são sócias do clube
- Número de pessoas (público do evento) não pagantes (menores de 10 anos)
- Número de pessoas (público do evento) pagantes (sem desconto algum)
O algoritmo deverá calcular e exibir o público total do evento, a renda total do evento e o valor que deixou de ser arrecadada devido aos descontos e isenções
*/

public class Ex01B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float valorIngresso, arrecadado, descontos;
        int socios, criancas, pagantes, publico;

        System.out.println("Informe os valores");
        valorIngresso = in.nextFloat();
        socios = in.nextInt();
        criancas = in.nextInt();
        pagantes = in.nextInt();

        arrecadado = valorIngresso * pagantes + valorIngresso * socios * 0.7f;
        descontos = criancas * valorIngresso + socios * valorIngresso * 0.3f;
        publico = criancas + socios + pagantes;

        System.out.println("Publico total do evento " + publico);
        System.out.println("Total arrecadado " + arrecadado);
        System.out.println("Total descontos " + descontos);
    }       
}