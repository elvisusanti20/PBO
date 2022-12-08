/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_7;

/**
 *
 * @author susan
 */
import javax.swing.JOptionPane;
public class NomorTerbesar {
    public static void main(String [] args) 
    { 
        final int jumData=10; 
        int [] arrData = new int[jumData]; 
        for(int i=0;i<jumData;i++)
        { 
            arrData[i]=Integer  .parseInt(JOptionPane  .showInputDialog("Masukkan nilai "+(i+1))); 
        }
        int terbesar=arrData[0];
        for(int i=1;i<jumData;i++){ if (arrData[i]>terbesar){ terbesar=arrData[i]; }
        } 
        JOptionPane .showMessageDialog(null, "Nilai terbesar adalah "+terbesar);
    } 
}

