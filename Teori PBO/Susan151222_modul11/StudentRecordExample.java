/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Susan151222_modul11;

/**
 *
 * @author Lenovo
 */
public class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord annarecord = new StudentRecord();
        StudentRecord alirecord = new StudentRecord();
        
        
        annarecord.setName("Anna");
        annarecord.setAddress("Padang");
        annarecord.setAge(25);
        annarecord.setMathGrade(70);
        annarecord.setEnglishGrade(80);
        annarecord.setScienceGrade(80);
        
        alirecord.setName("Ali");
        alirecord.setAddress("Bukittinggi");
        alirecord.setAge(27);
        
        System.out.println("Nama            : "+annarecord.getName());
        System.out.println("Alamat          : "+annarecord.getAddress());
        System.out.println("Umur            : "+annarecord.getAge());
        System.out.println("Matematika      : "+annarecord.getMathGrade());
        System.out.println("B.inggris       : "+annarecord.getEnglishGrade());
        System.out.println("Pengetahuan     : "+annarecord.getScienceGrade());
        System.out.println("Rata - Rata     : "+annarecord.getAverage());
        
        System.out.println("\n");
        alirecord.print("");
        alirecord.print(90,80,70);
        
        //jumlah siswa
        System.out.println("\nJumlah Siswa    : "+annarecord.getStudentCount());
        
        
        
        
    }
    
}
