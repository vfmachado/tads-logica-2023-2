
/*

    [1, 5, 2, 4, 9, 3, 0]

    [0, 2, 4]
    [9, 5, 3, 1]

    ordena e depois separa
    [0, 1, 2, 3, 4, 5, 9]
    [0, 2, 4]
    [9, 5, 3, 1]

    separa depois ordena
    [2, 4, 0]
    [0, 2, 4]

    [1, 5, 9, 3]
    [9, 5, 3, 1]

 */

 public class L08CEx06 {
    public static void main(String[] args) {
        int [] v = {1, 5, 2, 4, 9, 3, 0};
        int [] pares, impares;

        for (int i = 0; i < v.length; i++) {
            for (int j = i+1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    int aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }

        int quantpares = 0;
        int quantimpares = 0;
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
            if (v[i] % 2 == 0) {
                quantpares++;
            } else {
                quantimpares++;
            }
        }

        pares = new int[quantpares];
        impares = new int[quantimpares];

        // int indicePar = 0;
        // for (int i = 0; i < v.length; i++) {
        //     if (v[i] % 2 == 0) {
        //         pares[indicePar] = v[i];
        //         indicePar++;
        //     }
        // }

        // int indiceImpar = 0;
        // for (int i = v.length -1; i >= 0; i--) {
        //     if (v[i] % 2 == 1) {
        //         impares[indiceImpar] = v[i];
        //         indiceImpar++;
        //     }
        // }

        int idxPar = 0;
        int idxImpar = quantimpares -1;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                pares[idxPar++] = v[i];
            } else {
                impares[idxImpar--] = v[i];
            }
        }


    }
 }