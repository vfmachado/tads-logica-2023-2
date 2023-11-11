import java.util.Arrays;

public class Ordenando {
    public static void main(String[] args) {
        
        int v[] = { 1, 2, 5, 3, 7, 0 };

        for (int pos = 0; pos < v.length; pos++) {
            
            int posmenor = pos;
            for (int i = pos+1; i < v.length; i++) {
                if (v[i] < v[posmenor]) {
                    posmenor = i;
                }
            }
            // troca
            int troca = v[pos];
            v[pos] = v[posmenor];
            v[posmenor] = troca;
        }
        System.out.println("\n\nVETOR DE TAMANHO " + v.length);
        for (int j = 0; j < v.length; j++) {
            System.out.print(v[j] + "  "); 
        }
        System.out.println();

    }
}
