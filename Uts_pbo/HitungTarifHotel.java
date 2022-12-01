/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abennaya
 */
    public class HitungTarifHotel extends EntitasSewaHotel{
    private int tarif;
    private double diskon;
    private double bayar;
    private String kamar;

    public HitungTarifHotel() {
    }
        
    public int get_tarif(){
        if(jenis==1){
            //kamar="Deluxe ";
            tarif = lama*600000;
        }  
        else if (jenis==2){
            //kamar="Suite";
            tarif = lama*700000;
        }
        else{
        }
        return tarif;
    }

    public String get_kamar(){
        if(jenis==1){
            kamar="Kamar Biasa";
        }  
        else if (jenis==2){
            kamar="Kamar Premium";
        }
        else{
        }
        return kamar;
    }


    public double get_diskon(){
        if (status==1){
            diskon = 0.02 * tarif;
            }
        else if (status==2){
            diskon = 0.03 * tarif;
            }
        return diskon;
    }
    
    public double get_bayar(){
        return tarif-diskon;
    }  
} 

