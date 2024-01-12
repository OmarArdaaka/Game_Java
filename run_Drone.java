/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice_oop1;

/**
 *
 * @author SMK TELKOM 023
 */
public class run_Drone {
    public static void main(String[] args) {
        
    Drone dun = new Drone();
    dun.energi = 10;
    dun.ketinggian = 100;
    dun.kecepatan = 60;
    dun.merek = "Samsung";
    
    dun.terbang();
    dun.matikanMesin();
    dun.turun();
    dun.belok();
    dun.maju();
    dun.mundur();
    }
    
}
