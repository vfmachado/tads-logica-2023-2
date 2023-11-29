/*
                         v
v1 = { 1, 2, 3, 4, 5, 8};
v2 = { 2, 4, 5, 6, 7, 9};
                      ^
intersecao = { 2, 4, 5 };

 */

public class L08CEx08 {
    public static void main(String[] args) {
        
        int [] v1 = { 1, 2, 3, 4, 5, 8};
        int [] v2 = { 2, 4, 5, 6, 7, 9};
        
        int [] intersecao = new int[v1.length];
        int posInter = 0;
        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                if (v1[i] == v2[j]) {
                    intersecao[posInter] = v1[i];
                    posInter++;
                }
            }
        }

        for (int i = 0; i < posInter; i++) {
            System.out.print(intersecao[i] + " ");
        }
        System.out.println();

    }
}