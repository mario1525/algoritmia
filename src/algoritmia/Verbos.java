package algoritmia;

import javax.swing.JOptionPane;

/**
 * @author Mario Beltran Robert Machacon
 */
public class Verbos {

    public static void main(String[] args) {
        String entra = "";

        entra = JOptionPane.showInputDialog("dijite un verbo");

        if (entra.endsWith("ar")) {
            String pres = entra.replace("ar", "o");
            String pres2 = entra.replace("ar", "as");
            String pres3 = entra.replace("ar", "a");
            String pres4 = entra.replace("ar", "amos");
            String pres5 = entra.replace("ar", "ais");
            String pres6 = entra.replace("ar", "an");
            
            String pas = entra.replace("ar", "aban");
            String pas2 = entra.replace("ar", "abas");
            String pas3 = entra.replace("ar", "aba");
            String pas4 = entra.replace("ar", "abamos");
            String pas5 = entra.replace("ar", "abais");
            String pas6 = entra.replace("ar", "aban");
            
            String fut = entra.replace("ar", "are");
            String fut2 = entra.replace("ar", "aras");
            String fut3 = entra.replace("ar", "ara");
            String fut4 = entra.replace("ar", "aremos");
            String fut5 = entra.replace("ar", "areis");
            String fut6 = entra.replace("ar", "aran");

            JOptionPane.showMessageDialog(null, "\n presente:   " + " pasado:   " + " futuro:  "
                    + "\n yo                   || " + pres + "   ||  " + pas + "  ||  " + fut
                    + "\n tu                   || " + pres2 + "  ||  " + pas2 + "  ||  " + fut2
                    + "\n el/ella            || " + pres3 + "  ||  " + pas3 + "  ||  " + fut3
                    + "\n nosotros       || " + pres4 + "  ||  " + pas4 + "  ||  " + fut4
                    + "\n vosotros       || " + pres5 + "  ||  " + pas5 + "  ||  " + fut5
                    + "\n ellos/ellas    || " + pres6 + "  ||  " + pas6 + "  || " + fut6);
        } else {
            if (entra.endsWith("er")) {
            String pres = entra.replace("er", "o");
            String pres2 = entra.replace("er", "es");
            String pres3 = entra.replace("er", "e");
            String pres4 = entra.replace("er", "emos");
            String pres5 = entra.replace("er", "eis");
            String pres6 = entra.replace("er", "en");
            
            String fut = entra.replace("er", "ere");
            String fut2 = entra.replace("er", "eras");
            String fut3 = entra.replace("er", "era");
            String fut4 = entra.replace("er", "eremos");
            String fut5 = entra.replace("er", "ereis");
            String fut6 = entra.replace("er", "eran");
            
            String pas = entra.replace("er", "ia");
            String pas2 = entra.replace("er", "ias");
            String pas3 = entra.replace("er", "ia");
            String pas4 = entra.replace("er", "iamos");
            String pas5 = entra.replace("er", "ias");
            String pas6 = entra.replace("er", "ian");
            
            

            JOptionPane.showMessageDialog(null, "\n presente:    " + " pasado:    " + " futuro:   "
                    + "\n yo                   || " + pres + "   ||  " + pas + "  ||  " + fut
                    + "\n tu                   || " + pres2 + "  ||  " + pas2 + "  ||  " + fut2
                    + "\n el/ella            || " + pres3 + "  ||  " + pas3 + "  ||  " + fut3
                    + "\n nosotros       || " + pres4 + "  ||  " + pas4 + "  ||  " + fut4
                    + "\n vosotros       || " + pres5 + "  ||  " + pas5 + "  ||  " + fut5
                    + "\n ellos/ellas    || " + pres6 + "  ||  " + pas6 + "  || " + fut6);
            } else {
                if (entra.endsWith("ir")) {
            String pres = entra.replace("eir", "io");
            String pres2 = entra.replace("eir", "ies");
            String pres3 = entra.replace("eir", "ie");
            String pres4 = entra.replace("ir", "imos");
            String pres5 = entra.replace("ir", "is");
            String pres6 = entra.replace("ir", "en");
            
            String pas = entra.replace("ir", "ire");
            String pas2 = entra.replace("ir", "iras");
            String pas3 = entra.replace("ir", "ira");
            String pas4 = entra.replace("ir", "iremos");
            String pas5 = entra.replace("ir", "ireis");
            String pas6 = entra.replace("ir", "iran");
            
            String fut = entra.replace("ir", "ia");
            String fut2 = entra.replace("ir", "ias");
            String fut3 = entra.replace("ir", "ia");
            String fut4 = entra.replace("ir", "iamos");
            String fut5 = entra.replace("ir", "iais");
            String fut6 = entra.replace("ir", "ian");

            JOptionPane.showMessageDialog(null, "\n presente:   " + " pasado:   " + " futuro:  "
                    + "\n yo                   || " + pres + "   ||  " + pas + "  ||  " + fut
                    + "\n tu                   || " + pres2 + "  ||  " + pas2 + "  ||  " + fut2
                    + "\n el/ella            || " + pres3 + "  ||  " + pas3 + "  ||  " + fut3
                    + "\n nosotros       || " + pres4 + "  ||  " + pas4 + "  ||  " + fut4
                    + "\n vosotros       || " + pres5 + "  ||  " + pas5 + "  ||  " + fut5
                    + "\n ellos/ellas    || " + pres6 + "  ||  " + pas6 + "  || " + fut6);
                } else {
                    JOptionPane.showMessageDialog(null, "este no es un verbo regular");
                }
            }

        }

    }

}
