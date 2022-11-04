
package arboles;

public class Probador {
    public static void main(String[] args) {
        arbol arb=new arbol();
        arb.insert(21);
        arb.insert(13);
        arb.insert(33);
        arb.insert(10);
        arb.insert(40);
        arb.insert(18);
        arb.insert(25);
        System.out.println("recorrido inorden");
        arb.inorden();
        System.out.println("recorrido postorden");
        arb.postorden();
        System.out.println("recorrido preorden");
        arb.preorden();
        System.out.println("buscar :");
        System.out.println("el numero 1"+arb.existe(1));
        System.out.println("el numero 33"+arb.existe(33));
        System.out.println("el numero 7"+arb.existe(7));
        System.out.println("el numero 40"+arb.existe(40));
        System.exit(0);
    }
}
