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
public class StudentRecord {
    protected String name;
    protected String address;
    protected int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;
    
    public StudentRecord(){
        studentCount++;
    }
    
    public StudentRecord(String temp){
        this.name = temp;
        studentCount++;
    }
    
    public StudentRecord(String name, String address){
        this.name = name;
        this.address = address;
        studentCount++;
    }
    
    public StudentRecord(double MathGrade, double EnglishGrade, double ScienceGrade){
        mathGrade = MathGrade;
        englishGrade = EnglishGrade;
        scienceGrade = ScienceGrade;
        studentCount++;
        
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public double getMathGrade(){
        return mathGrade;
    }
    
    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    
    public double getEnglishGrade(){
        return englishGrade;
    }
    
    public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    
    public double getScienceGrade(){
        return scienceGrade;
    }
    
    public void setScienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    public double getAverage(){ 
        average = ( mathGrade + englishGrade + scienceGrade ) / 3; 
        return average; 
    }
    
    public static int getStudentCount(){ 
        return studentCount; 
    }
    
    public void print(String temp){
        System.out.println("Name            : "+name);
        System.out.println("Address         : "+address);
        System.out.println("Age             : "+age);
    }
    
    public void print(double MathGrade, double EnglishGrade, double ScienceGrade){
        System.out.println("Name            : "+name);
        System.out.println("Math Grade      : "+MathGrade);
        System.out.println("English Grade   : "+EnglishGrade);
        System.out.println("Science Grade   : "+ScienceGrade);
    }
}
