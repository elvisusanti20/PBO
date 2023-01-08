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
public class Circle extends Shape{
    private int sisi;
    
    public Circle(){
        
    }
    
    public Circle(int sisi){
        this.sisi = sisi;
    }
    
    @Override
     public String getName(){
        return name;
    }

    @Override
    public int getArea(){
        return area;
    }
    
    public static void main(String[] args) {
        Circle s = new Circle();
        
        s.name = "Lingkaran";
        s.area = 0;
        
        System.out.println("Nama Bangun Datar : "+s.name);
        System.out.println("Banyak Sisi       : "+s.area+" Sisi");
    }
    
}