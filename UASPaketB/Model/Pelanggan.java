/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UASPaketB.Model;

/**
 *
 * @author user
 */
public class Pelanggan {
    private String kodePelanggan;
    private String namaPelanggan;
    private String jenisPelanggan;
    
    public Pelanggan(){
    
    }

    public Pelanggan(String kodePelanggan, String namaPelanggan, String jenisPelanggan) {
        this.kodePelanggan = kodePelanggan;
        this.namaPelanggan = namaPelanggan;
        this.jenisPelanggan = jenisPelanggan;
    }
     
    public String getKodePelanggan(){
        return kodePelanggan;
    }
    
    public void setKodePelanggan (String kodePelanggan){
        this.kodePelanggan = kodePelanggan;
    }
    
    public String getNamaPelanggan(){
        return namaPelanggan;
    }
    
    public void setNamaPelanggan (String namaPelanggan){
        this.namaPelanggan = namaPelanggan;
    }
    
    public String getJenisPelanggan(){
        return jenisPelanggan;
    }
    
    public void setJenisPelanggan (String jenisPelanggan){
        this.jenisPelanggan = jenisPelanggan;
    }
}
