/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UASPaketB.Dao;

import tes.Model.Pelanggan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class PelangganDaoImpl implements PelangganDao{
    List<Pelanggan> data = new ArrayList<>();
    
    public PelangganDaoImpl(){
        data.add(new Pelanggan("2028", "susan", "1"));
        data.add(new Pelanggan("2029", "tika", "2"));
        data.add(new Pelanggan("2067", "naya", "Other"));
    }
    
   
    public Pelanggan save(Pelanggan pelanggan){
        data.add(pelanggan);
        return pelanggan;
    }
    
    public Pelanggan update(int index, Pelanggan pelanggan){
        data.set(index, pelanggan);
        return pelanggan;
    }
    
    public Pelanggan delete(int index){
        return data.remove(index);
    }
    
    public Pelanggan getPelanggan (int index){
        return data.get(index);
    }
    
    public List<Pelanggan> getAllPelanggan(){
        return data;
    }
}
