/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice_oop1;


class kucing {
    int energi,happy,speed;
    String nama, jenis;
    
    void power (){
        if (energi < 50 ) {
            System.out.println("Energi : " + energi + " | Kucing bersemangat");
        }
        else 
            System.out.println("Kucing butuh istirahat");  
    }
    
    void berlari (){
        System.out.println("Kucing bernama " + nama);
        System.out.println("Berjenis " + jenis);
        if (speed < 10) {
            System.out.println("Sedang berjalan dengan kecepatan : " + speed + " km/h");
            
        }
        System.out.println("Sedang berlari dengan kecepatan : " + speed + " km/h");
    }
    
    void play (){
        if (happy > 70 ) {
            System.out.println("Tingkat kesenangan : " + happy + " | VERY HAPPY");  
        }
        else if(happy > 40 ){
            System.out.println("Tingkat kesenangan : " + happy + " | HAPPY");
        }
        else
            System.out.println("Tingkat kesenangan : " + happy + " | SAD");
    }
  
}



    

