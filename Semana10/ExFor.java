public class ExFor {
    public static void main(String[] args) {
        
        int contador = 0;
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        for (int valor = 0; valor < 5; valor++) {
            System.out.println("Contador: " + valor);
        }
        /*
         * for (incializacao ; teste logico ; modificador ) {}
         * * for ( ; teste logico ; modificador ) {}
         * * for (incializacao ;  ; modificador ) {}
         * * for (incializacao ; teste logico ;  ) {}
         * * for ( ;  ;  ) {}
         * 
         */
    }
}
