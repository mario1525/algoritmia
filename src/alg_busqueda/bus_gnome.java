
package alg_busqueda;


public class bus_gnome {
    public static void main(String[] args) {
        int[] vect = {2, 5, 3, 7, 8, 9, 6, 1, 11, 20, 16, 2, 18, 14, 13, 12, 17, 15, 4, 10, 19};
        int t = vect.length;
        mostrar(vect,t);
        long ini = System.nanoTime();        
        gnome(vect,t);
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
    
    static void gnome(int[] vec, int t){
        int pos = 0;
        
        while(pos<t){
            if (pos == 0)
                pos++;
            if(vec[pos]>=vec[pos-1]){
              pos = pos+1;  
            }else{
                int temp = vec[pos];
                    vec[pos] = vec[pos-1];
                    vec[pos-1] = temp;
                
                    pos --;
                
            }
        }
    }
}
