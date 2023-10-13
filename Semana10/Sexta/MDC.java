public class MDC {
    public static void main(String[] args) {
        
        // MAXIMO DIVISOR COMUM
        // dados dois numeros, calcular e mostar o maior divisor comum
        int valorA = 1024 * 1251242;
        int valorB = 1024 * 1245123;

        long tinicio = System.currentTimeMillis();

        // Menor para o maiors
        int divisor = 1;
        int quantTeste = 0;
        int menor = valorA;
        if (valorB < valorA) {
            menor = valorB;
        }
        // for (int valorTestado = 2 ; valorTestado <= valorA && valorTestado <= valorB  ;  valorTestado++) {
        //     quantTeste++;
        //     if (valorA % valorTestado == 0 && valorB % valorTestado == 0) {
        //         divisor = valorTestado;
        //     }
        // }

        for (int valorTestado = menor; valorTestado >= 1; valorTestado--) {
            quantTeste++;
            if (valorA % valorTestado == 0 && valorB % valorTestado == 0) {
                divisor = valorTestado;
                break;
            }
        }

        long tfinal = System.currentTimeMillis();
        long tempoTotal = tfinal - tinicio;

        System.out.println("MDC " + divisor);
        System.out.println("TESTAMOS " + quantTeste + " VEZES");
        System.out.println("LEVEI " + tempoTotal + " ms");
        
    }
}
