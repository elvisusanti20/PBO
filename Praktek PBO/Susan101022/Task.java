/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Susan101022;

/**
 *
 * @author M3400QA
 */
class Family{
    public String nama;
    public int umur;
    public String pekerjaan;
    public String pendidikan;
}

class Bapak extends Family{
    public void Bpk(){
        nama = "Anto";
        umur = 37;
        pekerjaan = "Pengusaha Batu Akik";
        System.out.println("Nama Bapak = "+nama);
        System.out.println("Umur Bapak = "+umur);
        System.out.println("Pekerjaan Bapak = "+pekerjaan);
    }
    
}
class Ibu extends Family{
    public void IRT(){
        nama = "Elvi";
        umur = 36;
        pekerjaan = "Ibu Rumah Tangga";
        System.out.println("Nama Ibu = "+nama);
        System.out.println("Umur Ibu = "+umur);
        System.out.println("Pekerjaan Ibu = "+pekerjaan);
    }
    
}

class Kakak extends Family{
    public void anak1(){
        nama = "Susan";
        umur = 13;
        pendidikan = "SMP";
        System.out.println("Nama Kakak = "+nama);
        System.out.println("Umur Kakak = "+umur);
        System.out.println("Pendidikan Kakak = "+pendidikan);
    }
    
}

class Adek extends Family{
    public void anak2(){
        nama = "tika";
        umur = 8;
        pendidikan = "SD";
        
        System.out.println("Nama Adek = "+nama);
        System.out.println("Umur Adek = "+umur);
        System.out.println("Pendidikan Adek = "+pendidikan);
    }
}

public class Task {
    public static void main(String[] args){
        Bapak bapak = new Bapak();
        Ibu ibu = new Ibu();
        Kakak kakak = new Kakak();
        Adek adek = new Adek();
        int in = 4;
        
        System.out.println("=== Biodata Keluarga Bahagia ===\n");
        for(int i=1; i<=in; i++){
            if(in == 1)
            {
                System.out.println("==== BAPAK ====");
                bapak.Bpk();
                System.out.println("");
            }
            else if(in == 2){
                System.out.println("==== IBU ====");
                ibu.IRT();
                System.out.println("");
            }
            else if(in == 3){
                System.out.println("==== KAKAK ====");
                kakak.anak1();
                System.out.println("");
            }
            else{
                System.out.println("==== ADEK ====");
                adek.anak2();
                System.out.println("");
            }
        }
    }
}

