package algoritmia;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class list2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos;
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos "));

        arreglo = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.println((i + 1) + " Digite un numero");
            arreglo[i] = entrada.nextInt();

        }

        for (int i = 0; i < (nElementos - 1); i++) {
            for (int j = 0; j < (nElementos - 1); j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }

        }
        System.out.print("\narreglo ordenado en forma original ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println("\narreglo ordenado en forma ordenada");
        for (int i = (nElementos - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println("");
    }

    public void ordenar(int nElementos) {
        int arreglo[] = null;
        for (int i = 0; i < (nElementos - 1); i++) {
            for (int j = 0; j < (nElementos - 1); j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }

        }
        for (int i = (nElementos - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }
    }

}
