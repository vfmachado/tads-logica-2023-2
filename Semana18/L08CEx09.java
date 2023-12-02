public class L08CEx09 {
    public static void main(String[] args) {
        
        int v[] = { 1 };

        int N = Integer.parseInt(args[0]);


        while (N > 0) {

            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + "  ");
            }
            System.out.println();

            int [] aux = new int[v.length + 1];
            aux[0] = 1;
            for (int i = 1; i < aux.length -1; i++) {
                aux[i] = v[i-1] + v[i];
            }
            aux[aux.length -1] = 1;

            v = aux;

            N--;
        }

    }
}
