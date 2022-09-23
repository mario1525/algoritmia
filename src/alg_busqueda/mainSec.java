
package alg_busqueda;


public class mainSec {
    
    public static void main(String[] args) {
        int [] vect = {2,5,3,7,8,9,6,1,11,20,16,2,18,14,13,12,17,15,4,10,19};
        int pos; 
        long ini = System.nanoTime();
        pos = buscar(vect,9);
        long fin = System.nanoTime()-ini;
        System.out.println("posicion: "+pos);
        System.out.println("time: "+fin+" manoseg");
        System.exit(0);
        
    }
    
    static int buscar(int [] A, int num ){
        int K =1, res= -1;
        
        do{
            if(A[K]==num){
                res= K;
                break;
            }else{
                K++;
            }
        }while((res==-1)&&(K<A.length));
        return res;
        
    }
    
}
