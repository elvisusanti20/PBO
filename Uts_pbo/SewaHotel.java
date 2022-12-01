import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class SewaHotel {
    public static void main(String[] args) throws IOException{
    
        HitungTarifHotel pesan=new HitungTarifHotel();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alamat;
        pesan.setKode(JOptionPane.showInputDialog("Masukan Kode Kamar"));

        boolean stt=true;
        while(stt){
            System.out.println("\nPilih Jenis Kamar\n1. Kamar Biasa Rp 600.000/hari\n2. Kamar Premium Rp 700.000/hari\nJenis kamar yang dipesan \t: ");;
                try {
                    pesan.setJenis(Integer.parseInt(br.readLine () ));
                } 
                catch (Exception e) {
                }
        if(pesan.getJenis()>3 || pesan.getJenis()<1){
                stt=true;
            //JOptionPane.showMessageDialog(null, "nak nginput seng tenanan", "Ojo ngawur gan", JOptionPane.ERROR_MESSAGE);
            System.out.println("Inputan salah silahkan ulangi lagi");
            }
        else 
            stt=false;
        }
        
        
        boolean stt2=true;
        while(stt2){
        //String status="status \n1. Member \n2. Non Member";
            System.out.println("status \n1. Member \n2. Non Member");
            try {
                //pesan.setStatus(Integer.parseInt(JOptionPane.showInputDialog(status)));
                pesan.setStatus(Integer.parseInt(br.readLine()));
            } 
            catch (Exception e) {
            }
        if(pesan.getStatus()>2 || pesan.getStatus()<1){
            stt2=true;
            //JOptionPane.showMessageDialog(null, "nak nginput seng tenanan", "Ojo ngawur gan", JOptionPane.ERROR_MESSAGE);
            System.out.println("Inputan salah silahkan ulangi lagi");
            }
        else 
            stt2=false;
        }
        
        
        
        //String lama="masukkan lama menginap (Hari)";
        System.out.println("Masukkan lama menginap : ");
        try {
            //pesan.setLama(Integer.parseInt(JOptionPane.showInputDialog(lama)));
            pesan.setLama(Integer.parseInt(br.readLine()));
        } 
        catch (Exception e) {
        }
        
        System.out.println("<==== Hasil Pemesanan =====>"+
        "\nJenis kamar \t: "+pesan.get_kamar()+
        "\nTarif \t\t :"+pesan.get_tarif()+
        "\nDiskon \t\t :"+pesan.get_diskon()+
        "\nKode           : "+pesan.getKode()+
        "\nTotal \t\t :"+pesan.get_bayar()
        
        );
    
    }
}