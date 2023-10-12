public class ExFor2 {
    public static void main(String[] args) {
        
        
        for (int valor = 1; valor <= 10; valor++) {
            System.out.println("Contador: " + valor);
        }
        
        for (int valor = 20; valor >= 10; valor--) {
            System.out.println(valor);
        }

        for (int valor = 0; valor <= 20; valor = valor + 2) {
            System.out.println(valor);
        }

        for (int valor = 30; valor >= 15; valor = valor - 2) {
            if (valor == 30) {
                valor--;
            }
            System.out.println(valor);
        }

        for (int valor = 29; valor >= 15; valor = valor - 2) {
            System.out.println(valor);
        }

    }
}
