package arboles;

public class arbol {

    private Nodo raiz;

    public arbol() {
    }

    public boolean existe(int Bus) {
        return existe(this.raiz, Bus);
    }

    private boolean existe(Nodo n, int bus) {
        if (n == null) {
            return false;
        }
        if (n.getDato() == bus) {
            return true;
        } else if (bus < n.getDato()) {
            return existe(n.getIzq(), bus);
        } else {
            return existe(n.getDrc(), bus);
        }
    }

    public void insert(int dato) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato);
        } else {
            this.insert(this.raiz, dato);
        }
    }

    private void insert(Nodo padre, int dato) {
        if (dato > padre.getDato()) {
            if (padre.getDrc() == null) {
                padre.setDrc(new Nodo(dato));
            } else {
                this.insert(padre.getDrc(), dato);
            }
        } else {
            if (padre.getIzq() == null) {
                padre.setIzq(new Nodo(dato));
            } else {
                this.insert(padre.getIzq(), dato);
            }
        }
    }

    public void preorden() {
        this.preorden(this.raiz);
    }

    private void preorden(Nodo n) {
        if (n != null) {
            n.impData();
            preorden(n.getIzq());
            preorden(n.getDrc());
        }
    }

    public void inorden() {
        this.inorden(this.raiz);
    }

    private void inorden(Nodo n) {
        if (n != null) {
            inorden(n.getIzq());
            n.impData();            
            inorden(n.getDrc());
        }
    }
    
    public void postorden(){
        this.postorden(this.raiz);
    }
    
    private void postorden(Nodo n) {
        if (n != null) {
            postorden(n.getIzq());                        
            postorden(n.getDrc());
            n.impData();
        }
    }
}
