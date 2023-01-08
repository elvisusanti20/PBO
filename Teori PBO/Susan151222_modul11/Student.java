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
public class Student extends Person{
    private String nobp;
    
    public Student(){
        super("Anna","Padang");
        System.out.println("Inside Student : Constructor");
    }
    
    @Override
    public String getName(){ 
        System.out.println("getName Student");
        return name; 
    } 
    
    public String getNobp(){
        return nobp;
    }
    
    public void setNobp(String nobp){
        this.nobp = nobp;
    }
    
    public static void main(String[] args) {
        Student anna = new Student();
//        
//        anna.name = "Anna";
//        anna.address = "Padang";
//        anna.nobp = "2101093020"; 
        System.out.println(anna.name);
//        System.out.println(anna.address);
//        System.out.println(anna.nobp);
        
    }
    
}
