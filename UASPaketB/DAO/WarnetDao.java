/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UASPaketB.DAO;

import tes.Model.Warnet;
import java.util.List;

/**
 *
 * @author user
 */
public interface WarnetDao {
    Warnet save(Warnet warnet);
    Warnet update(int index, Warnet warnet);
    Warnet delete(int index);
    Warnet getWarnet(int index);
    List<Warnet> getAllWarnet();
}
