import java.util.Scanner;

public class ExCorretor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char [] gabarito = {'a', 'a', 'c', 'd', 'b', 'a', 'c', 'e'};

        char [][] respostas = new char[3][8];

        // char letra = 65;
        // System.out.println(letra);

        // LER AS 8 RESPOSTAS DOS 5 ALUNOS
        // PARA CADA ALUNO, CALCULAR A SUA NOTA CADA QUESTAO VALE 1.25
        // CALCULAR A MEDIA DA TURMA
        // DIZER QUAL O ALUNO COM A MAIOR QUANTIDADE DE ACERTOS
        
        // começa resolvendo o menor problema possivel

        char resp = 'b';
        
        for (int i = 0; i < respostas.length; i++) {
            System.out.println("INFORME AS RESPOSTAS DO ALUNO(A) " + i);
            for (int j = 0; j < respostas[i].length; j++) {
                respostas[i][j] = in.next().charAt(0);
            }
        }

        for (int aluno = 0; aluno < respostas.length; aluno++) {
            float nota = 0;
            for (int i = 0; i < 8; i++) {
                if (gabarito[i] == respostas[aluno][i]) {
                    nota = nota + 1.25f;
                }
            }
            System.out.println("ESTUDANTE " + aluno + " OBTEVE NOTA " + nota);
        }
        
        


    }
}
