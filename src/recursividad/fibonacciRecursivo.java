
package recursividad;


public class fibonacciRecursivo {
   static int n1 = 0, n2 = 1,n3,i;
   
    public static void main(String[] args) {
        int count = 10;
        System.out.print(n1+" "+n2);
        printFibonacci(count-2);
    }
    
    static void  printFibonacci(int conut){
        if(conut >0){
            n3 = n1 +n2;
            n1 =n2;
            n2 = n3;
            
            System.out.print(" "+ n3);
            printFibonacci(conut-1);
        }
    }
}
