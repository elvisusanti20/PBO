/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Susan151222_modul11;

/**
 *
 * @author Lenovo
 */
public class LineExample {
    public static void main(String[] args) {
        Line line1 = new Line(1,4,1,1);
        Line line2 = new Line(1,5,1,3);
        Relation r = new Line();
        
        boolean hasil = r.isGreater(line1, line2);
        System.out.println("Line 1 " +line1.getLength() );
        System.out.println("Line 2 " +line2.getLength() );
        System.out.println(hasil);
        
    }
}
