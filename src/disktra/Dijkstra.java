package disktra;

import java.util.*;

public class Dijkstra {
    public int  dist[];
    private Set<Integer> setid;
    private PriorityQueue<Nodo> pQue;
    private int totalNod;
    List<List<Nodo>> adyacente;

    public Dijkstra( int totalNod) {

        this.totalNod = totalNod;
        this.adyacente = adyacente;
        dist = new int[totalNod];
        setid = new HashSet<Integer>();
        pQue = new PriorityQueue<Nodo>(totalNod,new Nodo());

    }

    public void dijkstra(List<List<Nodo>> adyacente,int s) {
        this.adyacente = adyacente;
        for (int i =0;i<totalNod;i++ ){
            dist[i] = Integer.MAX_VALUE;
        }
        pQue.add(new Nodo(s,0));
        dist[s] = 0;
        while (setid.size()!= totalNod){
            if (pQue.isEmpty())
                return;
            int ux = pQue.remove().n;
            if (setid.contains(ux))
                continue;
            setid.add(ux);
            vecinos(ux);
        }
    }

    public void vecinos(int ux ){
       int borderdist = -1;
       int newdist = -1;
       for (int i = 0; i< adyacente.get(ux).size();i++ ){
           Nodo vx = adyacente.get(ux).get(i);
           if (!setid.contains(vx.n)){
               borderdist = vx.cuota;
               newdist = dist[ux] + borderdist;
               if (newdist<dist[vx.n])
                   dist[vx.n]= newdist;
               pQue.add(new Nodo(vx.n, dist[vx.n]));
           }
       }
    }
}
