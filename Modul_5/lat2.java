/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JoptionPane;

/**
 *
 * @author susan
 */
import javax.swing.JOptionPane;

public class lat2 {
	
	public static void main (String[] args)
	{
		//input OptionPane1
	String name = "";
	name = JOptionPane.showInputDialog("Kalimat 1#");
	
		//input OptionPane2
	String nama = "";
	nama = JOptionPane.showInputDialog("Kalimat 2#");
	
		//input OptionPane3
	String namawa = "";
	namawa = JOptionPane.showInputDialog("Kalimat 3#");
	
	String msg = name +" "+ nama +" "+ namawa ;
	JOptionPane.showMessageDialog(null, msg);
		}	
}
