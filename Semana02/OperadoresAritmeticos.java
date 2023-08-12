

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int a, b;
        int soma, multiplicacao, divisao, diferenca, resto;

        a = 8;
        b = 3;

        soma = a + b;
        diferenca = a - b;
        multiplicacao = a * b; 
        divisao = a / b;    // DIVISAO DE INTEIROS, O RESULTADO EH INTEIRO

        // operador de resto %
        resto = a % b;

        float c, d;
        c = 6.0f;
        d = 2.5f;

        System.out.println("RESTO COM FLOAT " + (c%d));


        // CUIDADOS ESPECIAIS
        // float e int -> float
        System.out.println("A + C " + (c + a));

        a = 5;
        b = 10;
        System.out.println("A / B = " + (a / b));
        System.out.println("A / B = " + ( (float)a / b));

        float resultado = (float) a /  b;


        int numeroSemVirgula = (int) (c + d);


    }
}