package alg_busqueda;

public class ord_select {

    public static void main(String[] args) {
        int[] vect = {2, 5, 3, 7, 8, 9, 6, 1, 11, 20, 16, 2, 18, 14, 13, 12, 17, 15, 4, 10, 19};
        int t = vect.length;
        mostrar(vect,t);
        long ini = System.nanoTime();        
        selec_sort(vect,t);
        long fin = System.nanoTime()-ini;
        mostrar(vect,t);
        System.out.println("time: "+fin+" manoseg");
        System.exit(0);
    }

    static void mostrar(int[] v, int t) {
        System.out.print("{");
        for (int i = 0; i < t; i++) {
            System.out.print(" " + v[i] + ", ");
        }
        System.out.println("}");
    }

    static void selec_sort(int[] vec, int tam) {
        int act, men, j, temp;
        for (act = 0; act < tam; act++) {
            men = act;
            for (j = act + 1; j < tam; j++) {
                if (vec[j] < vec[men]) {
                    men = j;
                }
            }
            temp = vec[act];
            vec[act]=vec[men];
            vec[men]=temp;
        }        
    }
}
