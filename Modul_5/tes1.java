/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JoptionPane;

/**
 *
 * @author susan
 */
import javax.swing.JOptionPane;
public class tes1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputNama  = JOptionPane.showInputDialog("Masukan nama");
        String inputBp = JOptionPane.showInputDialog("Masukan No Bp");
        
        System.out.println(inputNama);
        System.out.println(inputBp);
    }
}
