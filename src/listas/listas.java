package listas;

public class listas {

    private Nodo inicio;
    private int tamanio;

    public listas() {
        inicio = null;
        tamanio = 0;
    }

    public boolean vacia() {
        return inicio == null;
    }

    public int tamanio() {
        return tamanio;
    }

    public void addFin(int valor) {
        Nodo N = new Nodo();
        N.setValor(valor);

        if (vacia()) {
            inicio = N;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(N);
        }
        tamanio++;
    }

    public void dropList() {
        inicio = null;
        tamanio = 0;
    }

    public void dropPos(int posicion) {
        if ((posicion >= 0) && (posicion < tamanio)) {
            if (posicion == 0) {
                inicio = inicio.getSiguiente();
            }else{
                Nodo aux =inicio;
                for(int i =0; i<posicion-1;i++){
                    aux = aux.getSiguiente();
                }
                Nodo sig = aux.getSiguiente();
                aux.setSiguiente(sig.getSiguiente());
            }
            tamanio--;
        }
    }

    public void mostrarlist() {
        if (!vacia()) {
            Nodo aux = inicio;
            int i = 0;
            while (aux != null) {
                System.out.println(i + ".[" + aux.getValor() + "] ->");
                aux = aux.getSiguiente();
                i++;
            }

        }
    }

    public void addini(int valor) {
        Nodo N = new Nodo();
        N.setValor(valor);

        if (vacia()) {
            inicio = N;
        } else {
            N.setSiguiente(inicio);
            inicio = N;
        }
        tamanio++;
    }
}
