/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Susan031122_modul7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Lat2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        int A[] = new int[100];
        
        for(int i=0; i<10; i++){
            System.out.print("Masukkan Angka "+(i+1)+" = ");
            try{
                A[i] = Integer.parseInt(dataIn.readLine());
            }catch( IOException e ){
                System.out.println("Error!!");
            }
        }
        
        int max = A[0];
        for(int i=0; i<10; i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        System.out.println("\nAngka Terbesar Adalah = "+max);
    }
}
