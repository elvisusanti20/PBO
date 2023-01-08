/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Susan271022_modul6;

import javax.swing.JOptionPane;
public class Lat2 {
    public static void main(String[] args) {
        int a1, a2, a3, r;
        String o;
        String input;
        
        input = JOptionPane.showInputDialog("Masukkan Nilai PBO");
        a1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Masukkan Nilai APSI");
        a2 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Masukkan Nilai PROBSTAT");
        a3 = Integer.parseInt(input);
        
        r = (a1+a2+a3) / 3;
        
        o = (r >= 60)?"Rata Rata Diatas 60 :)":"Rata Rata Dibawah 60 :-(";
        String msg = o;
        
        JOptionPane.showMessageDialog(null, msg);
    }
}
