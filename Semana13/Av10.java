public class Av10 {
    public static void main(String[] args) {
        int numero = 10; // 1010

        int resto;
        String binario = "";

        while (numero > 0) {
            resto = numero % 2;
            numero = numero / 2;
            binario = resto + binario;
        }

        System.out.println("BINARIO " + binario);

    }
}
