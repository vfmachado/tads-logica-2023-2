public class Circulo {
    public static void main(String[] args) {
        
        int raio = 10;
        int cx, cy;
        int n = 20;
        cx = n/2;
        cy = n/2;

        for (int linha = 0; linha <= n; linha++) {
            for (int coluna = 0; coluna <= n; coluna++) {
                int distancia = (linha - cx) * (linha - cx) + (coluna - cy) * (coluna - cy);
                if (distancia <= raio * raio /*&& distancia > raio*/)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
