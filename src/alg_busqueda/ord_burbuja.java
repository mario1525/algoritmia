
package alg_busqueda;

public class ord_burbuja {
    public static void main(String[] args) {
        int[] vect = {2, 5, 3, 7, 8, 9, 6, 1, 11, 20, 16, 2, 18, 14, 13, 12, 17, 15, 4, 10, 19};
        int t = vect.length;
        mostrar(vect,t);
        long ini = System.nanoTime();        
        ord_burj(vect,t);
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
    
    static void ord_burj(int[]vec, int tam){
        boolean fini = true;
        int actu;
        int ite= 0;
        while( fini){
            fini= false;
            ite++;
            for(actu =0; actu<tam-ite;actu++){
                if(vec[actu]>vec[actu+1]){
                    fini=true;
                    int temp = vec[actu];
                    vec[actu] = vec[actu+1];
                    vec[actu+1] = temp;
                }
            }
        }
    } 
}
