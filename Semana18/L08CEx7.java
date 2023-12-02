/*

    [1, 0, 2, 0, 0, 3, 4, 0]

    [1, 2, 3, 4, 0, 0, 0, 0]

    [1, 2, 3, 4]

 */

public class L08CEx7 {
    public static void main(String[] args) {
        
        int [] v = { 1, 0, 2, 0, 0, 3, 4, 0 };

        int [] aux = new int[v.length];
        int ondeInsere = 0;
        int quantZeros = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] != 0 ) {
                aux[ondeInsere++] = v[i];
            } else {
                quantZeros++;
            }
        }
        
        v = new int[v.length - quantZeros];

        for (int i = 0; i < v.length; i++) {
            v[i] = aux[i];
            System.out.println(v[i]);
        }

    }
}