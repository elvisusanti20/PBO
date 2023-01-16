/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UASPaketB.Controller;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tes.Model.*;
import tes.DAO.*;
import tes.View.FormWarnet;

/**
 *
 * @author LENOVO
 */
public class WarnetController {
    private FormWarnet formWarnet;
    private PelangganDao pelangganDao;
    private WarnetDao warnetDao;
    private Warnet warnet;
    
    public WarnetController(FormWarnet formWarnet){
        this.formWarnet = formWarnet;
        pelangganDao = new PelangganDaoImpl();
        warnetDao = new WarnetDaoImp1();
    }
    
    public void setCboPelanggan(){
        formWarnet.getCboPelanggan().removeAllItems();
        List<Pelanggan> list = pelangganDao.getAllPelanggan();
        for (Pelanggan pelanggan : list){
            formWarnet.getCboPelanggan().addItem(pelanggan.getKodePelanggan()+"-"+pelanggan.getNamaPelanggan());
        }
    }
    
    public void setCboJenisPelanggan(){
        formWarnet.getCboJenisPelanggan().removeAllItems();
        List<Pelanggan> list = pelangganDao.getAllPelanggan();
        for (Pelanggan pelanggan : list){
            formWarnet.getCboJenisPelanggan().addItem(pelanggan.getJenisPelanggan());
        }
    }
    
    public void bersihForm(){
        formWarnet.getTxtKode().setText("");
        formWarnet.getTxtTanggalMasuk().setText("");
        formWarnet.getTxtJamMasuk().setText("");
        formWarnet.getTxtJamKeluar().setText("");
        formWarnet.getTxtTarif().setText("");
    }
    
    public void getWarnet(){
        int index = formWarnet.getTblWarnet().getSelectedRow();
        warnet = warnetDao.getWarnet(index);
        formWarnet.getTxtKode().setText(warnet.getKode());
        if(warnet != null){
            List<Pelanggan> listPelanggan = pelangganDao.getAllPelanggan();
            for(Pelanggan pelanggan:listPelanggan){
                if(warnet.getKode()==pelanggan.getKodePelanggan()){
                    formWarnet.getCboPelanggan().setSelectedItem(pelanggan.getKodePelanggan()+"-"+pelanggan.getNamaPelanggan());
                    break;
                }
            }
            formWarnet.getCboJenisPelanggan().setSelectedItem(warnet.getJenisPelanggan());
            formWarnet.getTxtTanggalMasuk().setText(warnet.getTanggalMasuk());
            formWarnet.getTxtJamMasuk().setText(warnet.getJamMasuk());
            formWarnet.getTxtJamKeluar().setText(warnet.getJamKeluar());
            formWarnet.getTxtTarif().setText(warnet.getTarif());
        }
    }
    
    public void saveWarnet(){
        warnet = new Warnet();
        warnet.setKode(formWarnet.getTxtKode().getText());
        warnet.setPelanggan(formWarnet.getCboPelanggan().getSelectedItem().toString());
        warnet.setJenisPelanggan(formWarnet.getCboJenisPelanggan().getSelectedItem().toString());
        warnet.setTanggalMasuk(formWarnet.getTxtTanggalMasuk().getText());
        warnet.setJamMasuk(formWarnet.getTxtJamMasuk().getText());
        warnet.setJamKeluar(formWarnet.getTxtJamKeluar().getText());
        warnet.setTarif(formWarnet.getTxtTarif().getText());
        warnetDao.save(warnet);
        JOptionPane.showMessageDialog(formWarnet, "Entri Data Ok!");
    }    
    
    public void deleteWarnet(){
        int index = formWarnet.getTblWarnet().getSelectedRow();
        warnetDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formWarnet, "Delete Ok!");
    }
    
    public void UpdateWarnet() {
        int index = formWarnet.getTblWarnet().getSelectedRow();
        warnet = warnetDao.getWarnet(index);
        warnet.setKode(formWarnet.getTxtKode().getText());
        warnet.setPelanggan(formWarnet.getCboPelanggan().getSelectedItem().toString().split("-")[0]);
        warnet.setJenisPelanggan(formWarnet.getCboJenisPelanggan().getSelectedItem().toString());
        warnet.setTanggalMasuk(formWarnet.getTxtTanggalMasuk().getText());
        warnet.setJamMasuk(formWarnet.getTxtJamMasuk().getText());
        warnet.setJamKeluar(formWarnet.getTxtJamKeluar().getText());
        warnet.setTarif(formWarnet.getTxtTarif().getText());
        warnetDao.update(index, warnet);
        javax.swing.JOptionPane.showMessageDialog(formWarnet, "Update Ok!");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = (DefaultTableModel) formWarnet.getTblWarnet().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Warnet> listWarnet = warnetDao.getAllWarnet();
        for(Warnet warnet : listWarnet){
            Object[] data={
                warnet.getKode(),
                warnet.getPelanggan(),
                warnet.getJenisPelanggan(),
                warnet.getTanggalMasuk(),
                warnet.getJamMasuk(),
                warnet.getJamKeluar(),
                warnet.getLama(),
                warnet.getTarif(),
                warnet.getTotal()
            };
            tabelModel.addRow(data);
        }
    }
}
