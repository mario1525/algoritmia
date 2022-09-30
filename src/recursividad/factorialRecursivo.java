
package recursividad;


public class factorialRecursivo {
    public static void main(String[] args) {
        int N = 5;
        System.out.println(N+"! = "+ factorial(N+1));
    }
    
    static int factorial(int n){
        if(n<=1)
            return 1;
        else
            return n *factorial(n-1);
        
    }
}
