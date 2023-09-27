public class While {
    public static void main(String[] args) {

        // FATORIAL DE UM NUMERO
        // EH A MULTIPLICACAO ENTRE TODOS OS NUMEROS DE 1 ATÉ N

        // 3! = 1 * 2 * 3;
        // 5! = 1 * 2 * 3 * 4 * 5;
        // 10! = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10

        int n = 5;
        int contador = 1;
        int fat = 1;

        // c <= n ? true / false
        // enquanto o valor da exp logica for true
        // repete o laço de repetição

        // WHILE <=> ENQUANTO
        while (contador <= n) {
            // fatorial recebe tudo que tem no fatorial multiplicado pelo valor atual do contador
            fat = fat * contador;
            System.out.println(contador);
            contador++;
        }

        System.out.println("FORA DO WHILE contador " + contador);

        System.out.println("FATORIAL: " + fat);

    }
}