package tablasHash;

import java.util.*;

public class Hash {

    public static void main(String[] args) {
        Hashtable paises = new Hashtable();

        paises.put("es", "españa");
        paises.put("col","colombia");
        paises.put("us","Estados unidos");
        paises.put("AR","argentina");
        paises.put("fr","francia");

        String clave = "col";
        System.out.println("El valor de la clave es"+clave+" es "+ paises.get(clave));

        Enumeration e = paises.keys();
        while (e.hasMoreElements())
            System.out.println("clave: "+e.nextElement());

        Enumeration e2 = paises.elements();
        while (e2.hasMoreElements())
            System.out.println("valor: "+e2.nextElement());
    }
}
