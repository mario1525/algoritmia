package listaCirulares;

import javax.swing.JOptionPane;
import listas.listas;

public class main {

    public static void main(String[] args) {

        listas list = new listas();
        int op = 0;
        while (op != 6) {
            op = leerEntero("Menu\n 1 agregar al inicio \n"
                    + "2 agregar a el final \n"
                    + "3 Mostrar \n"
                    + "4 eliminar por posicion \n"
                    + "5 eliminar lista \n"
                    + "6 salir");
            switch (op) {
                case 1:
                    int num2 = leerEntero("digite el numero ");
                    list.addini(num2);
                    break;
                case 2:
                    int num = leerEntero("digite el numero ");
                    list.addFin(num);
                    break;
                case 3:
                    list.mostrarlist();
                    break;
                case 4:
                    int pos = leerEntero("digite la posicion");
                    list.dropPos(pos);
                    break;
                case 5:
                    break;
                case 6:
                    Mostrar("fin del programa");
                    break;
                default:
                    Mostrar("opcion invalida");
                    break;
            }
        }
    }

    static String leerString(String texto) {
        return JOptionPane.showInputDialog(texto);
    }

    static int leerEntero(String texto) {
        return Integer.parseInt(JOptionPane.showInputDialog(texto));
    }

    static void Mostrar(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

}
