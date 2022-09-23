package alg_busqueda;

public class ord_rap {

    public static void main(String[] args) {
        int[] vect = {2, 5, 3, 7, 8, 9, 6, 1, 11, 20, 16, 2, 18, 14, 13, 12, 17, 15, 4, 10, 19};
        int t = vect.length;
        mostrar(vect, t);
        long ini = System.nanoTime();
        or_rap(vect,0,t-1);
        long fin = System.nanoTime() - ini;
        mostrar(vect, t);
        System.out.println("time: " + fin + " manoseg");
        System.exit(0);
    }

    static void mostrar(int[] v, int t) {
        System.out.print("{");
        for (int i = 0; i < t; i++) {
            System.out.print(" " + v[i] + ", ");
        }
        System.out.println("}");
    }

    static int pivo(int[] vec, int baja, int alta) {
        int piv = vec[alta];
        int i = baja - 1;

        for (int j = baja; j < alta; j++) {
            if (vec[j] <= piv) {
                i++;
                int temp = vec[i];
                vec[i] = vec[j];
                vec[j] = temp;
            }
        }
        int temp2 = vec[i+1];
        vec[i+1] = vec[alta];
        vec[alta] = temp2;
        return i+1;
    }

    static void or_rap(int[] vec, int baja, int alta) {
        if(baja<alta){
            int piv = pivo(vec, baja,alta);
            or_rap(vec, baja,piv-1);
            or_rap(vec, piv+1,alta);
            
        }
    }

}
