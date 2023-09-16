public class Exemplo01 {
    public static void main(String[] args) {

        int num = 1;

        // ENQUANTO (valor_logico) {}
        while (num < 5) {
            System.out.println(num);
            num++;      // num++ ==>  num = num + 1;
        }

        // quando o teste logico eh falso, segue a execucao do codigo
        System.out.println("PAREI E O NUM FICOU EM " + num);

    }

}