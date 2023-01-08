/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Susan260922;

/**
 *
 * @author Lenovo
 */
public class Mainn {
    public static void main(String[] args){
        
        Manusia m = new Manusia();
        
        m.set_nama("Budi");
        System.out.println("Nama         = "+m.get_nama());
        
        m.set_tinggi(180);
        System.out.println("Tinggi Badan = "+m.get_tinggi()+" cm");
        
        m.set_berat(58);
        System.out.println("Berat Badan  = "+m.get_berat()+" kg");
        
        m.set_kulit("Coklat Terang");
        System.out.println("Warna Kulit  = "+m.get_kulit());
        
    }
}
