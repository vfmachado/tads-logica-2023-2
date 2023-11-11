public class Reiniciando {
    public static void main(String[] args) {
        
        int v[] = new int[5];
        int aux[];
        v[0] = 1;        
        v[1] = 2;
        v[2] = 3;
        v[3] = 4;


        // CUIDADO
        int a, b, c[];  // tem 2 inteiros e um vetor de inteiros
        int [] d, e, f; // tem 3 vetore de inteiros

        
        for (int i = 0; i < 5; i++) {
            System.out.println("\n\nVETOR DE TAMANHO " + v.length);
            System.out.println(v);
            for (int j = 0; j < v.length; j++) {
               System.out.print(v[j] + "  "); 
            }
            System.out.println();

            // SEMPRE QUE CRIAMOS UM NOVO VETOR
            // ISTO É UM NOVO ESPAÇO NA MEMÓRIA
            // LOGO PERDEMOS TODOS OS VALORES
            aux = new int[v.length + 1];
            for (int j = 0; j < v.length; j++) {
                aux[j] = v[j];
            }
            v = aux;
        }





    }
}
