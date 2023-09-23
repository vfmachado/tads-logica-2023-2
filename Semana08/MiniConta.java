import java.util.Scanner;

public class MiniConta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // IMAGINE QUE VC FEZ UM PROGRAMA PARA GERENCIAR SUA CONTA COFRINHO, VC PODE DEPOSITAR, RETIRAR, VERIFICAR O SALDO.

        float saldo = 0, limite = 100;
        int opcao = 0;

        while (opcao != 4) {

            //System.out.print("Digite \n\t1. Ver saldo\n\t2. Depositar \n\t3. Retirar \n\t4. Encerrar\n\nOpcao: ");
            System.out.printf("Digite\n\t%s\n\t%s\n\t%s\n\t%s\n\nOpcao: ",
                "1. Ver saldo",
                "2. Depositar",
                "3. Retirar", 
                "4. Encerrar"
            );
            opcao = in.nextInt();

            if (opcao < 1 || opcao > 4) {
                System.out.println("OPCAO INVALIDA");
            } else {
                if (opcao == 1) {
                    System.out.println("SALDO EM CONTA R$ " + saldo);
                } else if (opcao == 2) {
                    float quantia = in.nextFloat();
                    saldo = saldo + quantia;
                } else if (opcao == 3) {
                    float quantia = in.nextFloat();
                    if (saldo + limite >= quantia)
                        saldo = saldo - quantia;
                    else
                        System.out.println("SALDO INSUFICIENTE");
                }
            }
        }
    }

}