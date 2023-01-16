/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UASPaketB.DAO;

import tes.Model.Pelanggan;
import java.util.List;

/**
 *
 * @author user
 */
public interface PelangganDao {
    Pelanggan save(Pelanggan pelanggan);
    Pelanggan update(int index, Pelanggan pelanggan);
    Pelanggan delete(int index);
    Pelanggan getPelanggan(int index);
    List<Pelanggan> getAllPelanggan();
}
