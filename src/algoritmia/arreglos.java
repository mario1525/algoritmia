package algoritmia;

import javax.swing.JOptionPane;

public class arreglos {

    public static void main(String[] args) {
        //cree un programa que lea un vector unidimensional de numeros y ejecute las siguientes 
        //opciones de menu

        int N = 10;
        int[] v = new int[N];
        int men = -1;
        String option;
        String[] opciones = {
            "1. llenar vector.\n",
            "2. recorrer de izquierda a derecha .\n",
            "3. recorrer de derecha a izquierda .\n",
            "4. verificar si es palindrome .\n",
            "5. proomedio del vector.\n",
            "6. posiciones pares .\n",
            "7. posiciones impares.\n",
            "8. Salir."
        };

        while (men != 8) {
            option = (String) JOptionPane.showInputDialog(null, "escoja una opcion del menu",
                    "prueba vector",
                    JOptionPane.DEFAULT_OPTION,
                    null,
                    opciones,
                    opciones[0]);
            men = Integer.parseInt("" + option.charAt(0));
            switch (men) {

                case 1:
                    try{
                       N = Integer.parseInt(JOptionPane.showInputDialog("dijite el tamaño del vector")); 
                    }catch(NumberFormatException e){
                        N = 4;
                        e.printStackTrace();
                    }
                    
                    int p;
                    for (int i = 0; i < N; i++) {
                        p = Integer.parseInt(JOptionPane.showInputDialog("dijite el valor"));
                        v[i] = p;
                    }
                    break;
                case 2: {
                    String str = "[";
                    for (int i = 0; i < N; i++) {
                        str = str+ v[i] + ",";
                    }
                    str += "]";
                    JOptionPane.showMessageDialog(null, str);
                }
                break;

                case 3:
                    String str2 = "[";
                    for (int i = N - 1; i >= 0; i--) {
                        str2 = str2+ v[i] + ",";
                    }
                    str2 += "]";
                    JOptionPane.showMessageDialog(null, str2);
                    break;
                case 4:
                    int izq = 0,
                     der = N - 1;
                    while (true) {
                        if (v[izq] != v[der]) {
                            JOptionPane.showMessageDialog(null, "no es palindrome");
                            break;
                        }
                        izq++;
                        der--;
                        if (izq > N - 1) {
                            JOptionPane.showMessageDialog(null, "es palindrome");
                            break;
                        }
                    }
                    break;
                case 5:
                    int cont = 0;
                    int prom;
                    for (int i = 0; i < N; i = i++) {
                        cont += v[i];
                    }
                    prom = cont / N;
                    JOptionPane.showMessageDialog(null, "el promedio es" + prom);
                    break;
                case 6:
                    String par =" ";
                    for (int i = 0; i < N;  i += 2) {
                        par += v[i]+","; 
                    }
                    JOptionPane.showMessageDialog(null, par);
                    break;
                case 7:
                    String inpar =" ";
                    for (int i = 0; i < N;  i++) {
                        if (i%2 !=0){
                           inpar += v[i]+","; 
                        }                         
                    }
                    JOptionPane.showMessageDialog(null, inpar);
                    break;
                case 8:

                    break;
            }
        }
        System.exit(0);
    }
}
