import java.util.Scanner;

public class HorasFuncionario {
    // DADO UM CONJUNTO DE HORAS E MINUTOS DE ENTRADA E SAIDA DE UMA PESSOA NO TRABALHO, DIZER QUANTAS HORAS E MINUTOS HH:MM FORAM TRABALHADAS AO TOTAL.
    /*
     * 8 0      16 0
     * 15 0     22 0
     * 19 0       03 0
     * 13 30    15 0
     * -1
     */

    /*
     *  8
     *  7
     *  8
     *  1 30 min
     *  
     *  24h 30min
     */
     
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("MEU CODIGO FUNCIONA DESDE O INCIO");

        int horaInicio = 0;
        int horaFinal;
        int diferenca;
        int total = 0;

        while (true) {
            System.out.println("ENTREI NO WHILE PQ MEU TESTE EH TRUE");
            horaInicio = in.nextInt();

            // verifica se o valor digitado é igual a -1
            if (horaInicio == -1) {
                break;   // caso o teste seja verdadeiro
                         // o break PARA o laço de repetição
            }

            horaFinal = in.nextInt();

            diferenca = horaFinal - horaInicio;
            // if (horaFinal < horaInicio) {
            //     diferenca = 24 - horaInicio + horaFinal;
            // }
            if (diferenca <= 0) {
                diferenca = diferenca + 24;
            }
            System.out.println("diferenca " + diferenca);

            total = total + diferenca;

        }

        System.out.println("ENCERROU - FORA DO WHILE");
        System.out.println("TOTAL DE HORAS TRABALHADAS: " + total);
     }
}
 