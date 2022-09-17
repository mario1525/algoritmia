package algoritmia;

import javax.swing.JOptionPane;

public class MatriZ {

    public static void main(String[] args) {
        String menu = "1. llenar Matriz \n 2. Imprimir Matriz \n 3. Cambiar Elementos \n"
                + "4. imprimir mayor \n 5. imprimir menor \n 6. imprimir vertices \n"
                + "7. salir";
        int op = 1, mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        int N = 0, M = 0, num;
        int matriz[][] = null;

        while (op != 8) {
            op = leerEntero(menu);
            switch (op) {
                case 1:
                    N = leerEntero("digite el numero de filas");
                    M = leerEntero("digite el numero de columnas");
                    matriz = new int[N][M];
                    for (int x = 0; x < N; x++) {
                        for (int y = 0; y < M; y++) {
                            matriz[x][y] = leerEntero("Digite el numero [" + x + "][" + y + "]");
                        }
                    }
                    break;
                case 2:
                    String temp = "";
                    for (int x = 0; x < N; x++) {
                        temp += "\n";
                        for (int y = 0; y < M; y++) {
                            temp += matriz[x][y] + " ";
                        }
                    }
                    Mostrar(temp);
                    break;
                case 3:
                    int f,
                     c;
                    f = leerEntero("digite el numero de fila a modificar");
                    c = leerEntero("digite el numero de columna que se va a modificar ");
                    num = leerEntero("digite el numero [" + f + "][" + c + "]");
                    matriz[f][c] = num;
                    break;
                case 4:
                    mayor = Integer.MIN_VALUE;
                    int fm = 0,
                     cm = 0;
                    for (int x = 0; x < N; x++) {
                        for (int y = 0; y < M; y++) {
                            if (matriz[x][y] >= mayor) {
                                mayor = matriz[x][y];
                                fm = x;
                                cm = y;
                            }
                        }
                    }
                    Mostrar("el mayor numero es:" + mayor + "ubicado en [" + fm + "][" + cm + "]");
                    break;
                case 5:
                    menor = Integer.MAX_VALUE;
                    int fmen = 0,
                     cmen = 0;
                    for (int x = 0; x < N; x++) {
                        for (int y = 0; y < M; y++) {
                            if (matriz[x][y] <= menor) {
                                menor = matriz[x][y];
                                fmen = x;
                                cmen = y;
                            }
                        }
                    }
                    Mostrar("el mayor numero es:" + menor + "ubicado en [" + fmen + "][" + cmen + "]");
                    break;
                case 6:
                    int v1,
                     v2,
                     v3,
                     v4;
                    v1 = matriz[0][0];
                    v2 = matriz[0][M - 1];
                    v3 = matriz[N - 1][0];
                    v4 = matriz[N - 1][M - 1];
                    Mostrar(v1 + " " + v2 + "\n" + v3 + " " + v4);
                    break;
                case 7:
                    diagonales(matriz);
                    break;
            }
        }
    }

    static void diagonales(int Matriz[][]) {

        String total1 = "";
        
        int[] diagoSecundaria = new int[Matriz.length];
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                if (i == j) {
                    total1 += Matriz[i][i] + " | ";
                }

                if (i + j == Matriz.length - 1) {
                    diagoSecundaria[i] = Matriz[i][j];

                }
            }
        }       
        
        String str = "[";
                    for (int i = 0; i < Matriz.length; i++) {
                        str = str+ diagoSecundaria[i] + ",";
                    }
                    str += "]";
                    
        Mostrar(str);            
        Mostrar(total1);
    }

    static int leerEntero(String texto) {
        return Integer.parseInt(JOptionPane.showInputDialog(texto));
    }

    static void Mostrar(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }
}
