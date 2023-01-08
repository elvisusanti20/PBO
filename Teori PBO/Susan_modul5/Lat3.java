/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Susan_modul5;

import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException;
public class Lat3 {
    public static void main( String[] args ){ 
 
    BufferedReader dataIn = new BufferedReader(new 
    InputStreamReader( System.in) ); 
    String word1 = "";
    String word2 = "";
    String word3 = "";
    
    System.out.print("Enter Word 1 : "); 
    try{ 
        word1 = dataIn.readLine(); 
    }   catch( IOException e ){ 
        System.out.println("Error!"); 
    } 
    System.out.print("Enter Word 2 : ");
    try{ 
        word2 = dataIn.readLine(); 
    }   catch( IOException e ){ 
        System.out.println("Error!"); 
    }
    System.out.print("Enter Word 3 : ");
    try{ 
        word3 = dataIn.readLine(); 
    }   catch( IOException e ){ 
        System.out.println("Error!"); 
    }
        System.out.println("\n"+word1+" "+word2+" "+word3);
 }
}
