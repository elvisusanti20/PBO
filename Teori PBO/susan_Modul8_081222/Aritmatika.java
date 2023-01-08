/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8_081222;

/**
 *
 * @author Lenovo
 */
public class Aritmatika {
    public static void main(String[] args) {
        int a, b;
        int tambah, kurang, kali, bagi;
        
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        
        tambah = a + b;
        kurang = a - b;
        kali = a * b;
        bagi = a / b;
        
        System.out.println("Sum = "+tambah);
        System.out.println("Difference = "+kurang);
        System.out.println("Product = "+kali);
        System.out.println("Quotient = "+bagi);
    }
}
