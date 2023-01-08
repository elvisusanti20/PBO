/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Susan151222_modul11;

/**
 *
 * @author Lenovo
 */
public class PengetahuanKomputer extends StudentRecord{
    
    private int nim;
    private int praktek;
    private int teori;
    private String tingkat;
    private int hasil;
    
    public PengetahuanKomputer(){
        super("Anna","Padang");
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public String getAddress(){
        return address;
    }
    
    @Override
    public int getAge(){
        return age;
    }
    
    public int getNim(){
        return nim;
    }
    
    public void setNim(int nim){
        this.nim = nim;
    }
    
    public int getPraktek(){
        return praktek;
    }
    
    public void setPraktek(int praktek){
        this.praktek = praktek;
    }
    
    public int getTeori(){
        return teori;
    }
    
    public void setTeori(int teori){
        this.teori = teori;
    }
    
    public String getTingkat(){
        hasil = (praktek + teori) / 2;
        tingkat = (hasil <= 50)?"Pemula":(hasil<=80)?"Middle":(hasil>80)?"Profesional":"Awam";
        return tingkat;
    }
    
    
    public static void main(String[] args) {
        PengetahuanKomputer pk = new PengetahuanKomputer();
        
        pk.name = "Elvi Susanti";
        pk.nim = 123456;
        pk.address = "Padang";
        pk.age = 19;
        pk.praktek = 95;
        pk.teori = 95;
        
        System.out.println("Nama          : "+pk.name);
        System.out.println("Nim           : "+pk.nim);
        System.out.println("Alamat        : "+pk.address);
        System.out.println("Umur          : "+pk.age);
        System.out.println("Nilai Praktek : "+pk.praktek);
        System.out.println("Nilai Teori   : "+pk.teori);
        System.out.println("Tingkatan     : "+pk.getTingkat());
    }
   
}
