package algoritmia;

import javax.swing.JOptionPane;

public class triqui {

    public static void main(String[] args) {
        boolean op = true;
        double cont = 0;
        String matriz[][] = new String[3][3];
        while (op) {
            //pocision y jugar
            int N, M;

            N = leerEntero("digite la posicion de la fila");
            M = leerEntero("digite la poscion de  la columna");
            if (matriz[N][M] == null) {
                String tablero = "";
                String val = "X";
                if (cont % 2 == 0) {
                    val = " O ";
                } else {
                    val = " X ";
                }
                matriz[N][M] = val;
            } else {
                Mostrar("posicion ocupada ");
            }
            //imprimir tablero
            String tablero = "";
            for (int x = 0; x < 3; x++) {
                tablero += "\n";
                for (int y = 0; y < 3; y++) {
                    tablero += matriz[x][y] + " | ";
                }
            }
            Mostrar(tablero);

            //ganador del juego x            
            if (matriz[0][0] == " X " && matriz[1][0] == " X " && matriz[2][0] == " X ") {
                op = false;
                Mostrar("ganador X");
            } else {
                if (matriz[0][1] == " X " && matriz[1][1] == " X " && matriz[2][1] == " X ") {
                    op = false;
                    Mostrar("ganador X");
                } else {
                    if (matriz[0][2] == " X " && matriz[1][2] == " X " && matriz[2][2] == " X ") {
                        op = false;
                        Mostrar("ganador X");
                    } else {
                        if (matriz[0][0] == " X " && matriz[0][1] == " X " && matriz[0][2] == " X ") {
                            op = false;
                            Mostrar("ganador X");
                        } else {
                            if (matriz[1][0] == " X " && matriz[1][1] == " X " && matriz[1][2] == " X ") {
                                op = false;
                                Mostrar("ganador X");
                            } else {
                                if (matriz[2][0] == " X " && matriz[2][1] == " X " && matriz[2][2] == " X ") {
                                    op = false;
                                    Mostrar("ganador X");
                                } else {
                                    if (matriz[0][0] == " X " && matriz[1][1] == " X " && matriz[2][2] == " X ") {
                                        op = false;
                                        Mostrar("ganador X");
                                    } else {
                                        if (matriz[2][0] == " X " && matriz[1][1] == " X " && matriz[0][2] == " X ") {
                                            op = false;
                                            Mostrar("ganador X");
                                        } else {
                                            op = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            //ganador del juego o          
            if (matriz[0][0] == " O " && matriz[1][0] == " O " && matriz[2][0] == " O ") {
                op = false;
                Mostrar("ganador O");
            } else {
                if (matriz[0][1] == " O " && matriz[1][1] == " O " && matriz[2][1] == " O ") {
                    op = false;
                    Mostrar("ganador O");
                } else {
                    if (matriz[0][2] == " O " && matriz[1][2] == " O " && matriz[2][2] == " O ") {
                        op = false;
                        Mostrar("ganador O");
                    } else {
                        if (matriz[0][0] == " O " && matriz[0][1] == " O " && matriz[0][2] == " O ") {
                            op = false;
                            Mostrar("ganador O");
                        } else {
                            if (matriz[1][0] == " O " && matriz[1][1] == " O " && matriz[1][2] == " O ") {
                                op = false;
                                Mostrar("ganador O");
                            } else {
                                if (matriz[2][0] == " O " && matriz[2][1] == " O " && matriz[2][2] == " O ") {
                                    op = false;
                                    Mostrar("ganador O");
                                } else {
                                    if (matriz[0][0] == " O " && matriz[1][1] == " O " && matriz[2][2] == " O ") {
                                        op = false;
                                        Mostrar("ganador O");
                                    } else {
                                        if (matriz[2][0] == " O " && matriz[1][1] == " O " && matriz[0][2] == " O ") {
                                            op = false;
                                            Mostrar("ganador O");
                                        } else {
                                            op = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            //tablero lleno            
            int co = 0;
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {

                    if (matriz[x][y] != null) {
                        co += 1;
                    }
                }
            }
            if (co == 9) {
                op = false;
                Mostrar("tablero lleno");
            }
            cont++;
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
