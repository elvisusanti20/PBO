/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul8;

/**
 *
 * @author M3400QA
 */
public class Aritmatika {
    public static void main(String[] args) {
        int a,b;
        int sum, difference, product, quotient;
        
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        
        sum = a + b;
        difference = a - b;
        product = a * b;
        quotient = a / b;
        
        System.out.println("Sum = "+sum);
        System.out.println("Difference = "+difference);
        System.out.println("Product = "+product);
        System.out.println("Quotient = "+quotient);
    }
}
