import java.util.Scanner;

public class VariosIfs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um dia da semana (1-7)");
        int dia = in.nextInt();
        String diaExtenso;

        if (dia == 1) {
            diaExtenso = "Domingo";    
        } else if (dia == 2) {
            diaExtenso = "Segunda";
        } else if (dia == 3) {
            diaExtenso = "Terca";
        }
        
        // podemos utilizar uma estrutura chamada
        // switch-case
        switch (dia) {
            case 1:
                diaExtenso = "Domingo";
                break;
            case 2:
                diaExtenso = "Segunda";
                break;
            case 3:
                diaExtenso = "Terca";
                break;
            case 4:
                diaExtenso = "Quarta";
                break;
            case 5:
                diaExtenso = "Quinta";
                break;
            case 6:
                diaExtenso = "Sexta";
                break;
            case 7:
                diaExtenso = "Sabado";
                break;

            // OPCIONALMENTE
            default:
                diaExtenso = "INVALIDO";
                break;
        }

        System.out.println(diaExtenso);
    }
}