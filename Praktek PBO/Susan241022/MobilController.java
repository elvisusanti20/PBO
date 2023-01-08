/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Susan241022;


public class MobilController {
    private Mobil model; 
    private MobilView view; 
    public MobilController(Mobil model, MobilView view){ 
	this.model = model; 
	this.view = view; 
    } 
    public void setMobilName(String name){ 
	model.setName(name); 
    } 
    public String getMobilName(){ 
	return model.getName(); 
    } 
    public void setMobilKode(String kode){ 
	model.setKode(kode); 
    } 
    public String getMobilKode(){ 
	return model.getKode(); 
    }
    public void setMobilWarna(String warna){ 
	model.setWarna(warna); 
    } 
    public String getMobilWarna(){ 
	return model.getWarna(); 
    }
    public void updateView(){ 
	view.printMobilDetails(model.getName(), model.getKode(), model.getWarna()); 
    }   
}
