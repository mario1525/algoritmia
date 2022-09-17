package listaCirulares;

public class lista extends Nodo {

    private Nodo inicio;
    private Nodo fin;
    private int tam;

    public lista() {
        inicio = null;
        fin = null;
        tam = 0;
    }

    public boolean vacia() {
        return inicio == null;
    }

    public int tamanio() {
        return tam;
    }

    public void addFin(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;
            fin.setSiguiente(nuevo);
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
            fin = nuevo;
        }

        tam++;
    }

    public void addini(int valor) {
        Nodo N = new Nodo();
        N.setValor(valor);

        if (vacia()) {
            inicio = N;
            fin = N;
            fin.setSiguiente(N);
        } else {
            N.setSiguiente(inicio);
            inicio = N;
            fin.setSiguiente(inicio);
        }
        tam++;
    }

    public void dropPos(int posicion) {
        if ((posicion >= 0) && (posicion < tam)) {
            if (posicion == 0) {
                inicio = inicio.getSiguiente();
                fin.setSiguiente(inicio);
            } else {
                Nodo aux = inicio;
                for (int i = 0; i < posicion - 1; i++) {
                    aux = aux.getSiguiente();
                }
                if (aux.getSiguiente() == fin) {
                    aux.setSiguiente(inicio);
                } else {
                    Nodo sig = aux.getSiguiente();
                    aux.setSiguiente(sig.getSiguiente());
                }
            }
            tam--;
        }
    }

    public void mostrarlist() {
        if (!vacia()) {
            Nodo aux = inicio;
            int i = 0;
            while (aux != fin) {
                System.out.print(i + ".[" + aux.getValor() + "] ->");
                aux = aux.getSiguiente();
                i++;
            }

        }
    }

    public void dropList() {
        inicio = null;
        fin= null;
        tam = 0;
    }
}
