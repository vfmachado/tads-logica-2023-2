import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        
        int[][] M = {
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5}
        };

        Random aleatorio = new Random();
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = aleatorio.nextInt(10);
            }
        }

    }
}
