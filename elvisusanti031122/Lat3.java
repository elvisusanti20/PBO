/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elvisusanti031122;


/**
 *
 * @author Lenovo
 */
public class Lat3 {
    public static void main(String[] args) {
        String[][][] A = {{{"Florence", "735-1234", "Manila"},
                          {"Joyce", "983-3333", "Quezon City"},
                          {"Becca", "456-3322", "Manila"}}};
        
        
        System.out.println("Name        : "+A[0][0][0]);
        System.out.println("Tel. #      : "+A[0][0][1]);
        System.out.println("Address     : "+A[0][0][2]);
        
        
        System.out.println("\n\nName        : "+A[0][1][0]);
        System.out.println("Tel. #      : "+A[0][1][1]);
        System.out.println("Address     : "+A[0][1][2]);
        
        
        System.out.println("\n\nName        : "+A[0][2][0]);
        System.out.println("Tel. #      : "+A[0][2][1]);
        System.out.println("Address     : "+A[0][2][2]);
        
        
        
    }
}
