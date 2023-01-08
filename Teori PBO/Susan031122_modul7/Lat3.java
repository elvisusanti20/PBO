/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Susan031122_modul7;


/**
 *
 * @author Lenovo
 */
public class Lat3 {
    public static void main(String[] args) {
        String[][] A = {{"Florence", "735-1234", "Manila"},
                          {"Joyce", "983-3333", "Quezon City"},
                          {"Becca", "456-3322", "Manila"}};
        
        for(int i=0; i<3; i++){
            System.out.println("Name        : "+A[i][0]);
            System.out.println("Tel. #      : "+A[i][1]);
            System.out.println("Address     : "+A[i][2]);
            System.out.println("\n");
        }
        
        
    }
}
