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
import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

public class lat1 {

public static void main (String[] args){

//enter word 1

BufferedReader dataIn = new BufferedReader ( new InputStreamReader(System.in));

String name = "";

System.out.print ("Kalimat 1 = ");

try {

name = dataIn.readLine();

}catch (IOException e){

System.out.println ("Error !");

}

//enter word 2

BufferedReader dataMasuk = new BufferedReader (new InputStreamReader(System.in));

String nama ="";

System.out.print ("Kalimat 2 = ");

try{

nama = dataMasuk.readLine();

}catch(IOException e){

System.out.println ("Error !");

}

//enter 3

BufferedReader dataMlebu = new BufferedReader (new InputStreamReader(System.in));

String namawa ="";

System.out.print("Kalmiat 3 = ");

try{

namawa = dataMlebu.readLine();

}catch(IOException e){

System.out.println ("Error !");

}

System.out.println (name +" "+ nama +" "+ namawa);

}

}


