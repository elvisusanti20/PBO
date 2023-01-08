/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Susan171022;

/**
 *
 * @author M3400QA
 */
class Konversi{
    int cekekel(int c, int x){
        return c + x;
    }
    int cekere(int c, int x, int y){
        return c * (x / y);
    }
    int cekefah(int c, int x, int y, int z){
        return c * (x / y) + z;
    }
}
public class lat1 {
    public static void main(String[] args) {
        Konversi kvs = new Konversi();
        int in = 6;
        
        if(in >= 6){
            System.out.println(kvs.cekekel(4, 274));
        }
        else if(in >= 3){
            System.out.println(kvs.cekere(3, 4, 5));
        }
        else{
            System.out.println(kvs.cekefah(5, 9, 5, 30));
        }
    }
}