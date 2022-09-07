package algoritmia;

import javax.swing.JOptionPane;

/**
 * 
 * @author Mario Beltran
 *         Robert Machacon
 */

public class conver {

    public static void main(String[] args) {

        int i, Num, Dec, Uni;
        String rom = " ";
        Num = Integer.parseInt(JOptionPane.showInputDialog("dijite un numero"));

        Dec = Num / 10;
        Uni = Num - (Dec * 10);
        
        
            
            if (Dec == 10) {
            rom = rom + "C";
        } else if (Dec == 9) {
            rom = rom + "XC";
        } else if (Dec >= 5) {
            rom = rom + "L";
            for (i = 6; i <= Dec; i++) {
                rom = rom + "X";
            }
        } else if (Dec == 4) {
            rom = rom + "XL";
        } else {
            for (i = 1; i <= Dec; i++) {
                rom = rom + "X";
            }
        }

        if (Uni == 9) {
            rom = rom + "IX";
        } else if (Uni >= 5) {
            rom = rom + "V";
            for (i = 6; i <= Uni; i++) {
                rom = rom + "I";
            }
        } else if (Uni == 4) {
            rom = rom + "IV";
        } else {
            for (i = 1; i <= Uni; i++) {
                rom = rom + "I";
            }
        }

        System.out.print(rom);
            
            
              
    }

}
