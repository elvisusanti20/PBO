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
public class Shape{
   protected String name;
   protected int area;

   
    public Shape(){
        name = "";
    }
    
    public Shape(String name, int area){
        this.name = name;
        this.area = area;
    }
   
    public String getName(){
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getArea(){
        return area;
    }
    public void setArea(int area) {
        this.area = area;
    }
   
   
}