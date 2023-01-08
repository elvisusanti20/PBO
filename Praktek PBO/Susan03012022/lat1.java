/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Susan03012022;

/**
 *
 * @author M3400QA
 */
class Hewan{
  public void Makan(){
      System.out.println("Makan");
  }
}

class Kambing extends Hewan{
    public void Rumput(){
        System.out.println("Rumput");
    }
}

class Singa extends Hewan{
    public void Daging(){
        System.out.println("Daging");
    }
}

public class lat1 {
    public static void main(String[] args) {
        Kambing kam = new Kambing();
        Singa singa = new Singa();
        int in = 5;
        
        for(int i=0; i<in; i++){
            if(i >  in)
            {
                System.out.print("Singa ");singa.Makan();singa.Daging();
            }
            else if(i < in)
            {
                System.out.print("Kambing ");kam.Makan();kam.Rumput();
            }
        }
    }
}
