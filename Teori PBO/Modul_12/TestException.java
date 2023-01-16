/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_12;

/**
 *
 * @author 
 */
public class TestException {
    public static void main( String[] args ){
            try{
                for( int i=0; true; i++ ){
                    System.out.println("args["+i+"]="+
                    args[i]);
                }
            }
            catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Exception caught: \n\t java.lang.ArrayIndexOutOfBoundsException : "+ex.getMessage());
            }
            finally{
                System.out.println("Quiting...");
            }
    }
}
