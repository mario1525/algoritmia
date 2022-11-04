
package arboles;


public class Nodo {
    private int dato;
    private Nodo izq;
    private Nodo drc;

    public Nodo(int dato) {
        this.dato = dato;
        this.izq = null;
        this.drc = null;

    }

    

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDrc() {
        return drc;
    }

    public void setDrc(Nodo drc) {
        this.drc = drc;
    }
    
    public void impData(){
        System.out.print(this.getDato()+" ");
    }

    
}


