public class Sequencia {
    public static void main(String[] args) {
        
        int[] v = { 1, 2, 3, 5, 4, 5, 1, 2, 7, 9};
        //                ^           ^     ^
        boolean estouEmSequencia = false;
        int quantidade = 0;
        
        for (int i = 0; i < v.length -1; i++) {
            
            if (v[i+1] == v[i] + 1) {
                if (!estouEmSequencia) {
                    quantidade++;
                }
                estouEmSequencia = true;
            } else {
                estouEmSequencia = false;
            }

        }

        System.out.println("QUANTIDADE " + quantidade);

        
    }
}
