package disktra;
import java.util.*;

public class Probador {

    public static void main(String[] args) {
        int totalnode = 7;
        int s = 0;
        List<List<Nodo>> adyacentes = new ArrayList<List<Nodo>>();
        for (int i = 0; i <totalnode;i++){
            List<Nodo> item = new ArrayList<Nodo>();
            adyacentes.add(item);
        }
        adyacentes.get(0).add(new Nodo(1,2));
        adyacentes.get(0).add(new Nodo(2,6));
        adyacentes.get(1).add(new Nodo(3,5));
        adyacentes.get(2).add(new Nodo(3,8));
        adyacentes.get(3).add(new Nodo(5,15));
        adyacentes.get(3).add(new Nodo(4,10));
        adyacentes.get(4).add(new Nodo(5,6));
        adyacentes.get(4).add(new Nodo(6,2));
        adyacentes.get(5).add(new Nodo(6,6));
        Dijkstra odj = new Dijkstra(totalnode);
        odj.dijkstra(adyacentes,s);
        System.out.println("recorrido mas corto");
        for (int i = 0; i< odj.dist.length;i++){
            System.out.println(s + "a"+i+ "="+odj.dist[i]);
        }
    }
}
