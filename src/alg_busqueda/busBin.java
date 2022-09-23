package alg_busqueda;

public class busBin {

    public static void main(String[] args) {
        int[] vect = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int pos;
        long ini = System.nanoTime();
        pos = buscar(vect,10);
        long fin = System.nanoTime()-ini;
        System.out.println("posicion: "+pos);
        System.out.println("time: "+fin+" manoseg");
        System.exit(0);
    }
    
    static int buscar(int[] A, int num){
        int K,i=0,j=A.length;
        do{
            K= (i+j)/2;
            
            if(A[K]<=num)
                i=K+1;
            if(A[K]>=num)
                j=K-1;
        }while(i>=j);
        return K;
    }

}
