/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UASPaketB.DAO;

import java.util.ArrayList;
import java.util.List;
import tes.Model.Warnet;

/**
 *
 * @author user
 */
public class WarnetDaoImp1 implements WarnetDao{
    List<Warnet> data = new ArrayList<>();
    
  
    public Warnet save(Warnet warnet){
        data.add(warnet);
        return warnet;
    }
    
    public Warnet update(int index, Warnet warnet){
        data.set(index, warnet);
        return warnet;
    }
    
    public Warnet delete(int index){
        return data.remove(index);
    }
    
    public Warnet getWarnet (int index){
        return data.get(index);
    }
    
    public List<Warnet> getAllWarnet(){
        return data;
    }
}
