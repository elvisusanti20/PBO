/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package susan.controller;
import susan.model.Peminjaman;
import susan.model.*;
import java.util.*;
import susan.model.PeminjamanDao;
import susan.model.PeminjamanDaoImpl;
import susan.view.FormPeminjaman;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author susan
 */
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    private Peminjaman peminjaman;
    private PeminjamanDao peminjamanDao;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman=formPeminjaman;
        anggotaDao= new AnggotaDaoImpl();
        bukuDao= new BukuDaoImpl();
        peminjamanDao=new PeminjamanDaoImpl();
    }
    
    public void bersihForm(){
        formPeminjaman.getTxtTglPeminjaman().setText("");
        formPeminjaman.getTxtTglKembali().setText("");
    }
    
    public void setCboNobp(){
        formPeminjaman.getCboNobp().removeAllItems();
        List<Anggota> list= anggotaDao.getAll();
        for(Anggota anggota : list){
            formPeminjaman.getCboNobp().
                    addItem(anggota.getNobp()+"-"+anggota.getNama());
        } 
    }
    
    public void setCboKodeBuku(){
        formPeminjaman.getCboKodeBuku().removeAllItems();
        List<Buku> list= bukuDao.getAll();
        for(Buku buku : list){
            formPeminjaman.getCboKodeBuku().
                    addItem(buku.getKodeBuku());
        } 
    }
    
    public void save(){
        peminjaman=new Peminjaman();
        peminjaman.setNobp(formPeminjaman.getCboNobp()
                .getSelectedItem().toString().split("-")[0]);
        peminjaman.setKode(formPeminjaman.getCboKodeBuku()
                .getSelectedItem().toString());
        peminjaman.setTglpinjam(formPeminjaman.getTxtTglPeminjaman().getText());
        peminjaman.setTglkembali(formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.save(peminjaman);
        JOptionPane.showMessageDialog(formPeminjaman,"Entri Data Ok");
    }
    
    public void getPeminjaman(){
        int index=formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman=peminjamanDao.getPeminjaman(index);
        if(peminjaman!=null){
            List<Anggota> listAnggota=anggotaDao.getAll();
            for(Anggota anggota:listAnggota){
                if(peminjaman.getNobp()==anggota.getNobp()){
                    formPeminjaman.getCboNobp()
                    .setSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
                    break;
                }
            }
            formPeminjaman.getCboKodeBuku().setSelectedItem(peminjaman.getKode());
            formPeminjaman.getTxtTglPeminjaman().setText(peminjaman.getTglpinjam());
            formPeminjaman.getTxtTglKembali().setText(peminjaman.getTglkembali());
        }
    }
    
    public void update(){
        int index=formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman=peminjamanDao.getPeminjaman(index);
        peminjaman.setNobp(formPeminjaman.getCboNobp()
                .getSelectedItem().toString().split("-")[0]);
        peminjaman.setKode(formPeminjaman.getCboKodeBuku()
                .getSelectedItem().toString());
        peminjaman.setTglpinjam(formPeminjaman.getTxtTglPeminjaman().getText());
        peminjaman.setTglkembali(formPeminjaman.getTxtTglKembali().getText());
        peminjamanDao.update(index,peminjaman);
        JOptionPane.showMessageDialog(formPeminjaman,"Update Data Ok");
    }
    
    public void delete(){
        int index=formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(index);
        JOptionPane.showMessageDialog(formPeminjaman,"Delete Data Ok");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel=
                (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman>listPeminjaman=peminjamanDao.getAllPeminjaman();
        for(Peminjaman peminjaman : listPeminjaman){
            Object[] data={
                peminjaman.getNobp(),
                peminjaman.getKode(),
                peminjaman.getTglpinjam(),
                peminjaman.getTglkembali()
            };
            tabelModel.addRow(data);
        }
    }
}
