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
public class Warnet {
    private String kode;
    private String jenis;
    private String pelanggan;
    private String tanggal;
    private String jamMasuk;
    private String jamKeluar;
    private String tarif;
    private int lama;
    private double total;    
    
    
    
    
    public String getKode(){
        return kode;
    }
    
    public void setKode (String kode){
        this.kode = kode;
    }

    public String getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }
    
    
    public String getJenisPelanggan(){
        return jenis;
    }
    
    public void setJenisPelanggan (String jenis){
        this.jenis = jenis;
    }
    
    public String getTanggalMasuk(){
        return tanggal;
    }
    
    public void setTanggalMasuk (String tanggal){
        this.tanggal = tanggal;
    }   
    
    public String getJamMasuk(){
        return jamMasuk;
    }
    
    public void setJamMasuk (String jamMasuk){
        this.jamMasuk = jamMasuk;
    }
    
    public String getJamKeluar(){
        return jamKeluar;
    }
    
    public void setJamKeluar (String jamKeluar){
        this.jamKeluar = jamKeluar;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }

    public String getTarif() {
        return tarif;
    }
    
    public int getLama(){
        lama = Integer.parseInt(jamKeluar) - Integer.parseInt(jamMasuk);
        
        if(Integer.parseInt(jamMasuk)>=Integer.parseInt(jamKeluar)){
            lama = (Integer.parseInt(jamKeluar)+24) - Integer.parseInt(jamMasuk);
        }
        return lama;
    }
    
    public double getTotal(){
        total = Double.parseDouble(tarif) * lama;
        if(jenis == "1"){
            total = total - (total * 0.02);
        }
        else if(jenis == "2"){
            total = total - (total * 0.05);
        }
        return total;
    }
}
