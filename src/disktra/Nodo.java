package disktra;
import java.util.Comparator;

public class Nodo implements Comparator<Nodo> {
    public int n ,cuota;

    public Nodo() {
    }

    public Nodo(int n, int cuota) {
        this.n = n;
        this.cuota = cuota;
    }

    public  int compare(Nodo t1, Nodo t2){
        if (t1.cuota < t2.cuota)
            return -1;
        if (t1.cuota> t2.cuota)
            return 1;
        return 0;
    }
}
