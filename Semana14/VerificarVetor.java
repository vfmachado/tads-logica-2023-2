import java.util.Scanner;

public class VerificarVetor {
    public static void main(String[] args) {
        
        char [] letras = {'l', 'o', 'g', 'i', 'c', 'a'};
        char [] letras2 = "logica".toCharArray();   // BONUS
        // CRIEM UM PROGRAMA QUE LE UMA LETRA DO USUARIO, E VERIFICA SE A LETRA ESTA PRESENTE NO VETOR;
        // O PROGRAMA VAI LER LETRAS E DIZER SE ESTA OU NAO PRESENTE ATÉ QUE O USUARIO DIGITE O CARACTER 0 (ZERO);

        char caracter;

        Scanner in = new Scanner(System.in);
        
        while (true) {
            caracter = in.next().charAt(0);
            
            if (caracter == '0') break;
            
            int posicao = -1;
            // PARA CADA UMA DAS POSICOES DO VETOR DE LETRAS
            for (int i = 0; i < letras.length; i++) {

                // VERIFICA SE A LETRA EH IGUAL A POSICAO
                if (caracter == letras[i]) {
                    posicao = i;
                }
            }

            if (posicao > -1) {
                System.out.println("ENCONTROU NA POSICAO " + posicao);
            } else {
                System.out.println("NAO TEM NO VETOR");
            }
        }
    }
}
