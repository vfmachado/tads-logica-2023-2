
public class ExWhile01 {
    public static void main(String [] args) {

        // SEMPRE .. SEMPRE .. SEMPRE QUE ESTIVERMOS ASSOCIADOS A IDEIA DE REPETIR ALGO, POR EXEMPLO, 
        
        // - O CALCULO DA MEDIA ARITMETICA SIMPLES ENTRE 5 VALORES.

        // - MOSTRAR OS NUMEROS DENTRO DE UM INTERVALO

        // - MOSTRAR VARIAS VEZES A MESMA MENSAGEM

        // MOSTRAR OS NUMEROS DE 1 A 10
        int contador = 1;

        // enquanto (valor_logico) { bloco }
        while (contador <= 10) {
            
            System.out.println("Contador: " + contador);
            contador++;

        }

        System.out.println("CONTADOR FORA DO WHILE "  + contador);

        // o laço de repetição é encerrado quando o valor logico dentro dos parenteses é falso
    }
}