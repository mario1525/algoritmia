package algoritmia;

import javax.swing.JOptionPane;

public class NewClass {

    public static void main(String[] args) {
        int N, u,D;

        N = Integer.parseInt(JOptionPane.showInputDialog("dijite un numero"));

        if (N>110){
            System.out.print("fuera de rango");
        }else{           
        
            
        D = N / 10;
        
        u = N-(D*10);

        switch (D) {
            case 1:
                System.out.print("x");
                break;
            case 2:
                System.out.print("xx");
                break;
            case 3:
                System.out.print("xx");
                break;
            case 4:
                System.out.print("xL");
                break;
            case 5:
                System.out.print("L");
                break;
            case 6:
                System.out.print("LX");
                break;
            case 7:
                System.out.print("LXX");
                break;
            case 8:
                System.out.print("LXXX");
                break;
            case 9:
                System.out.print("XD");
                break;
            case 10:
                System.out.print("D");
                break;           
        }
        
        switch (u) {
            case 1:
                System.out.print("I");
                break;
            case 2:
                System.out.print("II");
                break;
            case 3:
                System.out.print("III");
                break;
            case 4:
                System.out.print("IV");
                break;
            case 5:
                System.out.print("V");
                break;
            case 6:
                System.out.print("VI");
                break;
            case 7:
                System.out.print("VII");
                break;
            case 8:
                System.out.print("VIII");
                break;
            case 9:
                System.out.print("IX");
                break;
            
            
        } 

    }
}
}