/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teori271022;

import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException;
public class Lat1 {
    public static void main(String[] args ){ 
 
    BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in) ); 
    int r;
    String o;
    int nilai1 = 0;
    int nilai2 = 0;
    int nilai3 = 0;
    
    
    System.out.print("Masukkan Nilai PBO = "); 
    try{  
        nilai1 = Integer.parseInt(dataIn.readLine());
    }   catch( IOException e ){ 
        System.out.println("Error!"); 
    } 
    System.out.print("Masukkan Nilai APSI = "); 
    try{  
        nilai2 = Integer.parseInt(dataIn.readLine());
    }   catch( IOException e ){ 
        System.out.println("Error!"); 
    }
    System.out.print("Masukkan Nilai PROBSTAT = "); 
    try{  
        nilai3 = Integer.parseInt(dataIn.readLine());
    }   catch( IOException e ){ 
        System.out.println("Error!"); 
    }
    
    r = (nilai1 + nilai2 + nilai3) / 3;
    
    o = (r >= 60)?"Rata Rata Diatas 60 :)":"Rata Rata Dibawah 60 :-(";
    
    System.out.println(o);
        
 }
}
