/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_4;

/**
 *
 * @author Asusan
 */
public class lat3 {
    public static void main(String [] args)
    {
        int x = 10;
        int y = 23;
        int z = 5;
        int a;
        System.out.println("number 1 = "+x);
        System.out.println("number 2 = "+y);
        System.out.println("number 3 = "+z);
        a = (x>=y)? x:y;
        a = (z>=y)? z:y;
        System.out.println("nilai tertingginya adalah angka = "+a);
    }
}