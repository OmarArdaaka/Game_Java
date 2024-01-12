/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice_oop1;

/**
 *
 * @author SMK TELKOM 023
 */
public class Kucing_Run {
    public static void main(String[] args) {
        System.out.println("--- KUCING ---");
        
        kucing obj = new kucing();
        
        obj.energi=40;
        obj.happy=100;
        obj.jenis="Anggora";
        obj.speed=45;
        obj.nama= "Katty";
        
        obj.berlari();
        obj.power();
        obj.play();
        
                
    }
    
}
