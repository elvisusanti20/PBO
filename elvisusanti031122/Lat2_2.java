/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elvisusanti031122;

import javax.swing.JOptionPane;
public class Lat2_2 {
    public static void main(String[] args) {
        int A[] = new int[100];
        int i;
        for (i=0; i<10; i++){
            String input = JOptionPane.showInputDialog("Masukkan Angka "+(i+1));
            A[i] = Integer.parseInt(input);
        }
        
        int max = A[0];
        for(i=0; i<10; i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        
        
        String msg = A[0]+","+A[1]+","+A[2]+","+A[3]+","+A[4]+","+A[5]+","+A[6]+","+A[7]+","+A[8]+","+A[9]+"\n\nAngka Terbesar Adalah = "+max;
        
        JOptionPane.showMessageDialog(null, msg);
    }
}
