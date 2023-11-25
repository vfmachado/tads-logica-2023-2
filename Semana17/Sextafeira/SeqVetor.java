public class SeqVetor {
    public static void main(String[] args) {
        
        int [] v = { 1, 2, 3, 4,1, 2, 3, 4, 1, 2, 5, 7, 3, 4 };

        boolean estouEmSeq = false;

        int anterior = v[0];
        int seq = 0;

        for (int i = 1; i < v.length; i++) {
            
            if (v[i] - anterior == 1) {
                estouEmSeq = true;
            } else {
                if (estouEmSeq) {
                    estouEmSeq = false;
                    seq++;
                }
            }

            anterior = v[i];
        }

        if (estouEmSeq) seq++;

        System.out.println("SEQ " + seq);
    }
}
