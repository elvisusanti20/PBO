/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uts_pbo;

/**
 *
 * @author elvi 
 */
public class examplehotel {
    import java.util.Scanner;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hotel example = new Hotel();
        
        String kodePesan,tglPesan,kodePelanggan;
        int jenisKamar;
        double tarif,diskon,total;
        
        System.out.print("Masukkan Kode Pesan : ");
        kodePesan=in.nextLine();
        System.out.print("Masukkan Tanggal Pesan : ");
        tglPesan=in.nextLine();
        System.out.print("Masukkan Kode Pelanggan: ");
        kodePelanggan=in.nextLine();
        System.out.print("Masukkan Jenis Kamar : ");
        jenisKamar=in.nextInt();
        System.out.print("\n\n");
        
        example.setKodePesan(kodePesan);
        example.setTglPesan(tglPesan);
        example.setKodePelanggan(kodePelanggan);
        example.setJenisKamar(jenisKamar);
        
        example.print();
    }
}

